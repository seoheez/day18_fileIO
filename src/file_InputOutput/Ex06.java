package file_InputOutput;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Ex06 {
	public static void main(String[] args) throws Exception {
		File filePath = new File("C:/JAVA_seohee/java-workspace (수업)/test/aa5.txt");
		FileInputStream fis = new FileInputStream(filePath);
		BufferedInputStream bis = new BufferedInputStream(fis);
		ObjectInputStream ois = new ObjectInputStream(bis);
		
		ExTest05 t = (ExTest05)ois.readObject(); //object타입으로 가져오기 때문에 형 변환 필요함.
		t.print(); //Ex05에서 작성한 내용이 출력됨.
	}
	
}
