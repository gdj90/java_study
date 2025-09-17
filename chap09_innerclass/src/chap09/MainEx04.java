package chap09;
/*
 * 내부 클래스의 메서드에서 사용되는 this,super 
 */
class ParentOuter {
	int iv = 10;
	int piv = 500;
}
class ChildOuter extends ParentOuter {
	int iv = 20;
	int iv2 = 30;
	/*
	 * 내부 클래스의 멤버메서드에서 변수 접근 우선순위
	 * 1. 지역변수
	 * 2. 내부클래스의 멤버변수. this.멤버변수로 호출가능
	 *    => this는 내부클래스의 객체.
	 * 3. 외부클래스의 멤버변수. 외부클래스명.this.멤버변수로 호출가능
	 * 4. 외부클래스의 부모클래스의 멤버변수. 외부클래스명.super.멤버변수로 호출가능
	 */
	class InstanceInner { //객체화
		int iv = 40;
		void method() { //실행하기
			int iv = 50;
			System.out.println("iv=" + iv);
			System.out.println("iv2=" + iv2); //ChildOuter.iv2
			System.out.println("piv=" + piv); //ParentOuter.piv
			System.out.println("this.iv=" + this.iv); //InstanceInner.iv
			System.out.println
			 ("ChildOuter.this.iv=" + ChildOuter.this.iv); //ChildOuter.iv
			System.out.println
			 ("ChildOuter.super.iv=" + ChildOuter.super.iv); //ParentOuter.iv
			//iv2 변수를 외부클래스명.this.변수명으로 호출하기
			System.out.println
			 ("ChildOuter.this.iv2=" + ChildOuter.this.iv2); //ChildOuter.iv2
			//piv 변수를 외부클래스명.super.변수명으로 호출하기
			System.out.println
		 ("ChildOuter.this.piv=" + ChildOuter.this.piv); //ChildOuter.piv
			System.out.println
		 ("ChildOuter.super.piv=" + ChildOuter.super.piv); //ParentOuter.piv
		}
	}
}
public class MainEx04 {
	public static void main(String[] args) {
		ChildOuter.InstanceInner inner = 
				             new ChildOuter().new InstanceInner();
		inner.method();
		
	}
}
