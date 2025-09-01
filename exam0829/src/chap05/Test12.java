package chap05;

import java.util.Scanner;

/*
삼각형의 높이를 입력하세요
5                      i      j       j : i ~ 5
15	14	13	12	11	   1      1 ~ 5  
	10	9	8	7	   2      2 ~ 5
		6	5	4	   3      3 ~ 5
			3	2	   4      4 ~ 5
				1      5      5
 */
public class Test12 {
	public static void main(String[] args) {
		System.out.println("삼각형의 높이를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int h = scan.nextInt();
		int data = 0;
		for(int i=1;i<=h;i++) data += i;
		for(int i=1; i<= h ; i++) {
			for(int j=1;j<=h;j++) {
//				if(i <= j) System.out.print(data-- + "\t");
//				else System.out.print("\t");
				//printf 함수 : 서식문자 : %4d => 4자리 확보하여 10진 정수출력
				//                      %4s => 4자리 확보하여 문자열 출력 
				if (i <= j) System.out.printf("%4d",data--);
				else System.out.printf("%4s"," ");
			}
			System.out.println();
		}
	}
}
