package chap05;
/*
 * str 문자열에 저장된 소문자의 갯수 출력하기
 * a : 6
 * b : 4
 * ...
 */
public class Exam03 {
	public static void main(String[] args) {
		String str = "abab efg higk abcd efg higk z";
		int[] cntArr = new int[26]; //
		// data : 2 2 0 0 0 0 0 0 0 0
		// index: 0 1 2 3 4 5 6 7 8 9
		
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i); //'b'
			if(ch >= 'a' && ch <= 'z') {
				cntArr[ch - 'a']++; //cntArr[1]++
			}
		}
		for(int i=0;i<cntArr.length;i++) {
			System.out.print((char)(i+'a') + "의 갯수:" + cntArr[i] + "=>");
			for(int j=0;j<cntArr[i];j++) System.out.print("*");
			System.out.println();
		}
	}
}
