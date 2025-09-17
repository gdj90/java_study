package ex03_method;
//static : 제어자. 클래스 멤버 지정하는 예약어.
class MemberCall {
	static int cv1 = 10; //클래스멤버
	static int cv2 = cv1;//클래스멤버간 호출
	int iv1 = 100;       //인스턴스 멤버
	int iv2 = iv1;       //인스턴스 멤버 호출
	int iv3 = cv1;       //인스턴스 멤버에서 클래스 멤버 호출
//	static int cv3 = iv1; //클래스 멤버에서 인스턴 멤버를 직접 호출불가. 객체화 필요	
	static int cv3 = new MemberCall().iv1; //객체화 필요
	
	void method1() {   //인스턴스 멤버
		System.out.println("cv1 + cv2 =" + (cv1+cv2)); //클래스멤버
		System.out.println("iv1 + iv2 =" + (iv1+iv2)); //인스턴스 멤버
	}
	static void method2() { //클래스 멤버
		System.out.println("cv1 + cv2 =" + (cv1+cv2));
		 //클래스 멤버에서 인스턴스 멤버를 직접 호출 불가 
//		System.out.println("iv1 + iv2 =" + (iv1+iv2));
		MemberCall m = new MemberCall();
		System.out.println("iv1 + iv2 =" + (m.iv1+m.iv2));
	}
	void method3() { //인스턴스 멤버
		method1();  //인스턴스 멤버 호출
		method2();  //클래스 멤버 호출
	}
	static void method4() { //클래스 멤버
//		method1();   //인스턴스 멤버 호출 불가.
		new MemberCall().method1();
		method2();	 //클래스 멤버	
	}
}
//method1 ~ method4 호출하기
public class Main04_MemberCall {
	public static void main(String[] args) {
		MemberCall m = new MemberCall();
		m.method1();
		MemberCall.method2();
		m.method3();
		MemberCall.method4();
	}
}
