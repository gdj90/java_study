package ex01_exception;
/*
 * throws : 예외처리(존재하는 예외를 제거 기능)
 * throw  : 예외발생(없는 예외를 발생 하는 기능) 
 */
public class MainEx05_throw {
	public static void main(String[] args) {
		try {
			first();
		} catch (Exception e) {
			System.out.println("main 에서 예외 처리");
			e.printStackTrace();
		}
	}
	private static void first() throws Exception {
		System.out.println("first 메서드");
		second();
	}

	private static void second() throws Exception{
		System.out.println("second 메서드");
		try {
		   throw new Exception("예외 강제 발생"); //예외 발생
		} catch(Exception e) {
			System.out.println("second 에서 예외 처리");
			e.printStackTrace();
			throw e;  //예외 재발생
		}
	}
}
