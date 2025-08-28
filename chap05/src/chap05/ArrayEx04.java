package chap05;

import java.util.Scanner;

/*
 * 10진수를 입력받아서 2진수로 변경하기
 */
public class ArrayEx04 {
	public static void main(String[] args) {
		int[] binary = new int[32]; // 0 1 0 1 0 0 0
		System.out.println("10진 정수를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt(); //10
		int divnum = num; //
		int index = 0; //배열의 인덱스, 4
		while(divnum > 0) { //0
			binary[index++] = divnum%2;
			divnum /= 2;
		}
		System.out.print(num+"의 2진수:");
		for(int i=index-1;i>=0;i--) System.out.print(binary[i]); //1010
		System.out.println();
	}
}
