package chap03;

import java.util.Scanner;

/*
 * 화면에서 3자리 정수를 입려받아 100자리 미만을 버리고 출력하기
 * [결과]
 * 세자리 정수를 입력하세요
 * 321
 * 300
 */
public class Exam02 {
	public static void main(String[] args) {
		System.out.println("세자리 정수를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		System.out.println((num/100)*100);
		System.out.println(num - (num%100));
	}
}
