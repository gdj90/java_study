package ex01_list;

import java.util.ArrayList;
import java.util.List;
//subList() : 부분리스트
public class MainEx03_sublist {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);list.add(2);list.add(5);
		list.add(4);list.add(3);list.add(0);list.add(3);	
		//list.subList(1, 4) : list에서 1번인덱스부터 3번인덱스까지를 부분리스트로 리턴
		List<Integer> list2 = list.subList(1, 4); //얕은 복사
		System.out.println(list);
		System.out.println(list2);
		list2.add(100);
		System.out.println(list);
		System.out.println(list2);
		//깊은복사
		List<Integer> list3 = new ArrayList<>(list.subList(1,4));
		System.out.println(list);
		System.out.println(list3);
		list3.add(200);
		System.out.println(list);
		System.out.println(list3);
		//remove(0)
		System.out.println(list.remove(0)); //remove(int index)
		System.out.println(list);
		Integer n = 0;
		System.out.println(list.remove(n)); //remove(int index)
		System.out.println(list);
	}
}
