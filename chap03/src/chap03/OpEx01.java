package chap03;
/*
 * 단항연산자
 *   증감연산자 : ++,--
 *    ++ : 정수값을 1 증가
 *    -- : 정수값을 1 감소
 */
public class OpEx01 {
	public static void main(String[] args) {
		int x=5, y =5;
		x++; //6. 후치형
		y--; //4
		System.out.println("x="+x+",y="+y);
		++x; //7. 전치형 
		--y; //3
		System.out.println("x="+x+",y="+y);
		x=y=5;
		y=++x;  //x=6,y=6
		System.out.println("x="+x+",y="+y);
		x=y=5;
		y=x++;  //x=6,y=5
		System.out.println("x="+x+",y="+y); //
		x=5;
		System.out.println("x="+ x++); //x=5
		System.out.println("x="+ x);   //x=6
		System.out.println("x="+ ++x); //x=7
		y=5;
		System.out.println("y="+ y--);  //y=5
		System.out.println("y="+ --y);  //y=3
	}
}
