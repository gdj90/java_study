package ex01_isa;
/*
 * 상속
 * 1. 자손클래스의 객체 생성시 부모클래스의 객체부터 생성한다.
 * 2. 클래스 간의 상속은 단일 상속만 가능하다. => 자손클래스의 부모클래스는 한개만 가능
 * 3. 모든 클래스의 부모클래스가 Object 클래스다.=>모든 클래스는 Object클래스를 상속받는다
 *   => 모든 클래스의 객체에는 Object클래스의 객체를 포함한다.
 */
public class MainEx01 extends Object {
	public static void main(String[] args) {
		SmartPhone sp = new SmartPhone();
		sp.power();
		sp.send();
		sp.receive();
		sp.setApp("카카오");	
		sp.
	}
}
