package Day13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex7_2 {
	public static void main(String[] args) throws IOException {
		System.out.print("����� ���ڿ��� �Է��ϼ���! : ");
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader inbr = new BufferedReader(isr);
		String instr = inbr.readLine();
		StringBuffer str = new StringBuffer(instr);
		System.out.println("�Է��� ���ڿ� : " + str);
		
		//���ڿ� ������
		str.reverse();
		System.out.println("������ ���ڿ� : " + str);
	}

}
