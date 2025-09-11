package ex08_calendar;

import java.util.Calendar;
import java.util.Date;

/*
 * Date 객체와 연결
 */
public class MainEx03 {
	public static void main(String[] args) {
		// Calendar <= Date
		Date now = new Date();
		now.setTime(now.getTime() + (1000L * 60 * 60 * 24));
		System.out.println(now); //내일날짜
		Calendar cal = Calendar.getInstance();
		cal.setTime(now); //Date 객체를 이용하여 Calendar객체의 날짜 설정
		String week = "일월화수목금토";
		System.out.printf("날짜:%04d-%02d-%02d %c요일\n",
				cal.get(Calendar.YEAR),
				cal.get(Calendar.MONTH) + 1,
				cal.get(Calendar.DATE),
				week.charAt(cal.get(Calendar.DAY_OF_WEEK) - 1));
		// Date <= Calendar
		Date day = new Date(); //현재일시
		//Calendar 객체를 이용하여 Date 객체의 날짜 설정하기
		//cal : 내일의 날짜 객체
		day.setTime(cal.getTimeInMillis());//cal 객체의 날짜로 day 객체의 날짜 설정
		System.out.println(day);		
	}
}
