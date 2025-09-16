package ex04_iterator;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

/*
 * Enumeration 인터페이스: Iterator 의 구버전
 *                      Vector와 Hashtable에서만 사용이 가능한 반복자
 *  메서드
 *   hasMoreElements() : 조회될 객체 존재?     
 *   nextElement()     : 객체 조회하여 리턴          
 */
public class MainEx03_enumeration {
	public static void main(String[] args) {
		Vector<Object> vec = new Vector<>();
//		List<Object> vec = new Vector<>();
		vec.add("사과");
		vec.add("바나나");
		vec.add("체리");
		vec.add("망고");
		//List 객체이므로 Iterator객체 변환 가능
		Iterator<Object> it = vec.iterator(); 
		Enumeration<Object> e = vec.elements(); //구번전의 반복자
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		Hashtable<Integer,String> map = new Hashtable<>();
		map.put(1, "사과");
		map.put(2, "바나나");
		map.put(3, "체리");
		map.put(4, "망고");
		Enumeration<Integer> e2 = map.keys(); //키값들만 조회
		while(e2.hasMoreElements()) System.out.println(e2.nextElement());
		Enumeration<String> e3 = map.elements(); //value 들만 조회
		while(e3.hasMoreElements()) System.out.println(e3.nextElement());
		
		
	}
}
