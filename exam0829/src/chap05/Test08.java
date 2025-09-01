package chap05;

import java.util.Scanner;

/*
삼각형의 높이를 홀수로 입력하세요
5
        i    j
*****   0    0 1 2 3 4  j : 0 ~ h - i - 1,  * : i <= j
 ***    1    1 2 3
  *     2    2
 ***    3    1 2 3       j : 0 ~ i, 
*****   4    0 1 2 3 4
 
 i   j
 3   1 : h-i - 1
 4   0 : h-i - 1
 */
public class Test08 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("삼각형의 높이를 홀수로 입력하세요");
		int h = scan.nextInt();
		for(int i=0;i <= h/2;i++) {
			for(int j=0;j < h-i;j++) {
				if(i <= j) System.out.print("*");
				else System.out.print(" ");
			}
			System.out.println();
		}
		for(int i=h/2+1; i < h;i++) {
			for(int j=0;j<=i;j++) {
				if(j >=  h-i - 1) System.out.print("*");
				else System.out.print(" ");
			}
			System.out.println();
		}
	}
}
