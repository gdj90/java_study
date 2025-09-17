package ex05_wrapper;
//str의 숫자들의 합 출력하기
public class Exam01 {
	public static void main(String[] args) {
		String str = "10,20 , 30, 40,50   ";
		String[] arr = str.split(",");
		int sum = 0;
		for(String s : arr) {
			sum += Integer.parseInt(s.trim());
		}
		System.out.println(str + "문자열의 숫자의합:" + sum);
	}
}
