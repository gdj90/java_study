package chap05;

import java.util.Scanner;

/*
 
10진수를 2,8,10,16 진수로 변경하기
[결과]
10진수 값을 입력하세요
16

16의 2진수 :10000
16의 8진수 :20
16의 10진수 :16
16의 16진수 :A
*/
public class Test11 {
	public static void main(String[] args) {
		int[] digit = {2,8,10,16};
		char[] numArr = "0123456789ABCDEF".toCharArray();
		char[] arr = null;
		System.out.println("10진수 값을 입력하세요");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt(); //15
		int divnum = num, index = 0;
		for(int d : digit) { //8
			divnum = num; //15 
			index = 0;    //2 
			arr = new char[32]; // 7 1   
			while(divnum > 0) { //0
				arr[index++] = numArr[divnum % d];
				divnum /= d; 
			}
			System.out.print(num + "의 " + d + "진수 :");
			for(int i=index-1;i>=0;i--)
				System.out.print(arr[i]);
			System.out.println();
		}
		
	}
}
