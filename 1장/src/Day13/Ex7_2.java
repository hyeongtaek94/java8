package Day13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex7_2 {
	public static void main(String[] args) throws IOException {
		System.out.print("출력할 문자열을 입력하세요! : ");
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader inbr = new BufferedReader(isr);
		String instr = inbr.readLine();
		StringBuffer str = new StringBuffer(instr);
		System.out.println("입력한 문자열 : " + str);
		
		//문자열 리버싱
		str.reverse();
		System.out.println("리버싱 문자열 : " + str);
	}

}
