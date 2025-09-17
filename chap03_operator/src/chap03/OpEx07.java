package chap03;
/*
 * 대입연산자 : =, +=, -=,...
 *   a = 10; => a변수에 10을 저장.
 *   lvalue = rvalue
 *   lvalue : 변수여야함
 *   rvalue : 변수,상수, 수식 가능
 *   
 *   a + b = 10; (X)
 *   10 = 20;(X)
 *   a = a + b; (o)
 *   a = b+10; (o)
 */
public class OpEx07 {
	public static void main(String[] args) {
		int num = 100;
		System.out.println(num);//100
		num += 10; //num = num+10
		System.out.println(num); //110
		num -= 10; //num = num - 10
		System.out.println(num); //100
		num *= 5;  //num = num * 5 
		System.out.println(num); //500
		num /= 10; //num = num / 10
		System.out.println(num); //50
		num %= 3; //num = num % 3
		System.out.println(num); //2
		num += 2+3; //num = num + (2+3)
		System.out.println(num); //7
		
		byte b=1;
		b *=2;
		// b = b * 2;
		System.out.println(b); //2
		b *=2;
		System.out.println(b); //4
	}
}
