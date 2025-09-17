package ex01_exception;
/*
 * throws : 예외처리. 예외던지기, 예외선언
 *   발생된 예외를 호출한 메서드로 예외를 전달
 *   => 호출한 메서드에서 예외 발생. 
 *     
 */
public class MainEx04_throws {
	public static void main(String[] args) {
		try {
			first();
		} catch (Exception e) {
			System.out.println("main 에서 예외처리");
			e.printStackTrace();
		}
	}
	private static void first() throws Exception{
		second();
	}
	private static void second() throws Exception {
		try {
		   System.out.println(Integer.parseInt("abc")); //NumberFormatException
		} catch (Exception e) {
			System.out.println("second 에서 예외처리");
			e.printStackTrace();
		}
	}
}
