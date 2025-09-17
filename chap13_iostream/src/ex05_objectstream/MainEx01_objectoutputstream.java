package ex05_objectstream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
/*
 * ObjectOutputStream
 * 1. 객체를 외부로 전송할 수 있는 스트림
 * 2. 외부 전송이 가능한 객체는 반드시 Serializable인터페이스를 구현해야함. 
 *    => 객체의 직렬화라 한다.
 *    => Serializable인터페이스를 구현하지 않은 객체를 외부 전송시 
 *        NotSerializableException 예외 발생함
 * 3. ObjectInputStream 객체를 이용하여 전송된 객체를 읽을 수 있음       
 */
public class MainEx01_objectoutputstream {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("object.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		Customer c1 = new Customer("홍길동",20);
		Customer c2 = new Customer("김삿갓",30);
		System.out.println(c1);
		System.out.println(c2);
		oos.writeObject(c1); //object.ser 파일로 c1 객체 전송. 저장
		oos.writeObject(c2); //object.ser 파일로 c2 객체 전송. 저장
		oos.close();
	}
}
