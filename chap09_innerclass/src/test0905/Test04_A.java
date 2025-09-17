package test0905;
/*
 * Outer1클래스의 내부 클래스 Inner1, Inner2 의 멤버변수 iv의 값 출력 하기
 */
public class Test04_A {
	public static void main(String[] args) {
		Outer1 o = new Outer1();
		Outer1.Inner1 inner1 = o.new Inner1();
		Outer1.Inner2 inner2 = new Outer1.Inner2();
		System.out.println(inner1.iv);
		System.out.println(inner2.iv);		
	}
}
