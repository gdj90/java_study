package chap02;
/*
 * 문자형 char => 기본자료형. 한개의 문자만 저장 가능함. 작은 따옴표로 표현
 * 문자열형 String => 참조자료형. 0개이상의 문자들을 저장 가능함. 큰따옴표로 표현 
 */
public class VarEx02 {
	public static void main(String[] args) {
		char c1 = 'A'; //한개의 문자만 저장 가능
//		char c2 = 'AB'; //2개 문자 저장 불가
//		char c3 = '';  //한개의 문자는 있어야 함.
		String s1 = "A";
		System.out.println("c1=" + c1);
		System.out.println("s1=" + s1);
		String s2 = "ABCDEFGHI";
		System.out.println("s2=" + s2);
		String s3 = "";
		System.out.println("s3=" + s3);
		
		//식별자는 예약어 불가
//		char true = '참'; //예약어 사용 불가
		char True = '참'; //변수명은 소문자로 시작함(권장) 권장하지 않음.
		int max_num = 100; //권장사항. 권장하지 않음. int maxNum= 100
//		int max-num=1000; // -은식별자로 사용 불가. _, $만 사용 가능
		//숫자로 시작하는 식별자 불가
//		int 7up = 7; //숫자시작 안됨
		int top10 = 10; //숫자 포함 가능. 
		//_,$ 문자로는 시작 가능함
		char $harp = 'S';		
	}
}
