package chap05;

import java.util.Arrays;

/*
 * 로또 번호 자동 생성하기
 * 1. 1 ~ 45까지의 값을 저장하는 배열 생성
 * 2. 배열의 값을 섞기
 * 3. 정렬하기(sort)
 */
public class ArrayEx03 {
	public static void main(String[] args) {
		int[] balls = new int[45];
		int[] lotto = new int[6];
		//1~45까지의 값을 저장
		for(int i=0;i<balls.length;i++) {
			balls[i] = i+1;
		}
		//배열의 값을 섞기
		for(int i=0;i < 1000;i++) {
			int f = (int)(Math.random() * 45); //0 ~ 44 임의의 수  10
			int t = (int)(Math.random() * 45); //0 ~ 44 임의의 수  1
			//swap
			int tmp = balls[f]; //balls[10], tmp:11
			balls[f] = balls[t];//balls[10]:2
			balls[t] = tmp;     //balls[1] : 11
		}
		//Arrays : 배열의 보조 클래스. 
		System.out.println(Arrays.toString(balls));
		//lotto 배열에 0~5번까지의 요소를 저장
		for(int i=0;i<lotto.length;i++) {
			lotto[i] = balls[i];
		}
		//lotto 번호 출력
		System.out.println(Arrays.toString(lotto));
		//정렬하기
		Arrays.sort(lotto);
		System.out.println(Arrays.toString(lotto));
		
		
	}
}
