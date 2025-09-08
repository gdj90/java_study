package ex02_lambda;
/*
 * 매개변수,리턴값 모두 존재
 * {} 내부에 문장이 한개인 경우 {return } 생략 가능
 */
interface LambdaInterface3 {
	int method(int x, int y);
}
public class MainEx03 {
	public static void main(String[] args) {
		LambdaInterface3 f = null;
		f = (x,y)->{
			return x + y;
		};
		System.out.println("두수의 합:"+f.method(2, 5));
		//문장이 한개 이므로 return,{} 생략 하기 
		f = (x,y)->x+y;
		System.out.println("두수의 합:"+f.method(2, 5));
		f = (a,b)->a*b;
		System.out.println("두수의 곱:"+f.method(2, 5));
		f = (x,y)->x/y;
		System.out.println("두수의 나눈 몫:"+f.method(5,2)); //2
		f = (x,y)->x%y;
		System.out.println("두수의 나눈 나머지:"+f.method(5,2)); //1
		f = (x,y)->(x>y)?x:y;
		System.out.println("두수 중 큰수:"+f.method(5,2)); //5
		f = (x,y)->(x<y)?x:y;
		System.out.println("두수 중 작은수:"+f.method(5,2)); //2
	}
}
