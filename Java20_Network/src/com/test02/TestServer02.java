package com.test02;

import java.io.*;
import java.net.*;

// TCP
public class TestServer02 {
	public static void main(String[] args) {
		ServerSocket serverSocket = null;		// 서버
		Socket serviceSocket;					// 접속될 클라이언트
		PrintWriter out = null;					// 출력 객체 (서버에서 클라이언트로)
		BufferedReader in = null;				// 입력 객체 (클라이언트에서 서버로)
		
		try {
			serverSocket = new ServerSocket(9999); 
		} catch (IOException e) { 
		}
		
		while(true){
			System.out.println("client를 기다립니다...");
			try {
				serviceSocket = serverSocket.accept();
				System.out.println("client가 접속했습니다...");
				
				// 클라이언트한테서 받은 내용을 라인단위로 읽을 거다.
				// in.readLine()
				// 하나씩 오는걸 여러개로 받기 위해 buffer로 넣음
				in = new BufferedReader(new InputStreamReader(serviceSocket.getInputStream()));
				
				// 클라이언트에게 보낼거야. 
				out = new PrintWriter(serviceSocket.getOutputStream(),true);
				
				String inputLine;
				while((inputLine = in.readLine()) != null){
					System.out.println("client가 보낸 메시지 : " + inputLine);
					out.println(inputLine);
				}
				
				out.close();
				in.close();
				serviceSocket.close();
				serverSocket.close();
				
				System.out.println("client에 데이터 전송했습니다...");
				
			} catch (IOException e) {
			}
		}
	}
}
