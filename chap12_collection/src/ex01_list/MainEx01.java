package ex01_list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/*
 *  Collection 인터페이스 : 여러개의 객체를 저장할 수 있는 기능
 *  하위인터페이스
 *    List 인터페이스 : 순서 유지. => 인덱스(첨자) 사용가능. get(인덱스)
 *                   가변배열 객체라고도 함 
 *         구현클래스
 *           ArrayList : 대표적인 List 클래스
 *           Vector    : Collection 프레임워크 이전에 사용된 클래스.
 *                       기존함수와 List인터페이스의 함수가 혼합됨
 *           LinkedList: Queue 인터페이스의 구현 클래스임.              
 *    Set 인터페이스 : 객체 중복 불가
 *         구현클래스 : HashSet, TreeSet, LinkedHashSet
 */
public class MainEx01 {
	public static void main(String[] args) {
		/*
		 * <Integer> : 제네릭. 요소의 자료형을 미리 설정.
		 *             List 객체의 요소는 Integer만 가능함.
		 *             자료형이 틀린 객체가 저장시 컴파일 오류 발생
		 *  제넥릭 표현이 없으면 기본적으로 Object 형임. => warning이 발생   
		 *  제넥릭에서 사용되는 자료형은 참조자료형이어야 함. 기본자료형 불가         
		 *  기본자료형은 자동으로 Boxing 되어 Wrapper 클래스의 객체로 저장
		 */
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);list.add(2);list.add(5);
		list.add(4);list.add(3);list.add(0);
//		list.add("1"); //list는 Integer 객체만 저장. String 객체는 저장 불가
		System.out.println(list);
		//List는 순서유지가 됨. 인덱스 사용 가능
		for(int i=0;i < list.size();i++) {
			System.out.println(list.get(i));
		}
		/*
		 * Collection : 인터페이스. List,Set의 상위 인터페이스
		 * Collections : 클래스. Collection 객체의 보조 기능을 담당.
		 *                      정렬, 섞기 등등
		 */
		//정렬하기
		Collections.sort(list);
		System.out.println(list);
	}
}
