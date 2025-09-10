package ex01_object;
class HashCode {
	int value;
	HashCode(int value) {
		this.value = value;
	}
	@Override
	public int hashCode() {
		return value;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof HashCode) {
			return  value == ((HashCode)obj).value;
		} else return false;
	}
}
public class MainEx04_hashcode {
	public static void main(String[] args) {
		HashCode h1 = new HashCode(10);
		HashCode h2 = new HashCode(10);
		System.out.println("h1 == h2 : " + (h1 == h2)); //false
		System.out.println("h1.equals(h2) : " + (h1.equals(h2))); //true
		System.out.println("h1.hachCode() : " + h1.hashCode()); //10
		System.out.println("h2.hachCode() : " + h2.hashCode()); //10
		System.out.println("System.identityHashCode(h1) : " + 
				                  System.identityHashCode(h1));
		System.out.println("System.identityHashCode(h2) : " + 
                System.identityHashCode(h2));
		
	}
}
