package server.chat.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

public class ChatUtilPackage {
	public ChatUtilPackage() {}
	
	public static void resourceClose(BufferedReader reader, PrintWriter writer) {
		try {
			if(reader != null)
				reader.close();
			if(writer != null)
				writer.close();
		} catch (IOException e) {
			System.err.println("문제가 생겨서 자원을 받납받을 수가 없습니다 ");
		}finally {
			System.out.println("자원반납 완료");
		}
	}
	
	public static void resourceClose(BufferedReader reader, PrintWriter writer,Socket socket) {
		try {
			ChatUtilPackage.resourceClose(reader, writer);
			if(socket != null)
				socket.close();
		} catch (IOException e) {
			System.err.println("문제가 생겨서 자원을 받납받을 수가 없습니다 ");
		}finally {
			System.out.println("자원반납 완료");
		}
	}
}

