package kh.java.func;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class UdpClient {
	public void client() {
		//1. 서버포트지정
		int serverPort = 8888;
		//자원반환할 객체 미리 선언
		DatagramSocket socket = null;
		
		try {
			//2. DatagramSocket객체 생성
			socket = new DatagramSocket();//클라이언트는 포트열고 요청을 기다리는게아니므로 포트번호를 생성자에 추가하지 않음
			//전송할 데이터 생성
			String msg = "난 UDP 클라이언트야";
			byte[] outMsg = msg.getBytes();//문자열을 전송할 형태(byte[])로 변환
			//서버아이피주소를 문자열이아닌 InetAddress형태로 만들어야 함
			InetAddress serverIp = InetAddress.getByName("127.0.0.1");
			DatagramPacket outPacket = new DatagramPacket(outMsg, outMsg.length,serverIp,serverPort);
			//서버로 데이터 전송
			socket.send(outPacket);
			System.out.println("데이터 전송 완료");
			byte[] inMsg = new byte[1024];
			DatagramPacket inPacket = new DatagramPacket(inMsg, inMsg.length);
			socket.receive(inPacket);
			String serverMsg = new String(inMsg).trim();
			System.out.println(serverMsg);
			
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			socket.close();
		}
	}
}
