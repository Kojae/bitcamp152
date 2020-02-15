package server.chat.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.SocketException;
import java.util.Scanner;

import server.chat.util.ChatUtilPackage;

public class ChatClient {
	static final int port = 5000;
	static final String serverIp = "27.35.67.215";
	
	Socket socket = null;
	BufferedReader reader = null;
	PrintWriter writer = null;
	Scanner scanner = new Scanner(System.in);
	String userId = null;

	public ChatClient() {	}
	
	public ChatClient(String id) {
		this.userId = id;
		try {
			socket = new Socket(serverIp, port);					// 클라이언트는 서버의 ip와 포트를 몰라도 되므로 static final로 처리
			System.out.println(userId+"님 환영합니다.");
			
			reader = new BufferedReader(new InputStreamReader(socket.getInputStream(), "UTF-8"));
			writer = new PrintWriter(socket.getOutputStream(),true);
			BufferedReader keyborad = new BufferedReader(new InputStreamReader(System.in, "UTF-8"));
			
			writer.println(userId);
			writer.flush();
			
			Runnable client = new ChatClientThread(socket, reader);
			Thread thread = new Thread (client , userId);
			
			thread.start();
			
			String msg = null;
			
			while ( ( msg = keyborad.readLine() ) !=null) {
				
				writer.println(msg);
				if(msg.equals("/quit")) {
					break;
				}
			}
			System.out.println("채팅종료");
			System.exit(0);

		}catch (IOException e) {
		}finally {
			
			try {
				socket.close();
				ChatUtilPackage.resourceClose(reader,writer);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
