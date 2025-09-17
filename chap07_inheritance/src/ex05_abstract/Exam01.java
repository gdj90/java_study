package ex05_abstract;
/*
 * Shape 클래스 상속받아 삼각형클래스 구현하기
 * 정삼각형클래스(Triangle)
 *   멤버변수 : length
 *   멤버메서드 : Shape의 추상메서드 오버라이딩하기
 *             toString() : 삼각형 : 한변의길이:length=>면적:xxx,둘레:yyyy
 *             
 *   제곱 : Math.pow(숫자,2)
 *   제곱근 : Math.sqrt(숫자)          
 */
class Triangle extends Shape {
	int length;
	Triangle(int length) {
		super("정삼각형");
		this.length = length;
	}
	@Override
	double area() {
		double m = length / 2;
		double h = Math.sqrt(Math.pow(length, 2) - Math.pow(m, 2));
		return length * h * 0.5;
	}
	@Override
	double length() {
		return 3 * length;
	}
	public String toString() {
		return type + ": 한변의길이:" + length + 
			 "=>면적:" + area() + ",둘레:"+length(); 
	}
}
public class Exam01 {
	public static void main(String[] args) {
		Shape s = new Triangle(10);
		System.out.println(s.area());
		System.out.println(s.length());
	}
}
