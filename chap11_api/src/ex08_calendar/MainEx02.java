package ex08_calendar;

import java.util.Calendar;

/*
 * Calendar 객체에 날짜 설정하기
 */
public class MainEx02 {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		cal.set(2025,(9 - 1),30); //2025-09-30 날짜 설정
		System.out.printf("날짜:%04d-%02d-%02d %d요일\n",
				                   cal.get(Calendar.YEAR),
				                   cal.get(Calendar.MONTH)+1,
				                   cal.get(Calendar.DATE),
				                   cal.get(Calendar.DAY_OF_WEEK));
		//3요일 => 화요일  2025-09-30 화요일
		String week = "일월화수목금토";
		System.out.printf("날짜:%04d-%02d-%02d %c요일\n",
                cal.get(Calendar.YEAR),
                cal.get(Calendar.MONTH)+1,
                cal.get(Calendar.DATE),
                week.charAt(cal.get(Calendar.DAY_OF_WEEK) - 1));
		//1970년부터 cal까지 시간을 밀리초 리턴
		System.out.println(cal.getTimeInMillis());
		cal.setTimeInMillis(cal.getTimeInMillis() + (1000 * 60 * 60 * 24));
		System.out.printf("날짜:%04d-%02d-%02d %c요일\n",
                cal.get(Calendar.YEAR),
                cal.get(Calendar.MONTH)+1,
                cal.get(Calendar.DATE),
                week.charAt(cal.get(Calendar.DAY_OF_WEEK) - 1));
	}
}
