package file_InputOutput;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Ex04 {
	public static void main(String[] args) throws Exception {

		File filePath = new File("C:/JAVA_seohee/java-workspace (수업)/test/aa4.txt");
		FileOutputStream fos = new FileOutputStream(filePath);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		DataOutputStream dos = new DataOutputStream(bos); //좀 더 없그레이드 된 보조스트림. 다양한 기능 사용 가능.
		
		String str = "Test";
		StringBuffer sb = new StringBuffer();
		sb.append("abcd");
		sb.append("111");
		str += "aaa";
		System.out.println(str);
		System.out.println(sb);
		
		dos.writeUTF("김개똥");
		dos.writeInt(100);
		
		dos.close();
		
		FileInputStream fis = new FileInputStream(filePath);
		BufferedInputStream bis = new BufferedInputStream(fis);
		DataInputStream dis = new DataInputStream(bis);
		String name = dis.readUTF();
		int num = dis.readInt();
		System.out.println("name : " + name);
		System.out.println("num : " + num);
		
				
	}
}
