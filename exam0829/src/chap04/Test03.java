package chap04;

import java.util.Scanner;

/*
삼각형의 높이를 입력받아서 *로 삼각형 출력하기
 [결과]
 삼각형의 높이
 3
        i   j  => m-i ~ m+i
  *     0   2     m-0 ~ m+0
 ***    1  123    m-1 ~ m+1
*****   2 01234   m-2 ~ m+2

바닥의 *의 갯수 => h * 2 - 1 
  1 : 1
  2 : 3
  3 : 5
  4 : 7
  ...
  
  바닥의 *의 중간 인덱스 : 2
  
  1. b변수 : 바닥의 *의 갯수
  2. m변수 : 중간 인덱스
*/
public class Test03 {
	public static void main(String[] args) {
		System.out.println("삼각형의 높이:");
		Scanner scan = new Scanner(System.in);
		int h = scan.nextInt();
		int b = 2 * h - 1;
		int m = b/2;
		for(int i=0;i < h;i++) {
			for(int j=0;j<b;j++) {
				if(j>=m-i && j<= m+i)
				  System.out.print("*");
				else
				  System.out.print(" ");
			}
			System.out.println();
		}
	}
}
