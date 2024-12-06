package kh.java.func;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class BaseballClient {
	public void client() {
		Scanner sc = new Scanner(System.in);
		String serverIp = "127.0.0.1";
		int serverPort = 8989;
		
		Socket socket = null;
		DataInputStream dis = null;
		DataOutputStream dos = null;
		
		try {
			socket = new Socket(serverIp, serverPort);
			System.out.println("<<<<< Baseball Game >>>>>");
			
			InputStream in = socket.getInputStream();
			OutputStream out = socket.getOutputStream();			
			dis = new DataInputStream(in);
			dos = new DataOutputStream(out);
			System.out.println("로딩중...........");
			int check = dis.readInt();
			if(check == 1) {
				System.out.println("<<<<< Game Start >>>>>");
				int count = 0;
				while(true) {					
					for(int i=0;i<3;i++) {
						System.out.print((i+1)+"번째 숫자 입력 : ");
						int num = sc.nextInt();
						dos.writeInt(num);
					}
					count++;
					String result = dis.readUTF();
					System.out.println(count+"회 ------>"+result);
					if(result.equals("3스트라이크")) {
						System.out.println("축하합니다.");
						break;
					}else if(count == 10) {
						break;
					}
				}
			}
			
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				socket.close();
				dis.close();
				dos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}








