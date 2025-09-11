package ex08_calendar;

import java.util.Calendar;
import java.util.Scanner;

/*
 * 년도와 월일 입력받아서 해당월의 마지막 일자와 요일 출력하기
 * Calendar 클래스 이용하기
 */
public class Exam01 {
	public static void main(String[] args) {
		System.out.println("년도와 월을 입력하세요");
		Scanner scan = new Scanner(System.in);
		int year = scan.nextInt();
		int mon = scan.nextInt();
		Calendar cal = Calendar.getInstance();
		
//		cal.set(year, mon - 1, 1);//입력 월의 1일
//		int lastday = cal.getActualMaximum(Calendar.DATE);
//		cal.set(year, mon - 1,lastday);//입력 월의 마지막일
		
		cal.set(year, mon,0); //다음달 0일, 이번달 마지막일자
		String week = "일월화수목금토";
		System.out.printf("날짜:%04d-%02d-%02d %c요일\n",
				cal.get(Calendar.YEAR),
				cal.get(Calendar.MONTH) + 1,
				cal.get(Calendar.DATE),
				week.charAt(cal.get(Calendar.DAY_OF_WEEK) - 1));
		System.out.printf("날짜:%04d-%02d-%02d %c요일\n",
				year,mon,cal.getActualMaximum(Calendar.DATE),
				week.charAt(cal.get(Calendar.DAY_OF_WEEK) - 1));
	}
}
