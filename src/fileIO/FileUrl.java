package fileIO;

import java.io.File;

public class FileUrl {
	public static void main(String[] args) {
			
//        File file = new File(".");
//        String rootPath = file.getAbsolutePath();
//        System.out.println("���� ������Ʈ�� ��� : "+rootPath );

		String rootPath = System.getProperty("user.dir");
        System.out.println("���� ������Ʈ�� ��� : "+rootPath );


	}
}
