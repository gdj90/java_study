package ex03_method;
//Rectangle 클래스 구현하기
class Rectangle {
	int width,height, serialNo;
	static int cnt;
	int area() {
		return width * height;
	}
	int length() {
		return (width + height) * 2;
	}
	boolean isSquare() {
//		return width == height;
		if (width == height) return true;
		else return false;
	}
}
public class Exam01 {
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		r1.width = 30;
		r1.height = 20;
		r1.serialNo = ++Rectangle.cnt;
		System.out.println(r1.serialNo+"번사각형 넓이:" + r1.area());		
		System.out.println(r1.serialNo+"번사각형 둘레:" + r1.length());
		System.out.println(r1.serialNo+"번사각형 정사각형여부:"
		      + (r1.isSquare()?"정사각형":"직사각형"));
	}
}
