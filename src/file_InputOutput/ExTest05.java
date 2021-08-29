package file_InputOutput;

import java.io.Serializable;

public class ExTest05 implements Serializable{ //직렬화 시켜줌.
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void print() {
		System.out.println("name : " + name);
	}
		
	
	
}
