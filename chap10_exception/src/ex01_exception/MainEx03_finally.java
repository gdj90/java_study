package ex01_exception;
/*
 * finally 블럭 : 정상,예외 모두 실행되는 영역 
 *               return 문장이 실행되도 호출되는 영역임
 * 정상 : 1236
 * 예외 : 146
 * 정상 return: 1235
 * 예외 return: 145
 */
public class MainEx03_finally {
	public static void main(String[] args) {
		try {
			System.out.print(1);
			System.out.print(2);
			System.out.print(3);
			return;
		} catch(Exception e) {
			System.out.print(4);
			return;
		} finally {
			System.out.print(5);
		}
//		System.out.println(6);
	}
}
