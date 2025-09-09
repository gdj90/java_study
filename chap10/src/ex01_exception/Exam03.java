package ex01_exception;
/*
 * throw new Exception("예외 강제 발생") 에서 컴파일 오류 발생
 * 컴파일 오류를 수정할 3가지 방법 
 */
public class Exam03 {
//	public static void main(String[] args) throws Exception {
//		throw new Exception("예외 강제 발생");
//	}
	
//	public static void main(String[] args) {
//		try {
//			throw new Exception("예외 강제 발생");
//		} catch(Exception e) {
//			e.printStackTrace();
//		}
//	}
	
	public static void main(String[] args) {
		throw new RuntimeException("예외 강제 발생");
	}
}
