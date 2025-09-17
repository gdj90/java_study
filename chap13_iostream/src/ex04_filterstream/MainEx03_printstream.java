package ex04_filterstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

/*
 * PrintStream
 * 1. OutputStream 의 하위 클래스 => 바이트형 출력스트림
 * 2. write 기능을 다양하게 확장함 => print,println, printf
 *    => 모든 자료형을 출력기능
 *    => 예외처리 생략 기능추가
 * 3. 표준출력(System.out),표준오류(System.err) 자료형임   
 * 4. 객체 생성시 바이트형출력스트림(OutputStream)을 매개변수로 받음
 */
public class MainEx03_printstream {
	public static void main(String[] args) throws FileNotFoundException {
		FileOutputStream fos = new FileOutputStream("print.txt");
		PrintStream ps = new PrintStream(fos);
		ps.println("홍길동");
		ps.println(1234);
		ps.println(true);
		ps.println(65);
		ps.write(65); //A
		ps.write(97); //a
		ps.flush();
		ps.close();		
	}
}
