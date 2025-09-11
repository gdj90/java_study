package ex06_random;

import java.util.Random;

/*
 * Random 클래스 : 난수 발생 클래스
 * 1. 자료형별로 난수 발생
 *   nextInt() : 정수형 난수
 *   nextInt(n) : 정수형 난수. 0 <= x < n
 *   nextDouble() : 실수형 난수   0 <= x < 1.0
 *   nextBoolean() : true/false
 * 2. seed 값 설정 가능  
 */
public class MainEx01 {
	public static void main(String[] args) {
		Random rand1 = new Random();
//		rand1.setSeed(1);
		for(int i=0;i < 5;i++)
			System.out.println(i + ":" + rand1.nextInt(100));//0~99사이의 난수
		System.out.println("=================");
		Random rand2 = new Random();
//		rand2.setSeed(2);
		for(int i=0;i < 5;i++)
			System.out.println(i + ":" + rand2.nextInt(100));
		for(int i=0;i<5;i++)
			System.out.println(i+":" + rand2.nextBoolean());
	}
}