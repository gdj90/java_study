package ex05_constructor;
/*
 * 생성자 : 객체 생성에 관여하는 특별한 인스턴스 메서드
 *   1. 생성자의 이름은 클래스명과 같다.
 *   2. 리턴타입이 없다. void로 구현하지 않는다. 리턴타입을 구현하지 않는다.
 * 기능 : 멤버변수의 초기화를 담당한다.  
 */
public class Number2 { //생성자 구현
	int num;
	Number2(int n) {
		num = n;
	}
}
