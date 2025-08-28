package chap05;

import java.util.Scanner;

/*
 * 10진수를 16진수로 변경하기
 */
public class ArrayEx05 {
	public static void main(String[] args) {
		char[] data = "0123456789ABCDEF".toCharArray();
		//data : 0 1 2 3 4 5 6 7 8 9  A  B  C  D  E  F
		//       0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 
		char[] hex = new char[8]; //A1
		System.out.println("16진수로 변경할 10진수를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int divnum = num; //26
		int index = 0; //2
		while(true) {
			hex[index++] = data[divnum%16]; //1
			divnum /=16; //0
			if(divnum == 0) break;
		}
		System.out.print(num + "의 16진수 : ");
		for(int i=index -1;i>=0;i--) System.out.print(hex[i]); //1A
		System.out.println();
	}
}
