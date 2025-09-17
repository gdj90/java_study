package chap05;
/*
 * 2차원 배열 선언,생성,초기화하기
 */
public class ArrayEx08 {
	public static void main(String[] args) {
		int[][] arr = {	{10,20,30},{40,50,60}}; //2행3열
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print("arr["+i+"]["+j+"]="+arr[i][j] + "\t");
			}
			System.out.println();
		}
		arr[0] = new int[] {100,200};
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print("arr["+i+"]["+j+"]="+arr[i][j] + "\t");
			}
			System.out.println();
		}
	//	arr[2] = new int[] {300,400}; ArrayIndexOutOfBoundsException 예외발생함. 
		
	}
}
