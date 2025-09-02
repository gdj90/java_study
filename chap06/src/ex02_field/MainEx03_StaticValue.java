package ex02_field;

public class MainEx03_StaticValue {
	public static void main(String[] args) {
		HandPhone hp1 = new HandPhone();
		hp1.color = "White";
		hp1.number = 1234;
		hp1.sno = ++HandPhone.cnt;
		System.out.println(hp1);
		HandPhone hp2 = new HandPhone();
		hp2.color = "Red";
		hp2.number = 5678;
		hp2.sno = ++HandPhone.cnt;
		System.out.println(hp1);
		System.out.println(hp2);
	}
}
