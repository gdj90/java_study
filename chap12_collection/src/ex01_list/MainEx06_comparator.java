package ex01_list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Data2 {
	int value;
	Data2(int value) {
		this.value = value;
	}
	public String toString() {
		return value+"";
	}
}
public class MainEx06_comparator {
	public static void main(String[] args) {
		List<Data2> list = new ArrayList<>();
		list.add(new Data2(1));list.add(new Data2(3));
		list.add(new Data2(5));list.add(new Data2(2));
		list.add(new Data2(4));
	    System.out.println(list);
	    Comparator<Data2> c = new Comparator<>() {
			@Override
			public int compare(Data2 d1, Data2 d2) {
				return d1.value - d2.value;
			}
	    };
	    //람다형식으로 사용가능함
	    c = (d1,d2)-> d1.value - d2.value;
//	    Collections.sort(list,c);
	    //오름차순 정렬
	    Collections.sort(list,(d1,d2)-> d1.value - d2.value);
	    System.out.println(list);
	    //내림차순 정렬
	    Collections.sort(list,(d1,d2)-> d2.value - d1.value);	    
	    System.out.println(list);
	    
	}
}
