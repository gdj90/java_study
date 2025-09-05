package ex08_modifier;
/*
 *  생성자의 접근 제한자를 private 으로 설정 : 객체의 갯수를 제한
 */
class SingleObject {
	private static SingleObject obj = new SingleObject(); //클래스 내에서 객체 생성
	//생성자의 접근제한자가 private이므로 다른클래스에서 객체 생성 불가
	private SingleObject() {} 
	int value = 100;
	public static SingleObject getObject() {
		return obj;
	}
}
public class MainEx03_singleton {
	public static void main(String[] args) {
	//	SingleObject obj = new SingleObject(); //생성자 접근
		SingleObject o1 = SingleObject.getObject();
		SingleObject o2 = SingleObject.getObject();
		SingleObject o3 = SingleObject.getObject();
		System.out.println(o1.value);
		System.out.println(o2.value);
		System.out.println(o3.value);
		o1.value = 200;
		System.out.println(o1.value);
		System.out.println(o2.value);
		System.out.println(o3.value);
	}
}
