package ex02_string;
/*
 * String 클래스의 주요 메서드
 */
public class MainEx02 {
	public static void main(String[] args) {
		String s = new String("ABCDEFGH");
		//s.charAt(4) : s문자열중 4번인덱스(5번째)에 해당하는 문자(char)를 리턴
		System.out.println(s.charAt(4));//E
		//s.compareTo("abc") : 결과가 음수인 경우 : s 문자열이 "abc"보다 앞의 문자
		//                     정렬에 관련된 메서드
		System.out.println(s.compareTo("abc"));//-32
		//s.compareToIgnoreCase("abcdefgh") : 대소문자 상관없이 정렬
		//                           결과가 0 : 2개의 문자열은 같다
		System.out.println(s.compareToIgnoreCase("abcdefgh")); //0
		//s.endsWith("GH") : s문자열의 끝이 GH?
		System.out.println(s.endsWith("GH")); //true
		//s.startsWith("AB") : s문자열의 시작이 AB?
		System.out.println(s.startsWith("AB")); //true
		System.out.println(s.equals("ABCDEFGH"));  //true
		//equalsIgnoreCase("abcdefgh") : 대소문자 상관없이 문자열 비교
		System.out.println(s.equalsIgnoreCase("abcdefgh")); //true
		System.out.println();
		s = "This is a String";
		//s.indexOf('i') : s 문자열에서 i 문자의 인덱스값 리턴
		System.out.println(s.indexOf('i')); //2
		//s.indexOf("is") : s 문자열에서 is 문자열의 인덱스값 리턴
		System.out.println(s.indexOf("is")); //2
		//s.lastIndexOf('i') : s문자열에서 i 뒤에서 첫번째 인덱스를 리턴.
		//                     인덱스 앞에서부터 0 시작함
		System.out.println(s.lastIndexOf('i')); //13
		//s.indexOf("i",3) : s 문자열에서 3번인덱스 부터 i문자의 인덱스 리턴
		System.out.println(s.indexOf("i",3));//5
		//문자열의 길이
		System.out.println(s.length()); //16
		
		//replace : 문자열 치환
		System.out.println(s.replace("is", "QR"));
		//replaceAll : 문자열 치환. 정규식 활용 가능
		System.out.println(s.replaceAll("is", "QR"));
		
	}
}
