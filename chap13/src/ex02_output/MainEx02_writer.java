package ex02_output;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class MainEx02_writer {
	public static void main(String[] args) throws IOException {
		Writer out = new OutputStreamWriter(System.out);
		out.write('1');out.write('2');out.write('3');
		out.write('a');out.write('b');out.write('c');
		out.write('가');out.write('나');out.write('다');
		out.flush(); //출력 스트림의 데이터를 강제로 목적지로 전송		
	}
}
