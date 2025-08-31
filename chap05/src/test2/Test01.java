package test2;

public class Test01 {
	public static void main(String[] args) {
		double div = (20.0 - 1.0) / 9;
		double startnum=1;
		for(int i=0;i<10;i++) {
			System.out.println(startnum);
			startnum +=div;
		}
	}
}
