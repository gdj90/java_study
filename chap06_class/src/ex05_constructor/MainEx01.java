package ex05_constructor;
/*
 * 생성자 
 *   객체화시 호출되는 메서드. 
 *   생성자 없는 객체 생성은 불가함
 *   생성자의 기능은 인스턴스변수의 초기화 담당함
 *   
 * 기본생성자
 *   클래스 내부에 생성자를 구현하지 않으면 컴파일러가 구현하여 제공되는 생성자
 *   public 클래스명(){} => 이런형식임
 *   
 * 생성자도 오버로딩이 가능함. => 하나의 클래스에 여러개의 생성자가 존재 가능함   
 */
public class MainEx01 {
	public static void main(String[] args) {
		Number1 n1 = new Number1(); //Number1() 생성자
		/*
		 * new 예약어 기능
		 * 1. 힙영역에 메모리 할당
		 * 2. 멤버필드의 값을 기본값을 초기화. 명시적 초기화된경우 초기화값으로 초기화
		 * 3. 생성자 호출
		 */
		Number2 n2 = new Number2(100);
		System.out.println(n1.num);
		System.out.println(n2.num);
	}
}
