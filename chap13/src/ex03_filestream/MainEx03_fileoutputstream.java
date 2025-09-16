package ex03_filestream;

import java.io.FileOutputStream;
import java.io.IOException;

/*
 * FileOutputStream 예제
 *  - 주요메서드
 *     void write(int data) : 1byte를 출력
 *     void write(byte[] buf) : buf의 내용을 출력
 *     void write(byte[] buf, int start, int len) :
 *                           buf의 start 인덱스 부터 len 크기만큼의 내용을 출력
 * 생성자 : FileNotFoundException 예외처리. IOException 하위클래스
 *        => 파일의 생성 권한이 없는 경우 예외 발생
 * write() : IOException 예외처리 필수
 * 
 * fos = new FileOutputStream("out.txt") :
 *    fos : out.txt 파일에 내용을 출력할 수 있는 바이트형 출력 스트림 객체임
 *      out.txt 파일이 없으면 out.txt 파일을 생성하고, 데이터를 출력함
 *      out.txt 파일이 있으면 데이터를 출력함. 기존의 내용은 없어지고 최종출력만 남음. 
 * fos = new FileOutputStream("out.txt",true) :
 *    fos : out.txt 파일에 내용을 출력할 수 있는 바이트형 출력 스트림 객체임
 *      out.txt 파일이 없으면 out.txt 파일을 생성하고, 데이터를 출력함
 *      out.txt 파일이 있으면 데이터를 출력함.기존의 내용에 새로 출력한 내용을 추가하여 출력함. 
 */
public class MainEx03_fileoutputstream {
	public static void main(String[] args) throws IOException {
		System.out.println("out.txt 파일에 내용이 저장됩니다.");
//		FileOutputStream fos = new FileOutputStream("out.txt");
		FileOutputStream fos = new FileOutputStream("out.txt",true);
		fos.write('1');fos.write('2');fos.write('3');
		fos.write('a');fos.write('b');fos.write('c');
		fos.write('가');fos.write('나');fos.write('다');
		// write(byte[]) 출력하기
		byte[] buf = "\nFileOutputStream 예제 입니다\n".getBytes();
		fos.write(buf);
		// write(byte[],int,int) 출력하기
		fos.write(buf,5,6); //5번인덱스부터 6개의 문자를 출력
		fos.write("\n=================\n".getBytes());
		fos.flush();
	}
}
