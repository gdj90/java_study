package test0911;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/*
 * 두개의 날짜를 입력받아서 두날짜사이의 일수를 출력하기
  [결과]
첫번째 날짜를 입력하세요(yyyy-MM-dd)
2025-01-01
두번째 날짜를 입력하세요(yyyy-MM-dd)
2025-01-03
2025-01-03 -2025-01-01 일자의 차이 : 2  
 */
public class Test03_B {
	public static void main(String[] args) throws ParseException {
		System.out.println("첫번째 날짜를 입력하세요(yyyy-MM-dd)");
		Scanner scan = new Scanner(System.in);
		String first = scan.nextLine();
		System.out.println("두번째 날짜를 입력하세요(yyyy-MM-dd)");
		String second = scan.nextLine();
		String[] farr = first.split("-");
		String[] sarr = second.split("-");
		Calendar fcal = Calendar.getInstance();
		Calendar scal = Calendar.getInstance();
		fcal.set(Integer.parseInt(farr[0]),Integer.parseInt(farr[1]) - 1,Integer.parseInt(farr[2]));
		scal.set(Integer.parseInt(sarr[0]),Integer.parseInt(sarr[1]) - 1,Integer.parseInt(sarr[2]));
		System.out.println(fcal.get(Calendar.HOUR_OF_DAY) + ","+scal.get(Calendar.HOUR_OF_DAY));
		System.out.println(fcal.get(Calendar.MINUTE) + ","+scal.get(Calendar.MINUTE));
		System.out.println(fcal.get(Calendar.SECOND) + "," +scal.get(Calendar.SECOND));
		System.out.println(fcal.get(Calendar.MILLISECOND) + "," + scal.get(Calendar.MILLISECOND));
		long datecnt = (fcal.getTimeInMillis() - scal.getTimeInMillis())/(1000L*60*60*24);
//		long datecnt = (scal.getTimeInMillis() - fcal.getTimeInMillis())/(1000L*60*60*24);
		System.out.printf("%s -%s 일자의 차이 : %d\n",second,first,datecnt);
	}
}
