package chap03;
/*
 * char 연산
 */
public class OpEx08 {
	public static void main(String[] args) {
		char ch = 'A';
		ch += 1;
		System.out.println(ch); //B
		ch = (char)(ch + 1);
		System.out.println(ch); //C
		ch += 32;
		System.out.println(ch); //c
		
		System.out.println("A=" + (int)'A');
		System.out.println("B=" + (int)'B');
		System.out.println("a=" + (int)'a');
		System.out.println('a'-'A'); //32
		System.out.println("Z=" + (char)('A'+25)); //Z=Z
		
		/*
		 * A : 65 : 01000001
		 * B : 66 : 01000010
		 * a : 97 : 01100001
		 * b : 98 : 01100010
		 */
		
		char chnum1 = '3';
		char chnum2 = '8';
		System.out.println("3+8="+(chnum1-'0'+chnum2-'0')); //3+8=11
	}
}
