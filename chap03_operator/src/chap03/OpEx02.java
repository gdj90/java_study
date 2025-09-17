package chap03;
/*
 * 단항연산자  
 *    부호연산자 : +,-
 *     + : 피연산자의 부호 유지
 *     - : 피연산자 부호 변경. 음수=>양수, 양수=>음수
 *    논리부정연산자 : !(not)
 *      boolean 에서 사용함
 *      !true => false
 *      !false => true 
 *    
 */
public class OpEx02 {
	public static void main(String[] args) {
		//부호연산자
		int x = -10;
		System.out.println("x=" + +x);//-10
		System.out.println("x=" + -x);//10
		x=10;
		System.out.println("x=" + +x);//10
		System.out.println("x=" + -x);//-10
		System.out.println(!true); //false
		System.out.println(!false);//true
		
		System.out.println(5 != 4); //5와4는 같지 않다
		System.out.println(!(5 == 4));
	}
}
