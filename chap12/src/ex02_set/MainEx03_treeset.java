package ex02_set;

import java.util.Set;
import java.util.TreeSet;
/*
 * TreeSet : 중복불가, 정렬됨
 *   중복 검증 : 정렬관련 메서드의 리턴값이 0인 경우도 인식 
 */
public class MainEx03_treeset {
	public static void main(String[] args) {
//		Set<String> set = new TreeSet<>();
		//대소문자 구분없이 정렬되도록 객체 설정 : Compararator 인터페이스 이용
		//s1.compareToIgnoreCase(s2) : 결과가 0인 경우 중복으로 인식
		Set<String> set = new TreeSet<>((s1,s2)->s1.compareToIgnoreCase(s2));
//		Set<String> set = new TreeSet<>((s1,s2)->0);
		set.add("abc");
		set.add("alien");
		set.add("bat");
		set.add("azz");
		set.add("car");
		set.add("Car");
		System.out.println(set);
	}
}
