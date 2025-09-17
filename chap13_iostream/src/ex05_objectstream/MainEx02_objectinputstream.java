package ex05_objectstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
/*
 * object.ser 파일에 저장된 Customer 객체를 복원 예제
 */
public class MainEx02_objectinputstream {
	public static void main(String[] args) 
			                throws IOException, ClassNotFoundException {
		ObjectInputStream ois = new ObjectInputStream
				(new FileInputStream("object.ser"));
		Customer c1 = (Customer)ois.readObject();
		Customer c2 = (Customer)ois.readObject();
//		Object c1 = ois.readObject(); //Object 형으로 리턴
//		Object c2 = ois.readObject();
		System.out.println(c1.toString());
		System.out.println(c2);
	}
}
