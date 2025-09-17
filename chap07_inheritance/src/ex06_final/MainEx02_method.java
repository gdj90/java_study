package ex06_final;
/*
 * final : 변경불가의 의미
 * final method : 오버라이딩 불가 메서드
 * 
 */
class FinalMethod {
	final void method() {  //재정의 불가 메서드. 오버라이딩 불가 메서드
		System.out.println("FinalMethod 메서드 호출");		
	}
}
class SubMethod extends FinalMethod {
	void method(int a) {
		System.out.println("SubMethod 메서드 호출");		
	}
}
public class MainEx02_method {
	public static void main(String[] args) {
		FinalMethod f = new SubMethod();
		f.method();
	}
}
