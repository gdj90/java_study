package ex01_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/*
 * catch 블럭 : try 블럭 내부에서 예외 발생시 실행되는 영역
 * 
 * 다중 catch
 *   - 한개의 try블럭 내부에 여러개의 예외가 발생 가능성이 있는 경우 
 *      여러개의 catch블럭으로 처리가능함
 *   - 상위 예외클래스(Exception)은  catch블럭의 하단에 배치 해야함(순서가 중요)
 *     부모타입의 예외클래스는 자손타입의 예외클래스보다 하단에 배치 되어야된다.
 *     
 * 예외 클래스 계층       
 * Throwable - Error    : 에러클래스의 최상위 클래스
 *           - Exception: 예외클래스의 최상위 클래스
 *              - RuntimeException : 예외처리 생략 가능
 *              - 그외 Exception    : 예외처리 생략 불가
 */
public class MainEx02 {
	public static void main(String[] args) {
		System.out.println(1/0); //try구문 외부의 문장은 catch 블럭 실행 못함
		try {
			FileInputStream fis = new FileInputStream("a");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			System.out.println(args[0]);
		    //NumberFormatException 예외 발생
			System.out.println(Integer.parseInt("a"));
			String str = null; //객체 없음
//			System.out.println(str.trim()); //NullPointerException 예외발생
			System.out.print(1);
			System.out.print(2);
			System.out.print(3/0); //ArithmeticException 예외발생
			System.out.print(4);
		} catch (NullPointerException e) {
			System.out.println("문자열에 객체가 없습니다."); 
		} catch (ArithmeticException e) {
			System.out.println("0으로 나누지 마세요");
		} catch (NumberFormatException e) {
			System.out.println("숫자만 입력하세요");
		} catch (Exception e) {
			System.out.println("전산부로 전화요망");
		}
		System.out.println(6);
	}
}
