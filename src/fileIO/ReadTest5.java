package fileIO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintStream;

public class ReadTest5 {
	public static void main(String[] args) throws IOException {
		String pathName="C:/work_space/text.txt";
		String pathName2="C:/work_space/clone.txt";
		
		File textFile=new File(pathName);
		File saveFile = new File(pathName2);
		
		BufferedReader reader = new BufferedReader(
								new InputStreamReader(
								new FileInputStream(textFile),"UTF-8"));
//		BufferedReader reader = new BufferedReader(new FileReader(textFile));
		
		BufferedWriter writer = new BufferedWriter(
			 					new OutputStreamWriter(  
			 					new FileOutputStream(saveFile), "UTF-8"));
//		PrintStream out = new PrintStream(saveFile);
//		BufferedWriter fw = new BufferedWriter(new FileWriter(saveFile));
		
//		↑ 주석처리 한 것처럼 다양하게 read,write 할 수 있지만 charset을 parameter로 받지 않아 서
//		기본 encoding을 한다. 그래서 StreamReader/writer을 써서 charset을 명시해줘야 한다.		
		String str= null;
		while ( (str = reader.readLine()) != null ) {
			System.out.println(str);
			writer.write(str);
		}
		reader.close();
		writer.close();
		
	}
}
