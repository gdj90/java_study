package chap03;

import java.util.Scanner;

/*
 * 화면에서 금액입력받아서 500,100,50,10,1원 동전으로 바꾸기.
 * 필요한 동전의 갯수 출력하기. 전체동전은 최소 갯수로 바꾼다.
 * [결과]
 * 금액을 입력하세요
 * 5641
 * 500원 : 11개
 * 100원 : 1개
 * 50원  : 0개
 * 10원 : 4개
 * 1원  : 1개
 * 
 * 1000원 : 1000/500 몫이 500원 동전의 갯수 : 2
 * 1100원 : 1100/500 몫이 500원동전의 갯수 : 2
 *         (1100%500)/100 몫이 100원 동전의 갯수 : 1
 *         
 * 1. 화면에서 입력받기:Scanner         
 */

public class Test01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("금액을 입력하세요");
		int money = scan.nextInt();
		System.out.println("500원 : " + money / 500 + "개");
		System.out.println("100원 : " + (money % 500)/100 + "개");
		System.out.println("50원 : " + (money % 100) / 50 + "개");
		System.out.println("10원 : " + (money % 50) / 10 + "개");
		System.out.println("1원 : " + (money % 10) + "개");
		//반복문 이용하기
		int coin[] = {500,100,50,10,1};
		int coinMoney = money;
		for(int c : coin) { //c:100
			System.out.println(c+"원 : " + coinMoney/c);
			coinMoney %=c;
		}
	}
}
