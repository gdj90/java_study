package ex03_map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

/*
 * Map 구현 클래스
 *   HashMap   : (key,value) 쌍인 객체. 순서모름. 스레드에 동기화 되지 않은 메서드
 *                null값을 키로 사용 가능
 *   TreeMap   : (key,value) 쌍인 객체. key순으로 정렬
 *   Hashtable : (key,value) 쌍인 객체. 순서모름. 구버전의 클래스. 스레드에 동기화된 메서드
 *                null값을 키로 사용 불가
 */
public class MainEx04_hashtable {
	public static void main(String[] args) {
//		Hashtable<String,String> map = new Hashtable<>();
		Map<String,String> map = new Hashtable<>();
		map.put("학생", "student");
		map.put("선생", "teacher");
//		map.put(null, null);  //Hashtable 객체는 key가 null 안됨
		System.out.println(map);
//		HashMap<String,String> map2 = new HashMap<>();
		Map<String,String> map2 = new HashMap<>();
		map2.put("학생", "student");
		map2.put("선생", "teacher");
		map2.put(null, null);  //HashMap 객체는 key가 null 가능
		System.out.println(map2);
	}
}
