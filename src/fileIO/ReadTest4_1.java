package fileIO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class ReadTest4_1 {
	public static void main(String[] args) throws IOException {
		String pathName = "D:/java_data/1234.txt";
		File txtFile = new File(pathName);
		
		String outPath = "D:/java_out/1234.txt";
		File saveFile = new File(outPath);
		
		String rootPath = System.getProperty("user.dir");
		File rootFile = new File(rootPath+"/upload/1234.txt");
		
		if( txtFile.exists()) {
			System.out.println("존재");
			if(txtFile.isFile()) {
				System.out.println("파일이군");
				
				FileReader fileReader = null;
				BufferedReader reader = null;
				BufferedWriter fw = null;
				
				try {
					reader = new BufferedReader(
								new InputStreamReader(
										new FileInputStream(txtFile),"UTF-8"));
					 fw = new BufferedWriter(
							 	new OutputStreamWriter(  
							 			new FileOutputStream(rootFile), "UTF-8"));
					//fw = new BufferedWriter(new FileWriter(saveFile));
					
					String dataStr=null;
					fw.write("-------------2020.02.11 과제 : 고재현 ----------\n");
					fw.write("-------------이곳은 현재프로젝트 upload폴더 안 ----------\n");
					while( (dataStr = reader.readLine()) != null) {
						System.out.println(dataStr+"   ");
						fw.write(dataStr+"\n");
						//System.out.println(reader.readLine());
					}
				} catch (FileNotFoundException e) {
					
					e.printStackTrace();
				} catch (Exception e ) {
					
				}finally {
					if(fileReader != null) {
						fileReader.close();
					}
					fw.close();
				}
				
			}else {
				System.out.println("폴더군");				
			}
		}else {
			System.out.println("노존재");
		}
	}
}
