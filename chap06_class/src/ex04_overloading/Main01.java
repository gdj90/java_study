package ex04_overloading;

public class Main01 {
	public static void main(String[] args) {
		Adder a = new Adder();
		System.out.println(a.add(10));  //20
		System.out.println(a.add(10.5)); //20.5
		System.out.println(a.add("번")); //10번
		System.out.println(a.add(10L));  //20.0
	}
}

