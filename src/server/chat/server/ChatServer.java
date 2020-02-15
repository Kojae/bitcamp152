package server.chat.server;

import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.util.HashMap;
import java.util.Map;

public class ChatServer{
	
	final static int serverPort = 5000;
	ServerSocket serverSocket = null;
	Socket socket = null;
	HashMap<String, PrintWriter> user = null;
	
	public ChatServer() {
		
		try {
			serverSocket = new ServerSocket(serverPort);
			System.out.println("서버생성");
			user = new HashMap<String, PrintWriter>();
			
			while(true) {
				socket = serverSocket.accept();
				
				Runnable chatThread = new ChatServerThread(user,socket);
				Thread thread = new Thread (chatThread);
				
				thread.start();
				
			}
		}catch(SocketException e) {
				System.out.println("소켓이 일방적인 끊김");
		}catch (Exception e) {
				System.out.println("server에서 알수없는 오류남");
		}finally {
			if(serverSocket != null) {
			System.out.println("서버 끝났는데.. 우케닫지..");
			}
		}
		
	}
}