package chap03;

import java.util.Scanner;

//반지름을 입력받아 원의 둘레와 면적을 구하시오
public class Test06 {
	public static void main(String[] args) {
//		double pi = 3.141592;
		double pi = Math.PI;
		Scanner scan = new Scanner(System.in);
		System.out.println("반지름:");
		int r = scan.nextInt();
		System.out.println("넓이:"+(r*r*pi));
		System.out.println("둘레:"+(2*r*pi));
	}
}
