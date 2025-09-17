package chap05;

import java.util.Scanner;

/*
 * 정수값 5개 입력받아서 입력받은 수의 합계, 평균, 최대값,최소값, 최대값의 인덱스, 최소값의 인덱스를 출력하기
 */
public class Exam01 {
	public static void main(String[] args) {
//		int[] arr = {5,0,20,60,-3};
		int[] arr = new int[5];
		int sum=0, maxidx=0,minidx=0;
		System.out.println("정수 5개를 입력하세요");
		Scanner scan = new Scanner(System.in);
		for(int i=0;i < arr.length;i++) {
			arr[i] =scan.nextInt(); 
			sum += arr[i];
			if(arr[maxidx] < arr[i]) {
				maxidx = i;
			}
			if(arr[minidx] > arr[i]) {
				minidx = i;
			}
		}
		System.out.println("합계:" + sum);
		System.out.println("평균:" + (double)sum/arr.length);
		System.out.println("최대값:"+arr[maxidx]);
		System.out.println("최소값:"+arr[minidx]);
		System.out.println("최대값인덱스:"+maxidx);
		System.out.println("최소값인덱스:"+minidx);
		
	}
}
