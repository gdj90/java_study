package chap05;
/*
삼각형의 높이를 입력하세요
3        i    j
*****    0   0~4
 ***     1   1~3
  *      2   2~2
 
 */

import java.util.Scanner;

public class Test07 {
	public static void main(String[] args) {
		System.out.println("삼각형의 높이를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int h = scan.nextInt();
		int bottom = h * 2 -1;
		int m = bottom/2;
		for(int i=h-1;i>=0;i--) {
			for(int j=0;j<bottom;j++) {
				if(j >= m-i && j <= m+i) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for(int i=0;i<h;i++) {
			for(int j=0;j<bottom - i;j++) {
				if(j>=i) System.out.print("*");
				else System.out.print(" ");
			}
			System.out.println();
		}
	}
}
