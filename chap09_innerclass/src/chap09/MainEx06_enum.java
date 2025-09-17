package chap09;

public class MainEx06_enum {
	public enum Car {
		AVANTE,SONATA,GRANDEUR,SM5,K7  //열거형 상수. Enum클래스를 상속함. 
	}
	public static void main(String[] args) {
		Car car = Car.AVANTE;
		System.out.println(car);
		System.out.println(Car.K7);
		System.out.println(Car.K7.ordinal()); //K7 열거형 객체의 인덱스 값
//		System.out.println(Car.K9); //열거된 객체만 사용 가능.
		//values() : 모든 열거형 상수를 배열로 리턴
		Car[] cars = Car.values();
		for(Car c : cars) {
			//c.ordinal() : 열거된 순서. 0부터 시작
			System.out.println(c + ":" + c.ordinal());
		}
		if(car instanceof Object) {
			System.out.println("car 객체는 Object 객체임");
		}
	}

}
