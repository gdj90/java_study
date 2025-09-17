package ex01_exception;
/*
 * 예외처리 : 발생된 예외를 정상화 하는 과정
 * 
 * try 구문 : 예외처리
 * try,catch, finally
 * try {...} => 예외발생 가능성이 있는 문장들. 필수블럭
 * catch(Exception ) {.....} => try 블럭에서 발생된 예외 처리 블럭. 예외발생시 실행됨
 * finally {.....} => 정상처리,예외발생 상관없이 꼭 실행되는 영역
 * 
 * throws : 예외처리의 다른 방식.
 * throw  : 정상적인 처리를 예외 발생. 예외 강제 발생
 */
public class MainEx01 {
	public static void main(String[] args) {
		try {
		   System.out.println(args[0]); //=> 예외가 발생 가능성이 있는 문장들
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("command 라인에 파라미터값을 입력하세요");
		}
	}
}
