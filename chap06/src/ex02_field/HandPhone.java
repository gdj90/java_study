package ex02_field;

public class HandPhone {
	String color;  //인스턴스변수. null
	int number;    //인스턴스변수. 0
	int sno;       //인스턴스변수. 0
	static int cnt; //클래스변수. 0
	public String toString() {
		return "핸드폰생산번호:"+sno +"=>" + color + "," + number +
				",핸드폰 생산 갯수:" + cnt;
	}
}
