package ex04_overloading;
/*
 * 메서드 오버 로딩 : 메서드의 다형성
 * 오버로딩의 조건
 * 1. 같은 클래스 내부에 같은 이름을 가진 메서드가 여러개 존재 가능함
 * 2. 단 매개변수 목록이 달라야 한다. (자료형 기준 : 갯수, 순서, 종류). 매개변수이름이 아님 
 */
public class Adder {
	int a = 10;
	/*
	int add (int y) {
		System.out.print("1:");
		return a + y;
	}
	*/
	int add (int b) {
		System.out.print("1:");
		return a + b;
	}
	double add (double b) {
		System.out.print("2:");
		return a + b;
	}
	String add (String b) {
		System.out.print("3:");
		return a + b;
	}
	//=================
	int add(int a, int b) {
		System.out.print("1:");
		return a + b;
	}
	long add(int a, long b) {
		System.out.print("2:");
		return a + b;
	}
	long add(long a, int b) {
		System.out.print("3:");
		return a + b;
	}
	long add(long a, long b) {
		System.out.print("4:");
		return a + b;
	}
}
