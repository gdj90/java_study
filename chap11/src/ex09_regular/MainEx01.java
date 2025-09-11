package ex09_regular;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * 정규 표현식 : 문자의 형식을 지정
 */
public class MainEx01 {
	public static void main(String[] args) {
		String[] data = {"bat","baby","bonus",
				       "c","cA","ca","c.","combat","count","cTT",
				       "data","disk"};
		/*
		 * c[A-Za-z]* : c문자로 시작하고, 뒤쪽에는 영문자 0개 이상되는 단어 선택
		 * c[A-Za-z]  : c문자로 시작하고, 뒤쪽에는 영문자 1개인 단어 선택
		 * c[A-Za-z]+ : c문자로 시작하고, 뒤쪽에는 영문자 1개 이상되는 단어 선택
		 * c[A-Za-z]? : c문자로 시작하고, 뒤쪽에는 영문자 0개,1개인 단어 선택
		 *  * : 0개이상
		 *  + : 1개이상
		 *  ? : 0,1개
		 */
		Pattern p = Pattern.compile("c[A-Za-z]?"); 
		for(String s : data) {
			Matcher m = p.matcher(s);//c
			if(m.matches()) System.out.print(s + ",");//c,
		}
		System.out.println();
		
		String names = "홍길동,  김삿갓,이몽룡,임꺼정";
		String arr[] = names.split("\\s*,\\s*");
		for(String s:arr) System.out.println(s);
	}
}
