package chap03;

import java.util.Scanner;

/*
* 모든 사람이 사탕을 골고루 나눠가지려고 한다.
* 인원 수와 사탕 개수를 키보드로 입력 받고
* 1인당 동일하게 나눠가진 사탕 개수와 나눠주고 남은 사탕의 개수를 출력하세요.
* 사탕 갯수가 인원수보다 적은 경우 나눠줄 수 없습니다. 메세지 출력하기
* [결과]
* 인원 수 : 29
* 사탕 개수 : 100
* 1인당 사탕 개수 : 3
* 남는 사탕 개수 : 13
*/
public class Test08 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("인원 수 :");
		int pcnt = scan.nextInt();
		System.out.print("사탕 개수 : ");
		int ccnt = scan.nextInt();
		if(pcnt > ccnt) {
			System.out.println("나눠 줄 수 없습니다.");
			return;
		}
		System.out.println("1인당 사탕 개수:" + (ccnt/pcnt));
		System.out.println("남는 사탕 개수:" + (ccnt%pcnt));
	}
}
