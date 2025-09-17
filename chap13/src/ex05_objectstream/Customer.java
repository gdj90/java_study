package ex05_objectstream;

import java.io.Serializable;
//Serializable : 멤버가 없다
//Serializable 인터페이스의 구현 클래스만 객체를 외부로 전송가능
public class Customer implements Serializable{
	/**
	 * serialVersionUID : 직렬화된 객체의 버전 번호
	 * 역직렬화(직렬화된 객체 복원)될때 버전번호 검증. 일치하지 않으면 오류 발생
	 * 설정해 주지 않으면 경고발생. 컴파일러가 자동으로 생성함 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	//transient : 직렬화시 제외되는 필드 설정.
	private transient int age;
	public Customer(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return name + "," + age;
	}
}
