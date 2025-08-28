package chap05;

import java.util.Scanner;

/*
 * 10진수를 입력받아 8진수로 출력하는 프로그램 작성하기
 */
public class Exam02 {
	public static void main(String[] args) {
		int[] octal = new int[12]; 
		System.out.println("10진 정수를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt(); //10
		int divnum = num; //
		int index = 0; //배열의 인덱스, 4
		while(divnum > 0) { //0
			octal[index++] = divnum%8;
			divnum /= 8;
		}
		System.out.print(num+"의 8진수:");
		for(int i=index-1;i>=0;i--) System.out.print(octal[i]);
		System.out.println();
	}
}
