package file_InputOutput;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Ex02 {

	public static void main(String[] args) throws Exception {
		File filePath = new File("C:/JAVA_seohee/java-workspace (수업)/test/aa2.txt");
		FileInputStream fis = new FileInputStream(filePath);
		while(true) {
			int res = fis.read(); //read는 결과 값을 Int로 받아옴. 파일에 있는 내용을 하나씩 가져옴.  res는 파일의 끝.
			if(res < 0) { //파일의 끝에 -1. 더이상 내용이 없는 것을 의미.
				System.out.println("res : " + res);
				break;
			}
			System.out.println((char)res);
		}
	}
	
}
