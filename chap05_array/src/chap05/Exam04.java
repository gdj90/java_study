package chap05;
/*
 * command 라인에서 숫자를 입력받아 숫자의 각 자리수의 합을 출력하기
 * 
 * java Exam04 1234 5678
 * 1+2+3+4=10
 * 5+6+7+8=26
 */
public class Exam04 {
	public static void main(String[] args) {
		if(args.length == 0) {
			System.out.println("숫자로된 파라미터를 command 라인에 입력하세요");
			return;
		}
		for(int i=0;i<args.length;i++) { //args[1] : 5678
			int sum = 0; //합계저장 변수
			String str = args[i];
			for(int j=0;j<str.length();j++) {
				char ch = str.charAt(j); //'1'
				if(ch >= '0' && ch <= '9') {
					System.out.print(ch + ((j== str.length()-1)?"=":"+"));
					sum += ch - '0';
				}
			}
			System.out.println(sum);			
		}
	}
}
