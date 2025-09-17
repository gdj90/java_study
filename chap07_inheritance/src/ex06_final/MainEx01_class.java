package ex06_final;
/*
 * final 제어자 : 변경 불가의 의미
 * final 클래스(종단클래스) : 상속불가클래스. 다른 클래스의 부모클래스가 안됨.객체화 가능
 */
class A {}
final class FinalClass extends A {}
// class SubClass extends FinalClass {}
public class MainEx01_class {
	public static void main(String[] args) {
		FinalClass fc = new FinalClass();
	}
}
