package exam0919;
/* 
나누어 떨어지는 숫자 배열

문제 설명
array의 각 element 중 divisor로 나누어 떨어지는 값을 오름차순으로 정렬한 배열을 반환하는 함수, 
solution을 작성해주세요.
divisor로 나누어 떨어지는 element가 하나도 없다면 배열에 -1을 담아 반환하세요.

제한사항
arr은 자연수를 담은 배열입니다.
정수 i, j에 대해 i ≠ j 이면 arr[i] ≠ arr[j] 입니다.
divisor는 자연수입니다.
array는 길이 1 이상인 배열입니다.

입출력 예
arr	          divisor	return
[5, 9, 7, 10]	5	     [5, 10]
[2, 36, 1, 3]	1	     [1, 2, 3, 36]
[3,2,6]	        10	     [-1]

입출력 예 설명
입출력 예#1
arr의 원소 중 5로 나누어 떨어지는 원소는 5와 10입니다. 따라서 [5, 10]을 리턴합니다.

입출력 예#2
arr의 모든 원소는 1으로 나누어 떨어집니다. 원소를 오름차순으로 정렬해 [1, 2, 3, 36]을 리턴합니다.

입출력 예#3
3, 2, 6은 10으로 나누어 떨어지지 않습니다. 나누어 떨어지는 원소가 없으므로 [-1]을 리턴합니다.  
 */

import java.util.Set;
import java.util.TreeSet;

public class Test03 {
   public static int[] solution(int[] arr, int divisor) {
	  Set<Integer> set = new TreeSet<>(); //arr의 값은 중복없음
	  for(int a : arr) {
		  if(a%divisor == 0) {
		     set.add(a);
		  }
	  }
	  int[] answer = null;
	  if (set.size() > 0) { //배수가 있는 경우
        answer = new int[set.size()];
        int i=0;
        for(int a : set) {
        	answer[i++] = a;
        }
	  } else  //배수가 없는 경우 
	    answer = new int[] {-1};
		  
      return answer;
   }
	
	public static void main(String[] args) {
		for(int i :solution(new int[]{5, 9, 7, 10}, 5))
			System.out.print(i + ",");
		System.out.println();
		
		for(int i :solution(new int[]{2, 36, 1, 3}, 1))
			System.out.print(i + ",");
		System.out.println();
		for(int i :solution(new int[]{3,2,6}, 10))
			System.out.print(i + ",");
		System.out.println();
	}
}
