package kh.java.func;

import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class FileClient {
	public void client() {
		Scanner sc = new Scanner(System.in);
		//1. 서버 아이피/포트지정
		String serverIp = "127.0.0.1";//루프백 아이피(내컴퓨터 자신을 호출하는 아이피)
		int serverPort = 9999;
		//반환할 객체 미리 선언
		Socket socket = null;
		DataInputStream dis = null;
		DataOutputStream dos = null;
		BufferedOutputStream bos = null;
		try {
			//2. 소켓객체생성(서버에 접속)
			socket = new Socket(serverIp, serverPort);
			System.out.println("파일 서버 접속 완료");
			//3. 데이터 주고받을 스트림 추출
			InputStream in = socket.getInputStream();
			OutputStream out = socket.getOutputStream();
			//4. 보조스트림으로 성능/기능 개선
			dis = new DataInputStream(in);
			dos = new DataOutputStream(out);
			//파일의 숫자를 먼저 받음(파일이름을 몇개 받아서 출력할 지 알 수 있도록)
			int fileCount = dis.readInt();
			for(int i=0;i<fileCount;i++) {
				String filename = dis.readUTF();
				System.out.println(filename);
			}
			System.out.print("다운로드 할 파일 이름 입력 : ");
			String filename = sc.nextLine();
			//다운로드할 파일명을 서버에 요청
			dos.writeUTF(filename);
			
			//서버가 파일의 크기를 전송한걸 먼저받음
			//-> 해당크기로 메모리 공간 확보해두려고
			int fileSize = dis.readInt();
			//다운로드할 파일 크기만큼 메모리공간 확보
			byte[] fileContent = new byte[fileSize];
			//서버가 전송해주는 파일 받기
			
			dis.readFully(fileContent);
			//받은파일을 클라이언트 프로그램외부로 내보내기
			FileOutputStream fos = new FileOutputStream(filename);
			bos = new BufferedOutputStream(fos);
			
			bos.write(fileContent);
			bos.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				socket.close();
				dis.close();
				dos.close();
				bos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}








