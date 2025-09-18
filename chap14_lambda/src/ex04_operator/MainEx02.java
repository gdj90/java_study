package ex04_operator;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

import ex03_function.Student;

public class MainEx02 {
	public static void main(String[] args) {
		List<Student> list = Arrays.asList(
				new Student("홍길동",90,70,"경영"),
				new Student("김삿갓",80,75,"컴공"),
				new Student("이몽룡",85,60,"통계"));
		
		System.out.println("영어점수 최고점:" + minOrMax(list,
                            (a,b)->a.getEng() > b.getEng()?a:b));
		System.out.println("수학점수 최고점:" + minOrMax(list,
                (a,b)->a.getMath() > b.getMath()?a:b));
		System.out.println("영어점수 최저점:" + minOrMax(list,
                (a,b)->a.getEng() < b.getEng()?a:b));
		System.out.println("수학점수 최저점:" + minOrMax(list,
				(a,b)->a.getMath() < b.getMath()?a:b));
		System.out.println("합계점수 최고점:" + minOrMax(list,
                (a,b)->(a.getEng() + a.getMath()) > 
                       (b.getEng() + b.getMath())?a:b));
		System.out.println("합계점수 최저점:" + minOrMax(list,
                (a,b)->(a.getEng() + a.getMath()) < 
                (b.getEng() + b.getMath())?a:b));
	}
	private static Student minOrMax(List<Student> list,
			          BinaryOperator<Student> f) {
		Student result = list.get(0);
		for(Student s : list) {
			result = f.apply(result, s);
		}
		return result;
	}
}