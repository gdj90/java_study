package chap04;
/*
 * ch 문자가 대문자인 경우는 "대문자",
 *         소문자인 경우는 "소문자"
 *         숫자인 경우는 "숫자"
 *         그외는 "기타문자"
 *         로 출력하기  
 */
public class Exam01 {
	public static void main(String[] args) {
		char ch = '가';
		if (ch >= 'A' && ch <= 'Z') {
			System.out.println("대문자");
		} else if (ch >= 'a' && ch <= 'z') {
			System.out.println("소문자");
		} else if (ch >= '0' && ch <= '9') {
			System.out.println("숫자");
		} else {
			System.out.println("기타문자");
		}
	}
}
