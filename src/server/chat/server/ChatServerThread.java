package server.chat.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.SocketException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import server.chat.util.ChatUtilPackage;

public class ChatServerThread implements Runnable {

	Socket socket = null;

	BufferedReader reader = null;
	PrintWriter writer = null;
	InputStream inputStream = null;
	OutputStream outputStream = null;

	Scanner scanner = new Scanner(System.in);
	String msg = null;
	HashMap<String, PrintWriter> user = null;
	String userId=null;
	
	public ChatServerThread() {
	}
	
	public ChatServerThread(HashMap<String, PrintWriter> user, Socket socket) {
		try {
			this.user = user;
			
			inputStream = socket.getInputStream();
			outputStream = socket.getOutputStream();

			reader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
			writer = new PrintWriter(outputStream,true);
			
			userId=reader.readLine();
			
			System.out.println(userId+"님이 접속하셨습니다 !");
			chatting(userId+" 님이 접속했습니다.");
			
			synchronized (this.user) {
				this.user.put(userId, writer);
			}
			
			
		} catch (Exception e) {
			System.out.println("ServerThread 생성자 : 예상치 못한 오류 발생");
		}
	}
	
	public void chatting(String msg) {
		synchronized (msg) {
			try {
				for( PrintWriter writer : user.values()) {
					writer.println(msg);
					writer.flush();
				}
			}catch(Exception e) {
				System.out.println("여기는 chatting() 예상치 못한 오류 발생");
			}
		}
	}
	
	@Override
	public void run() {

		try {
			
			while ( ( msg = reader.readLine() ) != null) {
				if(msg.equals("/quit")) {
					synchronized (user) {
						user.remove(userId);
					}
				}else {
				System.out.println(userId +" : "+msg);
				chatting(userId+" : "+msg);
				}
			}
		}catch(SocketException e) {
			System.err.println("server :  "+userId+"님이 나갔습니다.");
		}catch (IOException e) {
			System.out.println("IOException 발생");
			e.printStackTrace();
		}finally {
			synchronized (user) {
				user.remove(userId);
			}
			chatting(userId+"님이 퇴장했습니다.");
			System.out.println(userId+"님이 퇴장했습니다.");
			
			try {
				if(socket != null)
			ChatUtilPackage.resourceClose(reader,writer,socket);
			}catch (Exception e) {
				System.out.println("예상치 못한 오류 발생.");
				e.printStackTrace();
			}
		}
	}
}
