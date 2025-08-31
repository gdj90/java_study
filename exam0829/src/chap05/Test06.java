package chap05;
/*
 * [결과]
삼각형의 높이를 입력하세요
3
		9			
	8	7	6		
5	4	3	2	1	

3 : 1 + 3 + 5 => 9
4 : 1 + 3 + 5 + 7 => 16
5 : 1 + 3 + 5 + 7 + 9 => 25   
*/

import java.util.Scanner;

public class Test06 {
	public static void main(String[] args) {
		System.out.println("삼각형의 높이를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int h = scan.nextInt();
		int bottom = h * 2 -1;
		int num = 0; //숫자의 시작 숫자 
		for(int i=bottom;i>=1;i-=2) {
			num += i;
		}
//		System.out.println("num="+num); //9
		int m = bottom/2; //2
		for(int i=0;i < h;i++) {
			for(int j=0;j<bottom;j++) {
				if(j >= m-i && j <= m+i) {
					System.out.print(num-- + "\t");
//					System.out.print("*");
				} else {
//					System.out.print(" ");
					System.out.print("\t");
				}
			}
			System.out.println();
		}
	}
}
