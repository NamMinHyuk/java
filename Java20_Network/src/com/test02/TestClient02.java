package com.test02;

import java.io.*;
import java.net.Socket;

public class TestClient02 implements Runnable {

	@Override 
	public void run() { 
		try{
			Socket clientSocket; 
			PrintWriter out = null; 
			BufferedReader in = null; 
			BufferedReader stdin = null; 
			
			System.out.println("server에 접속합니다...");
			clientSocket = new Socket("localhost",9999); 
			
			// 출력 (클라이언트에서 서버로)
			out = new PrintWriter(clientSocket.getOutputStream(),true); // clientSocket에서 얻어온 write를 out 객체에 넣음. true는 한줄마다 새로고침해줌 
			// 입력 (서버에서 클라이언트로)
			in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));	
			// 입력 (console에서 code로)
			stdin = new BufferedReader(new InputStreamReader(System.in)); //console창에 치는걸 buffer객체(stdin)에 넣음
			
			String inputLine;
			while((inputLine = stdin.readLine()) != null){ //버퍼에 받아온걸 한줄씩 읽어와서 inputLine에 넣어준게 null이 아니라면 반복문이 돈다.
				out.println(inputLine); // 
				System.out.println("server로부터 다시 받은 메시지 :" + in.readLine());
			}
			
			out.close();
			in.close();
			stdin.close();
			clientSocket.close();
			
			System.out.println("소켓을 닫는다...");
			
		}catch(IOException e){ //예외 처리 IO 최상위
		}
	}
	
	public static void main(String[] args) throws Exception{
		Thread t1 = new Thread(new TestClient02()); // thread 기능을 쓰려고
		t1.start();
	}
}
