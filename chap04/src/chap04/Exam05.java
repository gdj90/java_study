package chap04;

import java.util.Scanner;

/*
 * 화면에서 숫자형 문자열을 입력받아서 자리수의 합을 출력하기
 * str.length() : 문자열의 길이
 * str.charAt(i) : 문자열의 i인덱스에 해당하는 char 문자. 인덱스는 0부터 시작함
 */
public class Exam05 {
	public static void main(String[] args) {
		System.out.println("숫자를 입력하세요");
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		int sum = 0; //합계를 저장할 변수.
		//str.length() : 문자열의 길이 리턴. "555":3, "12345":5
		//str.charAt(i) : i 인덱스에 해당하는 문자 리턴
		//  "123" : charAt(0)=> '1', 문자열 중 첫번째 문자 리턴
		//          charAt(1)=> '2'
		//          charAt(2)=> '3'
		for(int i=0;i<str.length();i++) {//3
			sum += str.charAt(i) - '0'; //'3' - '0' => 3
			System.out.print(str.charAt(i) + ((i==str.length()-1)?"=":"+"));
			//1+2+3=6 
		}
		System.out.println(sum);
	}
}
