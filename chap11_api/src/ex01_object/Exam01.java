package ex01_object;
/*[결과]
 * 다른 Number 객체임
 * 같은 숫자 임
 * 출력하기
 */
class Number {
	int num;
	public Number(int num) {
		this.num = num;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Number) {
			Number n = (Number)obj;
			return this.num == n.num;
		} else return false;
	}	
}
public class Exam01 {
	public static void main(String[] args) {
		Number n1 = new Number(10);
		Number n2 = new Number(10);
		if(n1 == n2) System.out.println("같은 Number 객체임");
		else System.out.println("다른 Number 객체임");
		if(n1.equals(n2)) System.out.println("같은 숫자 임");
		else System.out.println("다른 숫자 객체임");
	}
}
