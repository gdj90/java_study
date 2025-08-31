package chap04;
/*
 * 가로 구구단 출력하기
 * 2*2=4    3*2=6  4*2=8 5*2=8 ... 9*2=18
 * 2*3=6
 * ...
 * 2*9=18   3*9=27      9*9=81 
 */
/*
 * i:단, j:항
 * 2     2
 * 3     2
 * 4     2
 * 5     2
 * 6     2
 * 7     2
 * 8     2
 * 9     2
 * 2     3
 * 3     3
 * 4     3 
 * ...
 * 
 */
public class Test12 {
	public static void main(String[] args) {
		for(int i=2;i<=9;i++) {
			System.out.print(" "+i+"단\t");
		}
		System.out.println();
		for(int j=2;j<=9;j++) {
			for(int i=2;i<=9;i++) {
				System.out.print(i +"x" + j + "=" + (i*j) + "\t");
			}
			System.out.println();
		}
	}
}
