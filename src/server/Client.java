package server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
	public static void main(String[] args) {
		Socket socket = null;
		Scanner scanner = new Scanner(System.in);
		
		PrintWriter pw =null;
		InputStream inputStream = null;
		BufferedReader br=null;
		OutputStream outputStream = null;
		
		try {
			socket = new Socket("192.168.0.14",8000);
			
			System.out.println("클라이언트 접속 ");
			while(true) {
				inputStream=socket.getInputStream();
				outputStream = socket.getOutputStream();
				System.out.println("br 이전");
			br= new BufferedReader(new InputStreamReader(inputStream));
			pw = new PrintWriter(new OutputStreamWriter(outputStream));
			
			System.out.println("br 이후");
			
			String data = "클라이언트에서 보내는 메세지"; 
				//	scanner.nextLine();
//			if("exit".equals(data)) {
//				break;
//			}
			System.out.println(data);
			pw.println(data);
			System.out.println("printlnㅇㅣ후");
			data = br.readLine();
			
			System.out.println(data);

   			pw.close();
			br.close();
			}
		}catch (Exception e) {
			e.printStackTrace();
		} finally {
            try {
                if (socket != null && !socket.isClosed()) {
 
                    socket.close();
                    System.out.println("소켓종료");
                }
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
		}
		scanner.close();
	}
}