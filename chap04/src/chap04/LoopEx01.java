package chap04;
/*
 * 반복문 예제 : 조건식의 결과가 참인 동안 {}내의 문장을 반복 수행
 * 
 * === for ===
 * for(초기값;조건식;증감식) {
 *     조건식의 참인 동안 실행되는 문장들
 * }
 * === while ===
 * while(조건식) {
 *    조건식의 참인 동안 실행되는 문장들
 * }
 * === do while ===
 * do {
 *   반복시작시 실행 되거나 조건식이 참인동안 실행되는 문장
 * } while(조건식);
 */
public class LoopEx01 {
	public static void main(String[] args) {
		System.out.println("반복문 없이 1 ~ 5까지 출력하기");
		System.out.print(1);
		System.out.print(2);
		System.out.print(3);
		System.out.print(4);
		System.out.println(5);
		System.out.println("for 구문을 이용하여 1 ~ 5까지 출력하기");
		for(int i=10;i <= 5;i++)
			System.out.print(i);
		System.out.println();
		/*12345
		 * 1. int i=1  //선언된 i변수는 for구문 내부에서만 사용이 가능
		 * 2. i <= 5 :false <-------|
		 * 3. System.out.print(i);  |
		 * 4. i++  //6  ------------|
		 * 
		 * 조건식의 결과가 false인 경우 for 반복문 종료
		 */
		System.out.println("while 구문을 이용하여 1 ~ 5까지 출력하기");
		int i=10;
		while(i<=5) {
			System.out.print(i);
			i++;
		}
		System.out.println("\n while 외부의 i="+i);
		/* 12345
		 * 1. int i=1;
		 * 2. i<=5 : false<---------|
		 * 3. System.out.print(i);  |
		 * 4. i++;  //6   ----------|
		 * 
		 * 조건식의 결과가  false 인 경우 while 반복문 종료
		 */
		System.out.println("do while 구문을 이용하여 1 ~ 5까지 출력하기");
		i=10;
		do {
			System.out.print(i);
			i++;
		}while(i<=5);
		System.out.println(":i="+i);
		/*12345
		 * 1. i=1;
		 * 2. System.out.print(i);<-|
		 * 3. i++; //6              |
		 * 4. i<=5 : false----------|
		 * 
		 * 조건식의 결과가 false인경우 do while 반복문 종료
		 */
	}
}
