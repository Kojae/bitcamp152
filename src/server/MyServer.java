package server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class MyServer {
		public static void main(String[] args) {
			ServerSocket serverSocket  = null;
			Socket socket =null;
			Scanner scanner = new Scanner(System.in);
			
			BufferedReader br = null;
			PrintWriter pw = null;
			InputStream inputStream = null;
			OutputStream outputStream = null;
			String buffer =null;
			try {
				
				serverSocket = new ServerSocket(5000);
				System.out.println("서버 start");
				
				
				socket = serverSocket.accept();
				System.out.println("클라이언트 연결됨 ");

				
				inputStream = socket.getInputStream();
				outputStream = socket.getOutputStream();
				
				br= new BufferedReader(new InputStreamReader(inputStream,"UTF-8"));
				pw = new PrintWriter(new OutputStreamWriter(outputStream,"UTF-8"));
				
				
				while( ( buffer = br.readLine() ) != null) {
					System.out.println("client : "+ buffer);
					pw.println(scanner.nextLine());
					pw.flush();					
					
					if(buffer.equals("exit")) {
						System.out.println("//////////채팅을 종료합니다////////");
						break;
					}
				}
				socket.close();
				pw.close();
				br.close();
				
			}catch (Exception e) {
				e.printStackTrace();
			}finally {
				scanner.close();					
				}
			}
			
			
		}

