package ex06_file;

import java.io.File;

/*
 * File 클래스
 *  - 파일 또는 폴더의 정보를 관리하는 클래스
 *  - 생성자 new File(String) : 경로
 *         new File(String,String) : 상위경로, 하위경로
 *  - 존재하지 않아도 관리 가능
 *  - separator : 경로 구분자
 *      윈도우   : \ => /도 가능함
 *      리눅스외  : /
 */
public class MainEx01 {
	public static void main(String[] args) {
		System.out.println("File.separator:" + File.separator);
		String filePath = "c:/";
		//f1 : c:\ 폴더 정보를 관리하는 File 객체
		File f1 = new File(filePath);
		//f1.list() : f1폴더의 하위파일 이름들 목록 리턴
		String[] files = f1.list();
		for(String f : files) {
			//f2 : c:\ 하위의 폴더나 파일의 정보를 관리하는 객체
			File f2 = new File(filePath,f); // c:\, 하위파일(폴더)이름
			if(f2.isDirectory())  //f2가 관리하는 파일이 폴더니? 
				System.out.printf("%s:디렉토리\n",f);
			else    //폴더가 아님. 파일임 
				//f.length() : 파일의 크기
			    System.out.printf("%s:파일(%,d byte)\n",f,f.length());
		}
	}
}

