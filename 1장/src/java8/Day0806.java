package java8;

import java.util.Random;
import java.util.Scanner;

public class Day0806 {
	public static void main(String[] args) {
		/* ������ ���� 10ȸ �Ϸ�� ����ð��� ����ϼ���.*/
		
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		
		long startTime = System.currentTimeMillis();
		for(int i=0; i<10; i++)	{
			int num1 = (int)(Math.random()*8) +2;	//0���� 7���������°� int�Ἥ 7����. 2~8����
			int num2 = (int)(Math.random()*9) +1;
			System.out.print((i + 1) + ": " + num1+ " x " + num2 + " = ");
			int inputNum = sc.nextInt();
			if( inputNum == num1 * num2 )	{
				System.out.println("�����Դϴ�.");
			}	else {
				System.out.println("Ʋ�Ƚ��ϴ�. ������ �����մϴ�");
				System.exit(0);
			}
		}
		long endTime = System.currentTimeMillis();
		System.out.println("���� ���� �ð�");
		System.out.println(endTime - startTime + " ms");
		sc.close();
	}
}
