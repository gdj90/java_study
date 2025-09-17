package chap03;

import java.util.Scanner;

/*
 * 1. 정수를 입력받아서 양수인 양수, 음수인 경우 음수, 0인경우는 영 을 출력하기
 * 2. 정수가 홀수인지 짝수 여부 출력하기
 * [결과]
 * 정수를 입력하세요
 * 10
 * 10:양수
 * 10:짝수
 */
public class Exam03 {
	public static void main(String[] args) {
		System.out.println("정수를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		System.out.println(num + ":" + ((num>0)?"양수":(num<0)?"음수":"영"));
		System.out.println(num + ":" + ((num%2==0)?"짝수":"홀수"));
	}
}
