package ex03_function;

import java.util.function.Function;
import java.util.function.ToIntFunction;

/*
 * Function 계열 인터페이스
 *   매개변수,리턴값 모두 존재 : R applyXXX(T)
 *   
 *   Function<T,R> : R apply(T)
 *   BiFunction<T,U,R> : R apply(T,U)
 *   IntFunction<R> : R apply(int)
 *   DoubleFunction<R> : R apply(double)
 *   ToIntFunction<T> : int applyAsInt(T)
 *   ToDoubleFunction<T> : double applyAsDouble(T)
 *   ....
 */
public class MainEx01 {
	private static Student[] list= {
			new Student("홍길동",90,80,"경영"),
			new Student("김삿갓",95,70,"컴공"),
			new Student("이몽룡",85,75,"통계")
	};
	public static void main(String[] args) {
		System.out.print("학생의 이름 : ");
		for(Student s : list) 
			System.out.print(s.getName() + ",");
		System.out.println();
		System.out.print("학생의 이름 : ");
		Function<Student,String> f1 = s->s.getName();
		for(Student s : list) 
			System.out.print(f1.apply(s) + ",");
		System.out.println();
		System.out.print("학생의 이름 : ");
		printStudent(s->s.getName());
		System.out.println();
		System.out.print("영어 점수 : ");
		printStudent(s->s.getEng() + "");
		System.out.println();
		System.out.print("수학 점수 : ");
		printStudent(s->s.getMath() + "");
		System.out.println();
		System.out.print("전공명 : ");
		printStudent(s->s.getMajor());
		System.out.println();
		System.out.print("학생명(영어점수) : ");
		printStudent(s->s.getName() + "("+s.getEng()+")");
		System.out.println();
		System.out.print("수학 점수 : ");
		printInt(s->s.getMath());
		System.out.println();
		System.out.print("영어 점수 : ");
		printInt(s->s.getEng());
		System.out.println();
	}
	private static void printInt(ToIntFunction<Student> f) {
		for(Student s : list) {
			System.out.print(f.applyAsInt(s) + ",");
		}
	}
	private static void printStudent(Function<Student,String> f) {
		for(Student s : list) {
			System.out.print(f.apply(s) + ",");
		}
	}
}
