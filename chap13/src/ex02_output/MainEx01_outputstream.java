package ex02_output;

import java.io.IOException;
import java.io.OutputStream;

/*
 * OutputStream : 바이트형 출력스트림. 데이터를 1byte 단위로 출력함
 */
public class MainEx01_outputstream {
	public static void main(String[] args) throws IOException {
		OutputStream out = System.out;
		out.write('1');out.write('2');out.write('3');
		out.write('a');out.write('b');out.write('c');
		out.write('가');out.write('나');out.write('다');
		out.flush(); //출력 스트림의 데이터를 강제로 목적지로 전송
	}
}
