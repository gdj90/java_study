package ex06_this;
/*
 * this 예약어
 * this 참조변수
 *   - 현재 객체의 참조값을 저장 => 자기 참조변수
 *   - 인스턴스 메서드가 호출될때 자동으로 선언되고, 현재 참조값으로 초기화됨.
 *   - 지역변수와 멤버변수를 구분시 사용함.
 *   - 지역변수와 멤버변수의 이름이 같은 경우 지역변수 우선임 
 *     => this 참조변수를 이용하여 멤버변수를 호출 할 수 있음
 *   - 지역변수와 멤버변수의 이름이 다른 경우
 *     => this 생략 가능. 
 *     => 의미를 명확하게 하기위해 사용해도 됨. 
 *   - 인스턴스 메서드에서만 사용이 가능함. static 메서드에서는 this 사용불가.    
 *    
 * this() 생성자
 *   - 같은 클래스 내부에 다른 생성자 호출시 사용함
 *   - 인자값을 생성자의 구현부에 맞춰서 호출해야함
 *   - 반드시 첫줄에 구현해야함.
 */
public class MainEx01 {
	static int num = 100;
	public static void main(String[] args) {
//		System.out.println(this.num); //this 예약어는 인스턴스메서드에서만 사용가능함
		System.out.println(num);
		Car c1 = new Car("Blue",1234);
		Car c2 = new Car();
		System.out.println(c1);
		System.out.println(c2);
		Car c3 = new Car("Red");
		System.out.println(c3);
		Car c4 = new Car(1234);
		System.out.println(c4);
		Car c5 = new Car(c1);
		System.out.println(c5);
	}
}
