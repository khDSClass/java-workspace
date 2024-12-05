package kh.java.run;

import kh.java.func.DNSServer;
import kh.java.func.TcpServer;

public class Start {

	public static void main(String[] args) {
		DNSServer dns = new DNSServer();
		dns.server();
				
	}

}
