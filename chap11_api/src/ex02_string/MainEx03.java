package ex02_string;
//String : 정적인 문자열, 변경할 수 없는 문자열
public class MainEx03 {
	public static void main(String[] args) {
		String str = "ABC123";
		System.out.println("main:" + str);
		str = change(str);
		System.out.println("change 후:" + str);
	}

	private static String change(String str) {
		str += 456;
		System.out.println("change:" + str);
		return str;
	}
}
