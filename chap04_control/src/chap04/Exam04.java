package chap04;

import java.util.Scanner;

/*
 * num 값의 자리수의 합 출력하기
 */
public class Exam04 {
	public static void main(String[] args) {
		int sum=0;
		System.out.println("숫자를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int tnum = num;
		while(tnum > 0) {
			sum += tnum % 10;
			tnum /= 10;
		}
		System.out.println(num + "자리수의 합:"+sum);
		System.out.println("========== for 구문으로 =========");
		for(tnum=num,sum=0;tnum>0;tnum/=10) {
			sum += tnum % 10;
		}
		System.out.println(num + "자리수의 합:"+sum);
	}
}
