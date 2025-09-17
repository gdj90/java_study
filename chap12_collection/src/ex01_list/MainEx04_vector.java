package ex01_list;

import java.util.List;
import java.util.Vector;

/*
 * Vector 클래스 
 *   - Collection 프레임워크 이전의 클래스
 *   - List 구현클래스
 *   - 이전의 메서드와 혼합됨
 *   - Stack의 상위 클래스
 */
public class MainEx04_vector {
	public static void main(String[] args) {
		Vector<Double> list = new Vector<>();
//		List<Double> list = new Vector<>();
		list.add(0.3);
		list.add(Math.PI);
		list.addElement(5.0); //구버전의 메서드
		System.out.println(list);
		//요소의 위치 찾기
		int index = list.indexOf(5.0);
		System.out.println("5.0의 위치:" + index);
		System.out.println("3.0의 위치:" + list.indexOf(3.0));
		//요소가 존재?
		if(list.contains(5.0)) {
			System.out.println("5.0은 list의 요소임");
		} else {
			System.out.println("5.0은 list의 요소가 아님");
		}
		//요소 제거
		/*
		 * Object remove(int index): index에 해당하는 요소를 제거. 제거된 요소 리턴
		 * boolean remove(Object o) : o 객체 제거. 제거성공:true, 실패:false
		 */
		System.out.println("list 의 크기:" + list.size());
		double removeObj = list.remove(0);
		System.out.println(removeObj + "객체 제거");
		System.out.println(list);
		System.out.println(list.remove(0.3));
		System.out.println(list);
		list.removeElement(0.3); //구버전의 메서드
		System.out.println(list);
	}
}
