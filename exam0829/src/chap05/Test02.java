package chap05;

import java.util.Scanner;

/*
 * 숫자 맞추기
 * 컴퓨터가 1~100 사이의 임의의 정수를 저장하고,
 * 사용자는 숫자를 입력하여 컴퓨터 저장한 숫자를 맞추기
 * 시스템 : 37 가정
 * [결과]
 * 1~100사이의 숫자를 입력하세요
 * 50
 * 작은수입니다.
 * 25
 * 큰수입니다.
 * 40
 * 작은수입니다.
 * 37
 * 정답입니다. 
 * 프로그램종료합니다.
 * 
 * 최종 결과 부분 추가 
 *      몇번 입력만에 정답 맞췄는지 입력 횟수를 출력하기
 *      5번 미만이면 훌륭합니다.
 *      10번 미만이면 보통이네요.
 *      10번이상이면 노력하세요
 *      출력하기
 */
public class Test02 {
	public static void main(String[] args) {
		int cnt=0;
		int comNum = (int)(Math.random() * 100) + 1;
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("1 ~ 100사이의 숫자를 입력하세요");
			int inData = scan.nextInt();
			++cnt;
			if(comNum > inData) System.out.println("큰수 입니다.");
			else if (comNum < inData) System.out.println("작은수 입니다.");
			else {
				System.out.println("정답입니다.");
				break;
			}
		}
		System.out.println(cnt + "번 입력하셨습니다.");
		
		if(cnt < 5) System.out.println("훌륭합니다.");
		else if (cnt < 10) System.out.println("보통입니다.");
		else System.out.println("노력하세요");
		System.out.println("프로그램을 종료합니다.");
	}
}
