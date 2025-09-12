package ex01_list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*
 * 화면에서 정수를 입력받아, 입력받은 숫자의 합계,평균,중간값 출력하기
 * 999 숫자가 입력되면 반복 종료. 999는 계산에서 제외함
 * 
 * 합계 : 전체 숫자의 합 출력
 * 평균 : 합계/요소의 갯수
 * 중간값 : 
 *    갯수가 홀수인 경우 정렬하여 가운데 인덱스의 값
 *    갯수가 짝수인 경우 정렬하여 가운데 2개값의 평균값
 */
public class Exam01 {
	public static void main(String[] args) {
		System.out.println("정수를 입력하세요(종료:999)");
		Scanner scan = new Scanner(System.in);
		List<Integer> list = new ArrayList<>();
		int sum = 0;
		while(true) {
			int num = scan.nextInt();
			if(num == 999) break;
			list.add(num);
			sum += num;
		}
		System.out.println(list + "=>합계:" + sum);
		System.out.println(list + "=>평균:" + (double)sum/list.size());
		//중간값
		Collections.sort(list);
		// 1 2 3   => 3/2 =>  1  list.get(1) => 중간값
		// 1 2 3 4 => 4/2 =>  2  (list.get(1) + list.get(2))/2 => 중간값
		int m = list.size() / 2;
		if(list.size() % 2 == 0) {
			System.out.println
			(list + "=>중간값:" + (list.get(m-1) + list.get(m))/2.0);
		} else {
			System.out.println(list + "=>중간값:" + list.get(m));
		}
	}
}
