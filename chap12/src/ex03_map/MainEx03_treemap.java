package ex03_map;

import java.util.Map;
import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.TreeMap;

/*
 * TreeMap : key 값 기준으로 정렬됨
 *           Map 객체임.
 *           SortedMap 인터페이스를 구현한 클래스
 */
public class MainEx03_treemap {
	public static void main(String[] args) {
		TreeMap<String, Book> books = new TreeMap<>();
//		NavigableMap<String, Book> books = new TreeMap<>();
		books.put("홍길동전", new Book("홍길동전","허균",10000));
		books.put("춘향전", new Book("춘향전","미상",15000));
		books.put("구운몽", new Book("구운몽","김만중",5000));
		System.out.println(books);
		System.out.println("첫번째 key:" + books.firstKey());
		System.out.println("첫번째 entry:" + books.firstEntry());
		System.out.println("마지막 key:" + books.lastKey());
		System.out.println("마지막 entry:" + books.lastEntry());
		System.out.println("춘향전 앞의 book :" + books.lowerEntry("춘향전"));
		System.out.println("춘향전 뒤의 book :" + books.higherEntry("춘향전"));
		System.out.println("춘향 앞쪽의 book :" + books.floorEntry("춘향"));
		System.out.println("춘향 뒤쪽의 book :" + books.ceilingEntry("춘향"));
	}
}
