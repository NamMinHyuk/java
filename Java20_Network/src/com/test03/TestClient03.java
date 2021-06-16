package com.test03;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.Arrays;

public class TestClient03 {
	
	public static void main(String[] args) throws Exception {
		
		// 클라이언트 생성(포트번호 없으면 클라이언트)
		DatagramSocket ds = new DatagramSocket();
		System.out.println("클라이언트 입니다.");
		
		// 보낼 데이터
		byte[] buff = "연습입니다.".getBytes();
		
		// packet으로 감싼다. (데이터, 데이터 크기, 주소, 포트)
		DatagramPacket sendP = new DatagramPacket(buff, buff.length,InetAddress.getByName("localhost"),8888);
		
		// packet 보낸다.
		ds.send(sendP);
		
		ds.close();
		ds.disconnect();
	}

}
