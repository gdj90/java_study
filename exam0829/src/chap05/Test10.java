package chap05;

import java.util.Scanner;

/*
다음은 주어진 문자열(value)이 숫자인지를 판별하는  프로그램을 작성하시오.
  String 함수 charAt(i), length() 을 사용함.

[결과]
숫자만 입력하세요
123
123는 숫자 입니다.
  
숫자만 입력하세요
123@12
123@12는 숫자가 아닙니다.

*/
public class Test10 {
	public static void main(String[] args) {
		System.out.println("숫자만 입력하세요");
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		boolean isNumber = true;
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(ch < '0' || ch > '9') 
				if(i==0 && ch == '-') isNumber = true;
				else  {
					isNumber = false;
					break;
				}
		}
		if(isNumber) System.out.println("숫자입니다.");
		else System.out.println("숫자가 아닙니다.");
	}
}
