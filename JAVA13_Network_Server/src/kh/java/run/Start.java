package kh.java.run;

import kh.java.func.TcpServer;

public class Start {

	public static void main(String[] args) {
		TcpServer ts = new TcpServer();
		ts.server();
	}

}
