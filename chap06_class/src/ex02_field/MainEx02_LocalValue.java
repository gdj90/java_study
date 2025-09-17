package ex02_field;
/*
 * 지역변수는 반드시 초기화 필요
 */
public class MainEx02_LocalValue {
	public static void main(String[] args) {
		int num;
//		System.out.println(num); //초기화 되지 않은 지역변수는 출력불가
		boolean b = true;
		if(b) num = 100;
//		System.out.println(num); //초기화 되지 않을 가능성이 있음. 출력불가
		if(b) num=100;
		else num=200;
		System.out.println(num); //초기화 되지 않을 가능성 없음. 출력가능
		String grade; //선언시 초기화 하는것을 권장함
		int score = 80;
		if(score >=90) grade = "A";
		else if(score >= 80) grade = "B";
		else if(score >= 70) grade = "C";
		else if (score > 60) grade = "D";
//		else grade = "F";
//		System.out.println(score + ":" + grade + "학점");
		
		switch(score / 10) {
		case 9 : grade ="A";break;
		case 8 : grade ="B";break;
		case 7 : grade ="C";break;
		case 6 : grade ="D";break;
		default : grade = "F";
		}
		System.out.println(score + ":" + grade + "학점");
	}
}
