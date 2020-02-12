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
		String pathName="D:/java_data/1234.txt";
		String pathName2="D:/java_out/987.txt";
		
		File textFile=new File(pathName);
		File saveFile = new File(pathName2);
//		BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(textFile),"UTF-8"));
		BufferedReader reader = new BufferedReader(new FileReader(textFile));
		//PrintStream out = new PrintStream(pathName2);
		BufferedWriter fw = new BufferedWriter(new FileWriter(saveFile));
//		BufferedWriter fw = new BufferedWriter(
//				 	new OutputStreamWriter(  
//				 			new FileOutputStream(saveFile), "UTF-8"));
		
		String str = null;
		while ( (str = reader.readLine()) != null ) {
			System.out.println(str);
			fw.write(str);
		}
		reader.close();
		fw.close();
		
	}
}
