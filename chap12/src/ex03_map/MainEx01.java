package ex03_map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * Map 인터페이스 구현 객체
 * - (key,value) 쌍인 객체들의 모임
 * - key값은 중복 불가. value는 중복가능
 * - 구현클래스
 *   HashMap   : (key,value(객체))의 쌍인 객체들의 모임
 *   Hashtable : (key,value(객체))의 쌍인 객체들의 모임. 이전클래스
 *   TreeMap   : (key,value(객체))의 쌍인 객체들의 모임. 키값으로 정렬되어 출력
 * - 주요 메서드
 *   put(key,value) : map에 데이터 추가. 키값이 존재하는 경우 value값을 수정  
 *   get(key)       : map 객체 중 키값인 value값 리턴
 *   size()         : map 객체에 저장된 (key,value)쌍인 객체의 갯수
 *   Set<Key_T> keySet() : map 객체 중 key값들만 리턴 
 *   Collection<Value_T> values() : map 객체 중 value값들만 리턴
 *   Set<Map.Entry<Key_T,Value_T>> entrySet() : map 객체를 (key,value)쌍인 객체로
 *                                             리턴
 *   Value_T remove(key) : key값의 Map.Entry 객체 제거. value값 리턴                                          
 *   
 * - Map.Entry<T1,T2> : (key,value)쌍인 객체 자료형. Map인터페이스의 내부인터페이스형
 *                    T1 getKey() : (key,value) 쌍인 객체 중 key부분 리턴
 *                    T2 getValue() : (key,value) 쌍인 객체 중 value부분 리턴  
 */
public class MainEx01 {
	public static void main(String[] args) {
		String[] names = {"홍길동","김삿갓","이몽룡","임꺽정","김삿갓"};
		int[] nums = {1234,4567,2350,9870,3456};
		Map<String,Integer> map = new HashMap<>();
		for(int i=0;i<names.length;i++)
			map.put(names[i], nums[i]);
		System.out.println(map);
		System.out.println("map 객체의 요소의 갯수:" + map.size());
		System.out.println("홍길동의 전화번호 :" + map.get("홍길동"));
		System.out.println("가가가의 전화번호 :" + map.get("가가가"));
		System.out.println
		    ("map 객체에서 key들만 조회 : keySet():" + map.keySet());
		System.out.println
	        ("map 객체에서 value들만 조회 : values():" + map.values());
		System.out.println
        ("map 객체에서 (key,value)쌍인 객체들 조회 : entrySet():" + map.entrySet());
		System.out.println();
		System.out.println("keySet()으로 조회하기");
		Set<String> keys = map.keySet();
		for(String k : keys) {
			System.out.println(k + "=" + map.get(k));
		}
		System.out.println();
		System.out.println("values() 조회하기");
		Collection<Integer> values = map.values();
		for(Integer v : values) {
			System.out.println(v);
		}
		System.out.println();
		System.out.println("entrySet() 조회하기");
		Set<Map.Entry<String, Integer>> entrys = map.entrySet();
		for(Map.Entry<String, Integer> m : entrys) {
			System.out.println(m.getKey() + "=" + m.getValue());
		}
		System.out.println("홍길동 객체 제거");
		System.out.println("제거된 전화번호:" + map.remove("홍길동"));
		System.out.println("map 객체의 요소의 갯수:" + map.size());
		System.out.println(map);
	}
}
