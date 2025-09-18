package ex02_supplier;

import java.util.function.BooleanSupplier;

/*
 * BooleanSupplier를 이용하여 10개의 1~10사이의 임의의 숫자의 합을 계산하여
 * 합이 짝수인지 홀수인지 출력하기
 */
public class Exam01 {
	public static void main(String[] args) {
		BooleanSupplier s = ()-> {
			int sum = 0;
			for(int i=0;i<10;i++) {
				int num = (int)(Math.random() * 10) + 1;
				System.out.print(num + ((i<9)?",":"="));
				sum += num;
			}
			System.out.print(sum + ":");
			return sum%2==0;
		};
		System.out.println(s.getAsBoolean()?"짝수":"홀수");
	}
}
