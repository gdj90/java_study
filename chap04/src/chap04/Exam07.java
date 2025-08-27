package chap04;

import java.util.Scanner;

/*
 * 강아지,병아리가 있습니다.
 * 강아지,병아리 전체 마리수 입력받고,
 * 강아지,병아지 전체 다리수 입력받기
 * 강아지 마리수, 병아리 마리수 출력하기
 * [결과]
 * 강아지와 병아리 마리수 입력:10
 * 강아지와 병아리 다리수 입력:30
 * 강아지:5마리
 * 병아리:5마리
 *  
 * [결과]
 * 강아지와 병아리 마리수 입력:10
 * 강아지와 병아리 다리수 입력:10
 * 
 * 입력 오류
 */
public class Exam07 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("강아지와 병아리 마리수 입력:");
		int cnt = scan.nextInt();
		System.out.print("강아지와 병아리 다리수 입력:");
		int leg = scan.nextInt();
		boolean check = false;
		for(int x=0;x<=cnt;x++) {
			for(int y=0;y<=cnt;y++) {
				if((x+y==cnt) && (4*x + 2*y)==leg) {
					System.out.println("강아지:"+x + "마리");
					System.out.println("병아리:"+y + "마리");
					check=true;
				}
			}
		}
		if(!check) {
			System.out.println("입력 오류");
		}
	}
}
