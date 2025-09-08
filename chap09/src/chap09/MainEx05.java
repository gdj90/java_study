package chap09;
/*
 * 람다 객체에서 this
 */
interface LambdaIntrface {
	void method();
}
class Outer {
	int iv = 10;
	void method() {
		int iv = 20; //지역변수
//		iv = 30; //람다내부에서 호출되는 변수는 상수화 필요
		LambdaIntrface f = ()-> {
//			int iv=30; //지역변수와 이름이 중복됨.
//			iv = 30; //람다내부에서 호출되는 변수는 상수화 필요
			System.out.println("iv=" + iv); //20
			System.out.println("this.iv=" + this.iv);//Outer.iv
			System.out.println("Outer.this.iv=" + Outer.this.iv); //Outer.iv
		};
		f.method();
		//기존의 인터페이스 객체 생성방식으로 처리하기 => 이름없는 내부클래스 방식
		f = new LambdaIntrface() {
			@Override
			public void method() {
				System.out.println("iv=" + iv); //20
//				System.out.println("this.iv=" + this.iv);//Outer.iv
				System.out.println("Outer.this.iv=" + Outer.this.iv); //Outer.iv
			}
		};
	}
}
public class MainEx05 {
	public static void main(String[] args) {
		new Outer().method();
	}
}
