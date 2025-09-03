package ex06_this;
/*
 * Rectangle 클래스 수정하기
 * 멤버변수의 초기화는 (int,int)매개변수를 가진 생성자에서 한다.
 * 다른 생성자에서는  this() 생성자로 호출하기
 * 생성자의 모든 매개변수이름은 멤버변수와 같도록 수정하기
 */
class Rectangle {
	int width,height;
	Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	Rectangle(int width) {
		this(width,1);
	}
	int area() {
		return this.width * this.height;
	}
	int length() {
		return (width+height) * 2;
	}
	public String toString() {
		return "("+width+","+height+"),면적:"+this.area()+",둘레:"+this.length();
	}
}
public class Exam01 {
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(10,10); //가로:10,세로:10
		System.out.println(r1); //(10,10),면적:100,둘레:40
		Rectangle r2 = new Rectangle(10); //가로:10, 세로:1
		System.out.println(r2); //(10,1),면적:10,둘레:22
	}
}
