package file_InputOutput;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;


public class Ex03 {

	public static void main(String[] args) throws Exception {
		File filePath = new File("C:/JAVA_seohee/java-workspace (수업)/test/aa3.txt");
		FileOutputStream fos = new FileOutputStream(filePath);
		//보조스트림. 또 하나의 보조 공간을 만들고 자기 자신의 공간에 하나씩 누적. 공간에 저장해서 안보였다가
		//누적된 값을 외부에 있는 파일에 한방에 접속.
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		

		for(char i = '1'; i < '9'; i++) {
			Thread.sleep(1000);
//			fos.write(i); //한 번에 한개씩 처리. 파일에 직접적으로 접근.
			bos.write(i);
	
		}
//		bos.flush(); //bos에 저장된 값을 비우기.
		bos.close(); //접속 끊김. 다시 쓸 수 없음.
		bos.write('a'); //다시 쓰고
		bos.flush(); //다시 비우지만 close와 다르게 접속은 유지.
	}
}
