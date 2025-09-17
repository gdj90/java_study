package ex07_package;

//import java.util.Scanner; //Scanner 클래스의 이름은 java.util.Scanner 정의
import java.util.*; //java.util 패키지에 속한 클래스들은 패키지명 생략

/*
 * 패키지
 * package
 *   - 클래스,인터페이스의 모임
 *   - 클래스의 이름은 패키명을 포함함
 *   - package의 설정은 파일 처음에 한번만 구현해야함
 *     => 같은 파일에 존재하는 모든 클래스는 같은 패키지에 속한 클래스임. 
 *   - 폴더로 구분함.   
 * import : 클래스 이름의 패키지명을 생략할 수 있도록 미리 선언함    
 * 
 * 클래스의 패키지명을 생략할 수 있는 경우
 * 1. 같은 패키지에 속한 클래스는 패키지명 생략 가능
 * 2. java.lang 패키지에 속한 클래스는 패키지명 생략 가능
 * 3. import 구문으로 선언된 클래스는 패키지명 생략 가능
 *    * 표현방식으로는 해당 패키지의 모든 클래스들은 패키지명 생략 가능
 */
class Pack1 {
	void method() {
		System.out.println("ex07_package.Pack1 클래스의 method() 메서드");
	}
}
public class MainEx01 {
	public static void main(String[] args) {
		Pack1 p = new Pack1();
		p.method();
		Scanner scan = new Scanner(System.in);
		Date today = new Date();
	}
}
