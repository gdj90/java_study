package ex05_wrapper;
/*
 * Wrapper 클래스 : 8개의 기본자료형을 객체화 하기위한 클래스의 통칭 
 *                 기본자료형의 기능, 상수값등을 처리
 * 
 *    기본자료형     Wrapper 클래스
 *    boolean      Boolean
 *    char         Character
 *    byte         Byte
 *    short        Short
 *    int          Integer
 *    long         Long
 *    float        Float
 *    double       Double
 * 
 * 기본자료형과 참조자료형은 형변환 불가
 * String str = 'A';(X)   String <= char 형변환 불가
 * 단 Wrapper 클래스와 기본자료형사이는 형변환 가능함(JDK5 이후)
 *   참조형 <= 기본형 auto Boxing
 *   기본형 <= 참조형 auto UnBoxing
 */
public class MainEx01 {
	public static void main(String[] args) {
		int num = 100;
		Integer i1 = num; //auto Boxing
		Integer i2 = 100;
		System.out.println(i1 == i2);
		System.out.println(100 == i2); //i2객체가 auto UnBoxing됨
		System.out.println(i1.equals(i2));
		System.out.println(i1.toString());
		//int 형 정보
		System.out.println("int 형 최대값:" + Integer.MAX_VALUE);
		System.out.println("int 형 최소값:" + Integer.MIN_VALUE);
		System.out.println("int 형 크기(bit):" + Integer.SIZE);
		//double 형 정보
		System.out.println("double 형 최대값:" + Double.MAX_VALUE);
		System.out.println("double 형 최소값:" + Double.MIN_VALUE);
		System.out.println("double 형 크기(bit):" + Double.SIZE);
	}
}
