package ex04_polymorphism;
/*
 * 1. 자손타입의 객체를 부모타입의 참조변수로 참조가 가능하다 => 다형성
 * 2. 같은 멤버인 경우
 *    변수 : 참조변수의 자료형을 기준으로 호출됨
 *    멤서드 : 객체의 최종 오버라이딩된 메서드가 호출됨.
 * 3. 모든 클래스의 객체는 Object 타입의 참조변수로 참조가 가능하다
 */
class Parent {
	int x = 10;
	void method() {
		System.out.println("Parent 클래스의 method");
	}
}
class Child extends Parent {
	int x = 20;
	void method() {//method 내부에서 사용된 멤버변수는 method의 기준을 따른다
		System.out.println("Child 클래스의 method");
		System.out.println("x=" + x); //20
		System.out.println("this.x=" + this.x); //20
		System.out.println("super.x=" + super.x);//10
	}
}
public class MainEx01 {
	public static void main(String[] args) {
		Parent p = new Child();
		System.out.println(p.x);
		p.method();
		Child c = (Child)p; //부모타입의 참조변수가 큰자료형. 형변환 연산자 생략 불가 
		System.out.println(c.x);
		c.method();
		Object o = (Object)p; //형변환 연산자 생략
//		o.methd(); //오류 발생
		
	}
}
