package chap09;
/*
 * 지역내부클래스에서 사용되는 외부메서드의 지역변수는 상수화 되어야 한다. 
 * 내부메서드내에서 사용되는 외부메서드의 지역변수는 변경불가
 */
public class MainEx03 {
	private int iv=100;
	private static int cv = 200;
	static void method(int pv) {
//		pv++; //외부메서드의 지역변수
		int x = 100;
//		x = 200;
		class LocalInner {
			void method(int num) {
				num++; //내부클래스의 멤버메서드의 지역변수는 상관없다 
				System.out.println("x=" + x);
				System.out.println("pv=" + pv);
				System.out.println("num=" + num);
//				System.out.println("iv=" + iv); //iv 변수는 객체화 필요
				cv++;
				System.out.println("cv=" + cv);
			}
		}
		LocalInner linner = new LocalInner();
		linner.method(100);
	}
	public static void main(String[] args) {
		method(10);
		int x=100;
//		x=200;
		Runnable r = ()->{
			System.out.println(x); //x변수는 main외부메서드의 지역변수이므로 상수화필요
		};
		r.run();
	}
}
