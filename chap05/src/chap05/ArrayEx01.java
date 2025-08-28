package chap05;
/*
 * 배열의 선언과 초기화
 * 
 * 한개의 참조변수는 한개의 객체만 참조가 가능함
 * 한개의 객체는 여러개의 참조변수로 참조 될수 있다.
 */
public class ArrayEx01 {
	public static void main(String[] args) {
		int arr[]; //배열의 선언
		arr = new int[5]; //배열 생성. 배열 객체 생성
		/*
		 * - new 예약어의 기능
		 * 1. 객체 생성. int값을 저장할 수 있는 변수5개 생성
		 * 2. 기본값 초기화. 0으로 초기화
		 *     숫자 : 0
		 *     boolean : false
		 *     그외 : null
		 * - =대입연산자로 arr 참조변수에 배열 객체의 참조값이 저장.    
		 */
		arr[0] = 10; //초기화. 배열의 인덱스를 이용하여 값을 초기화
		arr[1] = 20;
		//arr.length : 5. 상수값. 변경불가
		for(int i=0;i<arr.length;i++) //i : 0 ~ 4까지 변경
			System.out.println("arr[" + i+"]=" + arr[i]);
//		arr.length = 10; // 변경불가
		
		int[] arr2 = new int[3]; //배열의 선언, 생성
		arr2[0]=100;
		arr2[1]=200;
		for(int i=0;i<arr2.length;i++) //i : 0 ~ 2까지 변경
			System.out.println("arr2[" + i+"]=" + arr2[i]);
		arr2 = arr;  //arr 참조변수와, arr2 참조변수는 같은 객체를 참조함. 
		System.out.println("arr2=arr 문장 실행 이후 : ");
		for(int i=0;i<arr.length;i++) 
			System.out.println("arr[" + i+"]=" + arr[i]);
		for(int i=0;i<arr2.length;i++)
			System.out.println("arr2[" + i+"]=" + arr2[i]);
		arr[3] = 500;
		System.out.println("arr[3] = 500 문장 실행 후 : ");
		for(int i=0;i<arr.length;i++) 
			System.out.println("arr[" + i+"]=" + arr[i]);
		for(int i=0;i<arr2.length;i++)
			System.out.println("arr2[" + i+"]=" + arr2[i]);
		
		//개선된 for 구문 : foreach 구문이라고도 함
		//int a : arr 배열의 요소(element)의 값.
		//인덱스 사용 불가. 
		for(int a : arr) System.out.println(a);
	}
}
