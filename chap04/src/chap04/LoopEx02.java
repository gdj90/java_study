package chap04;
/*
 * 중첩 반복문 : 반복문 내에 반복문 존재
 */
public class LoopEx02 {
	public static void main(String[] args) {
		for(int i=2;i<=9;i++) { //i=10
			System.out.println("\n" + i + "단");        //9단
			for(int j=2;j<=9;j++) {//j=10
				System.out.println(i+"x"+j+"="+(i*j)); //9x9=81
			}
		} //반복문의 끝
	}
}
