package ex01_interface;
/*
 * 인터페이스
 * 1. 인터페이스의 멤버는 상수,추상메서드, default 메서드, static 메서드만 가능
 * 2. 인터페이스의 멤버의 접근제어자는 public. 생략 되도 public
 *    상수 : [public static final] 자료형 상수명
 *    추상메서드 : [public abstract ]리턴타입 메서드명(매개변수목록)
 *    default 메서드 : [public] default 리턴타입 메서드명(매개변수목록) {...}
 *    static 메서드 : [public] static 리턴타입 메서드명(매개변수목록) {...}
 * 3. 객체화 불가 => 구현클래스의 객체화로 객체화 가능. 
 * 4. 클래스와 인터페이스간은 구현(implements)으로 표현함. 다중 구현이 가능함
 * 5. 인터페이스간도 상속(extends)가능함. 다중 상속이 가능하다.   
 */
interface Printerable {
	int INK = 100; //상수
	void print();  //추상메서드
	default void sort() {  //jdk8 이후. default 메서드. 구현부 존재.
		System.out.println("정렬 페이지를 출력");
	}
}
interface Scannerable {
	void scan();  //추상메서드
}
interface Faxable {
	String FAX_NO = "02-1111-2222"; //상수
	void send(String no); //추상메서드
	void receive(String no); //추상 메서드
}
//인터페이스간 상속 가능. 다중 상속 가능
interface Complexerable extends Printerable,Scannerable,Faxable {}
//클래스와 인터페이스는 구현이라고 한다.
//구현클래스 : 인터페이스를 구현한 클래스
class Complexer implements Complexerable {
	int ink;
	Complexer() {
		this.ink = INK;
	}
	public void print() {
		System.out.println("프린트로 출력합니다. 남은 잉크량:" + --ink);
	}
	public void scan() {
		System.out.println("이미지를 스캔합니다.");
	}
	public void send(String no) {
		System.out.println(FAX_NO + "에서 " + no + "로 FAX를 보냅니다.");
	}
	public void receive(String no) {
		System.out.println(no + "에서 " + FAX_NO + "로 FAX를 받았습니다.");
	}	
}
public class MainEx01 {
	public static void main(String[] args) {
		Complexer c = new Complexer();
//		Printerable.INK = 200;
		System.out.println(Printerable.INK);
		System.out.println(Complexerable.INK);
		System.out.println(Complexer.INK);
		System.out.println(Faxable.FAX_NO);
		System.out.println(Complexerable.FAX_NO);
		System.out.println(Complexer.FAX_NO);
		c.print();
		c.sort();
		c.scan();
		c.receive("02-2222-3333");
		c.send("02-2222-3333");
		System.out.println("남은 잉크 량:"+c.ink);
		if(c instanceof Complexerable) {
			Complexerable co = c; //자동형변환. 
//			System.out.println(co.ink); //Complexer 멤버임. 
			co.print();
			co.sort();
			co.scan();
			co.receive("02-2222-3333");
			co.send("02-2222-3333");
		}
		if(c instanceof Printerable) {
			Printerable p = c;
			p.print();
			p.sort();
//			p.scan();
//			System.out.println("남은 잉크 량:"+p.ink);
		}
	}
}
