package ex01_interface;
/*
 * 추상클래스,인터페이스를 이름없는 내부 객체로 생성하기
 */
interface Action {
	void action();
}
abstract class Abs {
	int num = 100;
	abstract void method();
}
public class MainEx04 {
	public static void main(String[] args) {
		//이름 없는 내부 객체
		Action a = new Action() {
			@Override
			public void action() {
				System.out.println("Action인터페이스의 action 메서드");
			}
		};
		a.action();
		//Abs 추상클래스를 객체화 하여 num값 출력하기
		Abs abs = new Abs() {
			@Override
			void method() {
				System.out.println("Abs 클래스의 method().  num=" + num);
			}
		};
		abs.method();
		System.out.println(abs.num);
		//jdk 8 이후에 람다식. 화살표함수. 함수객체 
		a = ()->System.out.println("람다방식으로 Action 인터페이스 구현");
		a.action();
		
		
	}
}
