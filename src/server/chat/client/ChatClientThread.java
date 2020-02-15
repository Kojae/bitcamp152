package server.chat.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.net.Socket;

public class ChatClientThread implements Runnable{
	private Socket socket = null;
	private BufferedReader reader = null;
	
	public ChatClientThread() {
	}
	
	public ChatClientThread(Socket socket, BufferedReader reader) {
		this.socket = socket;
		this.reader = reader;
	}

	@Override
	public void run() {
		
		try {
			String msg = null;
			while( ( msg = reader.readLine() ) != null ) {
				System.out.println(msg);
			}
				
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			
				try {
					if(reader != null ) 
						reader.close();
					if(socket != null) 
						socket.close();
				} catch (IOException e) {
					e.printStackTrace();
				
			}
		}
		
	}
}
