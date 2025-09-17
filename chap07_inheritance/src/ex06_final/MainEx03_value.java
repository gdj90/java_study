package ex06_final;
/*
 * final : 변경불가
 * final 변수 : 변경불가 변수 => 상수. const 예약어 사용안함
 * final 변수도 한번은 초기화 가능함 => 객체별로 다른 상수값이 가능
 *  => 단 명시적 초기화를 하면 안됨.
 */
class FinalValue {
	final int NUM;
	FinalValue(int num) {
		NUM = num; //상수값 초기화 가능
//		NUM = num; //한번만 초기화가능. 오류
	}
}
public class MainEx03_value {
	public static void main(String[] args) {
		final int NUM = 100;
//		NUM = 200; //변경불가 변수
		System.out.println(NUM);
		FinalValue fv1 = new FinalValue(100);
		FinalValue fv2 = new FinalValue(200);
		System.out.println(fv1.NUM);
		System.out.println(fv2.NUM);
	}
}
