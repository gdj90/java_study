package ex01_interface;
/*
 * 인터페이스의 default, static 메서드
 *  - java8 이후에 추가된 내용. 
 *  - 인터페이스에서 구현부가 존재하는 메서드
 *  - default 메서드 => 인스턴스 멤버.(객체화 필요) 
 *  - static 메서드 => 클래스멤버.(인터페이스명.멤버명) 호출
 *  - 다중 구현이 가능
 *     추상메서드가 중복 => 한개만 구현
 *     default 메서드 중복 => 오버라이딩 필요
 *     default 메서드 중복이 안된경우 => 오버라이딩 필요없음. 오버라이딩 가능
 *     static 메서드 중복 => 상관없음.      
 */
interface MyInterface1 {
	void method();
	default void defaultMethod() {
		System.out.println("MyInterface1의 default 메서드 : defaultMethod()");
	}
	static void staticMethod() {
		System.out.println("MyInterface1의 static 메서드 : staticMethod()");
	}
}
interface MyInterface2 {
	void method();
	default void defaultMethod() {
		System.out.println("MyInterface2의 default 메서드 : defaultMethod()");
	}
	static void staticMethod() {
		System.out.println("MyInterface2의 static 메서드 : staticMethod()");
	}
}
class Parent {
	public void pmethod() {
		System.out.println("Parent 클래스의 멤버 메서드:pmethod()");
	}
}
class Child extends Parent implements MyInterface1, MyInterface2 {
	public void method() {
		System.out.println("Child 클래스의 멤버 메서드:method() 오버라이딩");
	}
	public void defaultMethod() {
		System.out.println("Child에서 오버라이딩된 default 메서드 : defaultMethod()");
	}
}
public class MainEx05 {
	public static void main(String[] args) {
		Child c = new Child();
		c.method();
		c.pmethod();
		c.defaultMethod();
//		MyInterface1.defaultMethod(); //참조변수명.defaultMethod메서드 호출
//		c.staticMethod();
		MyInterface1.staticMethod();
		MyInterface2.staticMethod();
//		Child.staticMethod();
		MyInterface1 m1 = c;
		MyInterface2 m2 = c;
		m1.method();
		m2.method();
//		m1.staticMethod();
	}

}
