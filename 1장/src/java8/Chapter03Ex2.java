package java8;

import java.io.IOException;
import java.util.Scanner;

public class Chapter03Ex2 {
	public static void main(String[] args) throws IOException {
		int intyear;
//		InputStreamReader isr = new InputStreamReader(System.in);
//		bufferedReader inbr = new BufferedReader(isr);//���ۿ���
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Ǻ��� �⵵ �Է�! : ");
		
//		intyear = Integer.parseInt(inbr.readLine());
		intyear = sc.nextInt();
		
		
		if((intyear % 4 == 0 && intyear % 100 !=0) || (intyear % 400 == 0 )) {	// ���� �ΰ��߿� �ϳ��� ������
			System.out.println(intyear + "���� �����̴�.");
		}	else {
			System.out.println(intyear + "���� ������ �ƴϴ�.");
		}
		
	}
}
