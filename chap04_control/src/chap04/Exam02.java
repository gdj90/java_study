package chap04;

import java.util.Scanner;

/*
 * 1,2,3 중 한개의 임의의 수를 생성하여
 *   1:가위, 2:바위, 3:보자기
 *   
 * 시스템이 가위바위보중 한개의 숫자를 생성하여 저장하기
 * 사용자는 화면에서 1,2,3 한개를 입력받기
 * 
 * [결과]
 * 시스템  사용자   
 *  가위    가위   비김
 *  가위    바위   사용자승리
 *  바위    가위   시스템승리
 */
public class Exam02 {
	public static void main(String[] args) {
		//시스템의 임의의 수 저장하기
		int syscrp = (int)(Math.random() * 3) + 1; //1 ~ 3사이의 임의의 수
		//사용자 입력받기
		Scanner scan = new Scanner(System.in);
		System.out.println("1(가위),2(바위),3(보) 중 한개를 입력하세요");
		int usercrp = scan.nextInt();

		// 화면에 출력
		System.out.println("시스템\t사용자");		
		System.out.print((syscrp==1)?"가위":(syscrp==2)?"바위":"보");
		System.out.print("\t"+((usercrp==1)?"가위":(usercrp==2)?"바위":"보") + "\t");
		//결과 출력
		if(syscrp == usercrp) System.out.println("비김");
		else { //syscrp,usercrp의 값이 다른 경우
		 switch(syscrp) {
		   case 1 : if(usercrp==2) System.out.println("사용자승리");
		            if(usercrp==3) System.out.println("시스템승리");
		            break;
		   case 2 : if(usercrp==3) System.out.println("사용자승리");
	                if(usercrp==1) System.out.println("시스템승리");
	                break;
		   case 3 : if(usercrp==1) System.out.println("사용자승리");
	                if(usercrp==2) System.out.println("시스템승리");
	                break;
		 }
	   }
	}
}
