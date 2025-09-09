package ex01_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * 화면에서 정수를 입력받아 숫자 만큼 * 출력하기
 * 정수가 아닌 문자가 입력된 경우 숫자만 입력하세요 메세지 출력하기
 * 
 * Scanner scan = new Scanner(System.in);
 * int num = scan.nextInt(); 
 *                    <= 정수가 아닌 문자 입력시 InputMismatchException 예외 발생
 */
public class Exam01 {
	public static void main(String[] args) {
		System.out.println("숫자를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int num=0;
		try {
			num = scan.nextInt();
			for(int i=1;i<=num;i++) System.out.print("*");
			System.out.println();
		} catch (InputMismatchException e) {
			System.out.println("숫자만 입력하세요");
		}
		System.out.println(num);
	}
}
