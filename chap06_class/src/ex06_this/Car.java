package ex06_this;

public class Car {
	String color;
	int number;
	int serialNo;
	static int cnt;
	//지역변수 우선. 
	Car(String color, int number) {
		System.out.println("Car(String,int) 생성자");
		this.color = color;
		this.number = number;
		this.serialNo = ++cnt;
	}
	Car() {
		this("White",1111); //Car(String,int) 생성자 호출함. this는 첫줄에 
		System.out.println("Car() 생성자");
	}
	Car(String color) {
		this(color,1111); //Car(String,int) 생성자 호출함
		System.out.println("Car(String) 생성자");
	}
	Car(int number) {
		this("White",number);		
		System.out.println("Car(int) 생성자");
	}
	Car(Car c) {
		this(c.color,c.number);
		System.out.println("Car(Car) 생성자");
	}
	public String toString() {
		return this.serialNo + "번 자동차:" + this.color + "," + this.number;
	}
}
