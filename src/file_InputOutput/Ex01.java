package file_InputOutput;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) throws Exception { 

		File filePath = new File("C:/JAVA_seohee/java-workspace (수업)/test/aa1.txt");
		FileOutputStream fos = new FileOutputStream(filePath, true);//true 기존내용 유지됨. 이어서 적기
		
		fos.write(100); //a
		fos.write('E'); 
		
		String name = "반갑다\n";
		fos.write(name.getBytes()); //Byte 형태로만 받기 때문에 String은 오류. 변환해야 함.
		
		
		Scanner input = new Scanner(System.in); 
		name = input.next();
		String age = input.next();
		String addr = input.next();
		name+="\n";
		age+="\n";
 		fos.write(name.getBytes());
		fos.write(age.getBytes());
		fos.write(addr.getBytes());
		System.out.println("------------");
		
	}

}
