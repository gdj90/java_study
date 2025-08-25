package test;

public class Test01 {
	public static void main(String[] args) {
		// 1. 잘못된 문장을 골라내고 그 이유를 설명하시오.
		char a = 'a'; //정상
//		char b = "a"; //오류. 문자열임
		String c = "a"; //정상
//	    String d='a'; //오류. 
//	    char   e='ab'; //오류. char형은 문자 한개만 저장가능 
	    String f = "ab"; //정상
//	    char   g = ''; //오류. char형은 문자 한개만 저장가능. 빈문자 안됨
		String h = ""; //정상
		
//	    byte   var1 = 128; //오류. -128 ~ 127
		short var2 = 128;  //정상
//		int    var3 = 128L;  //오류. L 접미사는 long타입 리터널. 
		long var4 = 128L; //정상
//		float  var5 = 1.2; //오류. 실수형 리터널을 기본형이 double임 
		double var6 = 1.2; //정상
		float var7 = '1'; //정상  float <= char
		System.out.println("var7=" + var7);
//		float var8 = "1"; //오류. 기본형 <= 참조형 형변환 불가
	}
}
