package chap04;
/*
 * continue 구문 예제
 * continue : 반복문의 처음으로 제어를 이동
 * break : break가 속한 반복문을 벋어남
 */
public class LoopEx04 {
	public static void main(String[] args) {
		for(int i=2;i<=9;i++) { //i=3
			System.out.println("\n" + i + "단"); //3단
			for(int j=2;j<=9;j++) { //j=2
//				if(j==5) continue;
				if(j==5) break;
				System.out.println(i+"x"+j+"="+(i*j)); //2x4=8
			}
		}
	}
}
