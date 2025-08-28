package chap05;
/*
 * 2차원 배열
 * 2차원 배열은 1차원 배열의 참조변수의 배열임. 배열의 배열로 표현한다.
 */
public class ArrayEx07 {
	public static void main(String[] args) {
		int[] arr[] = new int[3][2];
		arr[0][0] = 10;
		arr[0][1] = 20;
		arr[1][0] = 30;
		arr[1][1] = 40;
		arr[2][0] = 50;
		arr[2][1] = 60;
		for(int i=0;i<arr.length;i++) { //i=1
			for(int j=0;j<arr[i].length;j++) { //j=0
				System.out.print("arr[" + i+"]["+j+"]="+arr[i][j] + "\t");
				//arr[1][0]=30  arr[1][1]=30
			}
			System.out.println();
		}
		System.out.println("1차원 배열의 객체 변경하기");
		int[] arr1 = {1,2,3,4,5};
		arr[1] = arr1;
		for(int i=0;i<arr.length;i++) { //i=1
			for(int j=0;j<arr[i].length;j++) { //j=0
				System.out.print("arr[" + i+"]["+j+"]="+arr[i][j] + "\t");
			}
			System.out.println();
		}
		//arr2 : 1차원배열의 참조변수.
		//arr2 : 100,200,300 요소를 저장하기
		//arr2 배열을 arr[2] 저장하기
		//저장된 arr을 출력하기
		int[] arr2 = {100,200,300};
		arr[2]=arr2;
		for(int i=0;i<arr.length;i++) { //i=1
			for(int j=0;j<arr[i].length;j++) { //j=0
				System.out.print("arr[" + i+"]["+j+"]="+arr[i][j] + "\t");
			}
			System.out.println();
		}
		for(int i=0;i<arr.length;i++) 
			System.out.println(i + "행:length=" + arr[i].length);		
	}
}
