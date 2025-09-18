package test0917;
/*
파일 두개의 이름을 콘솔에서 입력받아 파일의 내용이 같은지  비교하는 프로그램을
작성하기

[결과]
첫번째 파일 이름을 입력하세요>>noname.txt
두번째 파일 이름을 입력하세요>>noname2.txt
noname.txt와 noname2.txt를 비교합니다.
noname.txt와noname2.txt파일은 같은 내용의 파일입니다.
noname.txt파일의 크기 :70
noname2.txt파일의 크기 :70
*/

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Test03_A {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		String file1, file2;
		FileInputStream fis1 = null;
		FileInputStream fis2 = null;
		System.out.print("첫번째 파일 이름을 입력하세요>>");
		file1 = scan.nextLine();
		System.out.print("두번째 파일 이름을 입력하세요>>");
		file2 = scan.nextLine();
		System.out.printf("%s 와  %s 를 비교합니다.%n",file1,file2);
		fis1 = new FileInputStream(file1);
		fis2 = new FileInputStream(file2);
		//fis1 과 fis2 객체는 다른 객체이므로 equals 메서드는 false.
		System.out.println("equals 메서드로 비교:" + fis1.equals(fis2));
		//크기가 같고, 각각의 데이터들이 같은 경우 같은 내용의 파일로 출력
		boolean isEqual = true;
		int size1 = fis1.available(); //fis1 파일의 크기 
		int size2 = fis2.available(); //fis2 파일의 크기
		if(size1 != size2) {
			isEqual = false; //파일의 크기가 다른경우 
		} else {   //파일의 크기가 같은 경우
		  int data1, data2;
		  while(true) {
			data1 = fis1.read(); 
			data2 = fis2.read();
			if(data1 != data2) {
				isEqual = false;
				break;
				//data1 == -1 : EOF(End Of File)
			} else if((data1 == -1) && (data2 == -1)) {
				break;
			} 
		  }
		}
		if(isEqual) {
			System.out.printf("%s 와  %s 은 같은 내용의 파일입니다.%n",file1,file2);
		} else {
			System.out.printf("%s 와  %s 은 다른 내용의 파일입니다.%n",file1,file2);
		}
		System.out.printf("%s 파일의 크기 : %d%n", file1,size1);
		System.out.printf("%s 파일의 크기 : %d%n", file2,size2);
		fis1.close();
		fis2.close();
	}
}
