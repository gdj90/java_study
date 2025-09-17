package chap04;
/*
 * 조건값으로 사용 가능한 자료형
 * byte,short,int,char,String
 * 조건값으로 사용 불가능한 자료형
 * boolean,long,float,double
 */
public class SwitchEx03 {
	public static void main(String[] args) {
		String str = "1";
		switch(str) {
		case "1" : System.out.println(str);break;
		default :
			System.out.println("default 구문 실행");
		}
		char ch = 'A';
//		int ch = 'A';
//		byte ch = 'A';
//		short ch = 'A';
//		double ch = 'A'; //불가
		switch(ch) {
		case 'A' : System.out.println(ch);break;
		default :
			System.out.println("default 구문 실행");
		}
		
		//중첩 switch 구문 가능
		int a = 1, b=1;
		switch(a) {
		   case 1: switch(b) {
		             case 2: System.out.println("a="+a+",b="+b); break;
		           }
		           break;
		   default : 
			   System.out.println("default 구문 실행");
		}
	}
}
