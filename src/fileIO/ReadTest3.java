package fileIO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadTest3 {
	public static void main(String[] args) throws IOException {
		String pathName = "D:/java_data/1234.txt";
		File txtFile = new File(pathName);
		
		if( txtFile.exists()) {
			System.out.println("존재");
			if(txtFile.isFile()) {
				System.out.println("파일이군");
				FileReader fileReader = null;
				BufferedReader reader = null;
				try {
					fileReader = new FileReader(txtFile);
					reader = new BufferedReader(fileReader);
					int data = -1;
					while( ( data = fileReader.read() ) != -1) {
						System.out.println((char)data);
						reader.readLine();
						System.out.println(reader.readLine());	
					}
					String dataStr=null;
					while( (dataStr = reader.readLine()) != null) {
						System.out.println(dataStr+"   ");
					}
					System.out.println(reader.readLine());
				} catch (FileNotFoundException e) {
					
					e.printStackTrace();
					
					return;
				} catch (Exception e ) {
					
				}finally {
					if(fileReader != null) {
						fileReader.close();
					}
				}
				
			}else {
				System.out.println("폴더군");				
			}
		}else {
			System.out.println("노존재");
		}
	}
}
