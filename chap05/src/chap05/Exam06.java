package chap05;
/*
 * 2차원 배열의 행의 합과 열의 합 출력하기
 * [결과]
 * 0행의합 : 60
 * 1행의합 : 75
 * 2행의합 : 450
 * 0열의합 : 125
 * 1열의합 : 195
 * 2열의합 : 265
 */
public class Exam06 {
	public static void main(String[] args) {
		int[][] arr = {
				{10,20,30,40},
				{15,25,35},
				{100,150,200}
		};
		//열의 갯수를 arr배열의 최대 컬럼수 만큼 배열크기 설정.
		int max = 0;
		for(int i=0;i<arr.length;i++) {
			if(max < arr[i].length) max = arr[i].length;
		}
		int colSum[] = new int[max];
		int sum = 0;
		for(int i=0;i<arr.length;i++) {
			sum = 0;
			for(int j=0;j< arr[i].length;j++) {
				sum += arr[i][j];
				colSum[j] += arr[i][j]; //열의 합 저장
			}
			System.out.println(i+"행의합 : " + sum);
		}
		for(int i=0;i<colSum.length;i++)
			System.out.println(i+"열의합 : " + colSum[i]);		
	}
}
