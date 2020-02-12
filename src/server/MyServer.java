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
			try {
				
				serverSocket = new ServerSocket(8000);
				System.out.println("서버 start");
				
				
				
				while(true) {
					socket = serverSocket.accept();
					System.out.println("클라이언트 연결됨 ");
					inputStream = socket.getInputStream();
					outputStream=socket.getOutputStream();
					System.out.println("server : pw 이전");
					br= new BufferedReader(new InputStreamReader(inputStream));
					pw = new PrintWriter(new OutputStreamWriter(outputStream));
					System.out.println("server : pw 이후");
					//System.out.println("클라이언트 :  "+br.readLine());
					
				//	   String buffer = null;
		               String buffer = br.readLine(); // Blocking
		                
//		                if (buffer == null) {
//		 
//		                    // 정상종료 : remote socket close()
//		                    // 메소드를 통해서 정상적으로 소켓을 닫은 경우
//		                    System.out.println("[server] closed by client");
//		                    break;
//		 
//		                }
		 
		                System.out.println("[server] recived : " + buffer);
		                pw.println(buffer);
					
					
					
					pw.println(buffer);
					
					br.close();
					pw.close();
				}
				
			}catch (Exception e) {
				e.printStackTrace();
			}finally {
				
					try {
						if(!(serverSocket.isClosed() && serverSocket == null) ) {
						
						serverSocket.close();
						System.out.println("서버 끝");
						}
					}catch (IOException e) {
						e.printStackTrace();
					}
				}
			scanner.close();
			}
			
			
		}

