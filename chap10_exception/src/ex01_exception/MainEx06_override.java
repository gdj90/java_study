package ex01_exception;

import java.io.IOException;

/*
 * 오버라이딩에서의 예외처리 : 부모 메서드와 같거나, 좁은 범위만 가능함 
 * Exception > ClassNotFoundException => 좁은 범위만 가능함
 * Exception > ClassNotFoundException,IOException => 좁은 범위만 가능함
 * RuntimeException 은 가능하다
 */
class Parent {
//	public void method() throws ClassNotFoundException,IOException {
	public void method() throws NumberFormatException {
		System.out.println("Parent 클래스의 method");
	}
}
class Child extends Parent{
	public void method() throws RuntimeException {
		System.out.println("Child 클래스의 method");
	}
}
public class MainEx06_override {
	public static void main(String[] args) {
		Child c = new Child();
		c.method();
	}
}
