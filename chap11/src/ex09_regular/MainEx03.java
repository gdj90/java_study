package ex09_regular;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainEx03 {
	public static void main(String[] args) {
		String source = "핸드폰:010-1111-2222,집:02-123-45678"
				+ "이메일:regular@aaa.bbb,계좌번호:301-01-123456";
//		String telP = "(0\\d{1,2})-(\\d{3,4})-(\\d{4})";
		String telP = "(0[0-9]{1,2})-([0-9]{3,4})-([0-9]{4})";
		Pattern p = Pattern.compile(telP);
		Matcher m = p.matcher(source);
		int i = 0;
		System.out.println("전화번호:");
		while(m.find()) { //source에서 패턴에 맞는 문자열을 찾아서 리턴
			System.out.println(++i+":" + m.group() + "=>" +
		                m.group(1) + "," + m.group(2) + "," + m.group(3));
		}
		System.out.println("이메일:");
		i=0;
//		String emailP = "(\\w+)@(\\w+).(\\w+)";
		String emailP = "([0-9A-Za-z]+)@([0-9A-Za-z]+).([0-9A-Za-z]+)";
		p = Pattern.compile(emailP);
		m = p.matcher(source);
		while(m.find()) { //source에서 패턴에 맞는 문자열을 찾아서 리턴
			System.out.println(++i+":" + m.group() + "=>" +
		                m.group(1) + "," + m.group(2) + "," + m.group(3));
		}
		System.out.println("계좌번호:");
		i=0;
//		String accountP = "(\\d{3})-(\\d{2})-(\\d{6})";
		String accountP = "([0-9]{3})-([0-9]{2})-([0-9]{6})";
		p = Pattern.compile(accountP);
		m = p.matcher(source);
		while(m.find()) { //source에서 패턴에 맞는 문자열을 찾아서 리턴
			System.out.println(++i+":" + m.group() + "=>" +
		                m.group(1) + "," + m.group(2) + "," + m.group(3));
		}
		
		
	}
}
