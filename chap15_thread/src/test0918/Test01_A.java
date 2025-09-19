package test0918;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.Vector;

/*
D:/20250825/java/java_study/chap13_iostream/src/ : 각자의 chap13 폴더

D:/20250825/java/java_study/chap13_iostream/src/폴더 하위 폴더의 .java 파일 중
Exam 관련 모든 소스 내용을  자바IO실습예제.txt  파일 하나에 저장 하기

Exam 관련 모든 소스 : ExamXXX.java
*/

public class Test01_A {
	
	static Vector<InputStream> vector = new Vector<>();

	public static void main(String[] args) throws IOException {
		System.out.println("프로그램 시작");
		File f1 = new File("D:/20250825/java/java_study/chap13_iostream/src/");
		dirSearch(f1,f1.list()); 
		int len;
		FileOutputStream fos = new FileOutputStream("자바IO실습예제.txt");
		SequenceInputStream sis = new SequenceInputStream(vector.elements());
		byte[] buf = new byte[8096]; 
		while((len=sis.read(buf)) != -1) {
			fos.write(buf,0,len);
	    }
		fos.flush();
		fos.close();
		sis.close();
		System.out.println("프로그램 종료");
    }
	private static void dirSearch(File f,String[] dir) throws IOException {
		for(String file : dir) {
			File f2 = new File(f,file);
			if(f2.isDirectory()) { //폴더. 
				dirSearch(f2,f2.list()); //재귀함수.하위목록
		    } else {
		    	if(file.contains("Exam"))
		    	   vector.add(new FileInputStream(f2)); 
		    }
		}		
	}
}
