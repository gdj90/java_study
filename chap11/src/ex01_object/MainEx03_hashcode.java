package ex01_object;
/*
 * hashCode 메서드 
 *   해시코드란 : JVM이 객체를 구분하기 위한 고유의 값(참조값)
 *   두객체의 해시코드값이 동일한 경우 하나의 객체로 인식
 *   물리적으로 같은 객체 판단 => 실제 같은 객체임
 *   논리적으로 같은 객체 판단 => 내용 기준으로 같은 객체인지 판단해야 할 필요 있음
 *   
 *  논리적으로 같은 객체 판단 기준
 *   1. equals 메서드의 결과가 true 이고
 *   2. hashcode 메서드의 결과이 같은 경우 
 *   
 *  권장사항
 *  equals 메서드를 오버라이딩을 하는경우, hashCode 메서드도 함께 오버라이딩 하기 
 *  
 *  String 클래스 : equals, hashCode 메서드를 오버라이딩 함
 */
public class MainEx03_hashcode {
	public static void main(String[] args) {
		String str1 = new String("abc");
		String str2 = new String("abc");
		System.out.println("str1 == str2 :" + (str1 == str2));
		System.out.println("str1.equals(str2) :" + (str1.equals(str2)));
		System.out.println("str1.hashCode() :" + str1.hashCode());
		System.out.println("str2.hashCode() :" + str2.hashCode());
		//객체의 참조값 출력
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
	}
}
