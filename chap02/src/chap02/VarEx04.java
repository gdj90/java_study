package chap02;
/*
 * 서로다른 자료형의 연산
 *  1. 동일한 자료형끼리의 연산은 자료형 유지
 *  2. 연산의 결과는 큰 자료형임
 *  3. int 보다 작은 자료형 (byte,short,char)의 연산의 결과는 int임
 *  4. String 형과 기본자료형은 + 연산이 가능함. 연산의 결과는 String 임
 *  
 */
public class VarEx04 {
	public static void main(String[] args) {
		int i1 = 10;
		int i2 = 100;
		int i3 = i1 + i2;
		long l1 = 20;
		long l2 = i1 + l1; //long <= int + long
		float f1 = 10L + 1.0f;
		byte b1 = 10;
		byte b2 = 20;
		byte b3 = (byte) (b1 + b2);
		String str1 = "번호" + 1+2+3;
		/*
		 * 1. "번호"+1 => "번호1"
		 * 2. "번호1"+2 => "번호12"
		 * 3. "번호12"+3 => "번호123"
		 */
		String str2 = 1+2+3+"번";
		/*
		 * 1. 1+2=>3
		 * 2. 3+3=>6
		 * 3. 6 + "번" => "6번" 
		 */
		System.out.println("str1=" + str1 + ",str2=" + str2);
		System.out.println(5/2); //2 int/int=> int 
		
	}
}
