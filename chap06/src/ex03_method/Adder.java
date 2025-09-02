package ex03_method;
/*
 * 멤버 메서드(함수,Function)
 * 
 * 구성 요소
 * [접근제어자][제어자] 리턴타입 메서드이름(매개변수목록) => 선언부
 * {  ......   return 값;   }          => 구현부. 알고리즘 구현
 * 
 *  리턴타입 : 메서드 종료 후 전달되는 값의 자료형 
 *           void : 전달되는 값이 없음. 리턴값이 없음
 *  메서드이름 : 식별자. 소문자로시작. Camel 방식
 *  매개변수목록 : 메서드를 호출할때 전달되는 값의 자료형과변수명 설정         
 *              전달할 값이 없는 경우 () 표현함
 *  return : 메서드 종료
 *      리턴타입이 void 인경우 : 생략 가능. 
 *      리턴타입이 void가 아닌경우 : 생략 불가. return 리턴값;
 *              리턴값은 리턴타입의 자료형이거나, 리턴타입으로 자동형변환이 되어야 함            
 */
public class Adder {
	int add1(int a, int b) {
		return a + b;
	}
	long add2 (int a, int b) {
		return a + b;
	}
	void add3 (int a, int b) {
		System.out.println(a + b);
//		return; //생략가능
	}

}
