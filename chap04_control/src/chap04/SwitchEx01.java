package chap04;
/*
 * switch(조건값) {
 *   case 값1 : 문장들1;break;
 *   case 값2 : 문장들2;break;
 *   ...
 *   default : 문장들;break;
 * }
 * 
 * break : switch 구문 종료
 */
public class SwitchEx01 {
	public static void main(String[] args) {
		int score = 100;
		switch(score/10) { //10
		  case 10:
		  case 9 : System.out.println("A학점");break;
		  case 8 : System.out.println("B학점");break;
		  case 7 : System.out.println("C학점");break;
		  case 6 : System.out.println("D학점");break;
		  default : System.out.println("F학점");break;
		}
	}
}
