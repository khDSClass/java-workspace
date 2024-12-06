package kh.java.run;

import kh.java.func.DNSServer;
import kh.java.func.FileServer;
import kh.java.func.TcpServer;
import kh.java.func.UdpServer;

public class Start {

	public static void main(String[] args) {
		UdpServer us = new UdpServer();
		us.server();
				
	}

}
