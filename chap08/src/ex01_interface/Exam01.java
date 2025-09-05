package ex01_interface;
/*
 * Dove, Monkey, Flyable 구현하기
 * [결과]
 * 비둘기는 벌레를 잡아 먹는다
 * 비둘기는 날아 다닌다
 * 원숭이는 나무에서 열매를 따먹는다 
 */
abstract class Animal {
	String name;
	Animal(String name) {
		this.name = name;
	}
	abstract void eat();
}
class Dove extends Animal implements Flyable{
	Dove() {
		super("비둘기");
	}
	@Override
	void eat() {
		System.out.println(name + "는 벌레를 잡아 먹는다");
	}
	@Override
	public void fly() {
		System.out.println(name + "는 날아 다닌다");
	}
}
class Monkey extends Animal {
	Monkey() {
		super("원숭이");
	}
	@Override
	void eat() {
		System.out.println(name + "는 나무에서 열매를 따먹는다");
	}
}
interface Flyable {
	void fly();
}
public class Exam01 {
	public static void main(String[] args) {
		Animal[] arr = new Animal[2];
		arr[0] = new Dove();
		arr[1] = new Monkey();
		for(Animal a : arr) {
			a.eat();
			if(a instanceof Flyable) {
				Flyable f = (Flyable)a;
				f.fly();
			}
		}
	}
}
