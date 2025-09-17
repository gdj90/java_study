package ex07_date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
 * 년도와 월일 입력받아서 입력월의 마지막 일자와 마지막일자의 요일 출력하기
 */
public class Exam01 {
	public static void main(String[] args) {
		System.out.println("년도와 월을 입력하세요");
		Scanner scan = new Scanner(System.in);
		int year = scan.nextInt();
		int mon = scan.nextInt();
//		String dateStr = year + "-" + (mon + 1) + "-01";
		String dateStr = year + "-" + (mon + 1) + "-00"; //전달의 마지막일자
		System.out.println(dateStr);
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
		Date day = null;
		try {
			day = sf.parse(dateStr);
		} catch(ParseException e) {
			e.printStackTrace();
		}
//		day.setTime(day.getTime() - (1000L * 60 * 60 * 24));
		System.out.println
		(new SimpleDateFormat("yyyy-MM-dd E요일").format(day));
	}
}
