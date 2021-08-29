package file_InputOutput;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) throws Exception {
		
		File filePath = new File("C:/JAVA_seohee/java-workspace (수업)/test/aa5.txt");
		FileOutputStream fos = new FileOutputStream(filePath);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		ObjectOutputStream oos = new ObjectOutputStream(bos);//객체를 저장하기 위한 스트림.
		
		Scanner input = new Scanner(System.in);
		System.out.println("이름 입력: ");
		String name = input.next();
		
		ExTest05 t = new ExTest05();//객체 저장
		t.setName(name);
		
		oos.writeObject(t);
		oos.close();
		
		//파일에 객체 자체를 넣는건 불가능. 자바로 만든 객체를 Byte로 변환해서 저장해야 함.
	}
}
