package ex03_filestream;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

/*
 * FileReader 예제
 *  - 파일에서 데이터 2byte 단위로 읽기
 *  - 주요 메서드
 *     int read() : 파일에서 데이터를 2바이트(1char)단위로 읽어 리턴
 *     int read(char[] buf) : 파일에서 buf의 크기만큼 읽어서 buf에 저장
 *                            실제 읽은 char 수를 리턴
 *     int read(char[] buf,int start, int len) :
 *                            파일에서 len 만큼 읽어서 buf에 start 인덱스 부터 저장
 *                            실제 읽은 char 수를 리턴
 *  FileInputStream, FileReader의 생성자의 예외처리 : FileNotFoundException
 *  read()의 예외처리 : IOException
 *  FileNotFoundException은 IOException의 하위 클래스  
 *  
 *  new FileReader("test.txt") :  test.txt 파일은 프로젝트 폴더(chap13)에
 *                                있어야 파일을 읽을 수 있음
 *  기본폴더는 프로젝트 폴더임 : chap13                              
 */
public class MainEx02_filereader {
	public static void main(String[] args) throws IOException {
		String filename = "src/ex01_inputstream/MainEx01_inputstream.java";
		FileReader fr = new FileReader(filename);
		int data = 0;
		System.out.println("=== read() 메서드를 이용하여 파일 읽기 ===");
		while((data=fr.read()) != -1) {
			System.out.print((char)data);
		}
		fr.close();
		fr = new FileReader(filename);
		System.out.println("=== read(char[]) 메서드를 이용하여 파일 읽기 ===");
		char[] buf = new char[8000];
		while((data=fr.read(buf)) != -1) {
			System.out.print(new String(buf,0,data));
		}
		fr.close();
		fr = new FileReader(filename);
		System.out.println("=== read(char[],int,int) 메서드를 이용하여 파일 읽기 ===");
		buf = new char[8000];
		buf[0]='B';
		while((data=fr.read(buf,1,buf.length - 1)) != -1) {
			System.out.print(new String(buf,0,data + 1));
		}
		fr.close();
		
	}
}
