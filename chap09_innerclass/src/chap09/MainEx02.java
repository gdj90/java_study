package chap09;
/*
 * 외부 클래스의 멤버
 *   인스턴스내부클래스 객체화 : 외부클래스의 객체화 필요
 *                         외부클래스의참조변수.new 내부클래스명(생성자);
 *   static내부클래스 객체화 : new 외부클래스명.내부클래스명(생성자);        
 */
public class MainEx02 {
	public static void main(String[] args) {
		//Outer1.InstanceInner 클래스의 객체화
		//Outer1.InstanceInner 클래스는 Outer1 클래스의 인스턴스 멤버
		// => 외부클래스의 객체화 필요
//		Outer1.InstanceInner iinner = new Outer1().new InstanceInner();
		Outer1 out = new Outer1();
		Outer1.InstanceInner iinner = out.new InstanceInner();
		System.out.println("iinner.iv=" + iinner.iv);
		System.out.println
		    ("Outer1.InstanceInner.cv=" + Outer1.InstanceInner.cv);
		System.out.println
	    	("Outer1.InstanceInner.MAX=" + Outer1.InstanceInner.MAX);
		//Outer1.StaticInner 클래스의 객체화
		//Outer1.StaticInner 클래스는 Outer1 클래스의 클래스 멤버
		Outer1.StaticInner sinner = new Outer1.StaticInner();
		System.out.println("sinner.iv=" + iinner.iv);
		System.out.println
		    ("Outer1.StaticInner.cv=" + Outer1.StaticInner.cv);
		System.out.println
	    	("Outer1.StaticInner.MAX=" + Outer1.StaticInner.MAX);
	}
}
