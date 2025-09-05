package ex01_interface;
/*
 * 매개변수로 사용되는 인터페이스
 */
class Unit {
	int hp;
	final int MAX;
	Unit(int hp) {
		this.hp = hp;
		MAX = hp;
	}
}
interface Repairable{}
class Tank extends Unit implements Repairable {
	Tank() {super(150);}
	public String toString() {return "Tank";}
}
class Marine extends Unit {
	Marine() {super(60);}
	public String toString() {return "Marine";}
}
class SCV extends Unit implements Repairable {
	SCV() {super(100);}
	 //Repairable 객체(Repairable 인터페이스를 구현한 구현 클래스)
	// 만 repair 기능 수행.
	void repair(Repairable r) {
		if(r instanceof Unit) {
			//현재 hp의 값출력하기
//			System.out.println(r + " 수리완료,hp=" + ((Unit)r).hp);
			Unit u = (Unit)r;
			System.out.println(r + " 수리완료,hp=" + u.hp);
		}
	}
	public String toString() {return "SCV";}
}
public class MainEx03 {
	public static void main(String[] args) {
		Tank t = new Tank();
		Marine m = new Marine();
		SCV s= new SCV();
		s.repair(t);
//		s.repair(m);
		s.repair(s);
	}
}
