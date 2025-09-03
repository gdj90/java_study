package ex05_constructor;

public class MainEx02 {
	public static void main(String[] args) {
		Car c1 = new Car("Blue",5678);
		Car c2 = new Car("Red");
		Car c3 = new Car(4321);
		Car c4 = new Car(c1);
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		c4.number= 1111;
		System.out.println(c1);
		System.out.println(c4);
	}
}
