package ex03_filestream;

import java.io.FileWriter;
import java.io.IOException;
/*
 * FileWriter 예제
 *   - 문자형 출력스트림
 *   - 주요메서드
 *     void write(int data) : 1char 출력
 *     void write(char[] buf) : buf의 내용을 출력
 *     void write(char[] buf,int start, int len) :
 *                              buf의 start 인덱스부터 len크기만큼 출력
 *     void write(String str) : str 문자열의 내용을 출력
 */
public class MainEx04_filewriter {
	public static void main(String[] args) throws IOException {
		System.out.println("out2.txt 파일에 내용이 저장됩니다.");
		FileWriter fw = new FileWriter("out2.txt");
		fw.write('1');fw.write('2');fw.write('3');
		fw.write('a');fw.write('b');fw.write('c');
		fw.write('가');fw.write('나');fw.write('다');
		char[] buf = "\nFileWriter 예제입니다.\n".toCharArray();
		fw.write(buf);
		fw.write(buf,5,6);
		fw.write("\nFileWriter 클래스는 문자열 출력이 가능합니다.\n");
		fw.flush();
		fw.close();
		
	}

}
