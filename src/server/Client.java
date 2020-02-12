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
		String data = null;
		String abc= null;
		
		try {
			socket = new Socket("27.35.64.174",5000);
			System.out.println("클라이언트 접속와 ");
			
			inputStream=socket.getInputStream();
			outputStream = socket.getOutputStream();
			
			BufferedReader getReader = new BufferedReader(new InputStreamReader(System.in)); 
			br= new BufferedReader(new InputStreamReader(inputStream));
			pw = new PrintWriter(outputStream,true);
			
			while(  (data = getReader.readLine() ) != null ) {
				pw.println(data);
				pw.flush();
				
				if( (abc = br.readLine()) != null) {
					System.out.println("server : "+abc);
				}
				if(abc.equals("exit")) {
					System.out.println("//////////채팅을 종료합니다////////");
					break;
				}
			}
			
			pw.close();
			br.close();
			getReader.close();
			socket.close();
		}catch (Exception e) {
			e.printStackTrace();
		} finally {
        
                System.out.println("클라이언트 종료");
           
		}
		scanner.close();
	}
}