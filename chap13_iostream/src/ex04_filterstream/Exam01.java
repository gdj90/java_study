package ex04_filterstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * 발생된 예외의 내용을 error.log 파일에 출력하기
 * [결과]
 * 2025-09-17 10:15:00 => For input string: "a"
 */
public class Exam01 {
	public static void main(String[] args) throws FileNotFoundException {
		PrintStream ps = new PrintStream
				(new FileOutputStream("error.log",true));
		try {
			String str = "a";
			System.out.println(Integer.parseInt(str));
		} catch(Exception e) {
			SimpleDateFormat sf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			ps.printf("%s => %s\n",sf.format(new Date()),e.getMessage() );
			e.printStackTrace(ps); //오류메세지를 ps에 출력
		} finally {
			ps.flush();
			ps.close();
		}
	}
}
