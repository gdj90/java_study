package ex07_date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * Date클래스 : java.util 패키지의 클래스
 * SimpleDateFormat 클래스 : java.text 패키지의 클래스
 * 	    String format(Date) : Date객체를 지정한 형식에 맞는 문자열로 리턴 
 *      Date  parse(String) : 형식에 맞는 문자열을 Date타입의 객체로 리턴
 *                            ParseException 예외처리 필수
 *      
 * 날짜 format에서 사용되는 문자
 * yyyy : 년도 4자리
 * MM   : 월 2자리
 * dd   : 일 2자리
 * HH   : 시간 2자리
 * mm   : 분 2자리
 * ss   : 초 2자리
 * E    : 요일
 * a    : 오전/오후
 */
public class MainEx01 {
	public static void main(String[] args) {
		Date now = new Date(); //현재시간
		System.out.println(now.toString());
		//날짜 형식을 지정하여 출력하기
		SimpleDateFormat sf = new SimpleDateFormat
				("yyyy년MM월dd일 HH시mm분ss초 E a");
		String strDate = sf.format(now);
		System.out.println(strDate);
		
		SimpleDateFormat sf2 = new SimpleDateFormat("yyyy-MM-dd");
		String formatDate = "2025-12-25";
		Date day = null;
		try {
			day = sf2.parse(formatDate);
		}catch(ParseException e) {
			e.printStackTrace();
			System.out.println("날짜 형식에 맞게 입력하세요");
		}
		System.out.println(sf.format(day));
	}
}
