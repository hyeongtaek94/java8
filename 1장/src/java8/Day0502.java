package java8;

import java.util.Scanner;

public class Day0502 {
	public static void main(String[] args) {
		/* �Էµ� ���� ¦������ Ȧ������ Ȯ���ϴ� ���α׷� */
		Scanner sc = new Scanner(System.in);
		int inputNumber = 0;
		System.out.println("Ȧ���� ¦���� �Ǻ��ϴ� ���α׷��Դϴ�.");
		System.out.print("���ڸ� �Է��� �ּ���");
		inputNumber = sc.nextInt();
		String result = "";	//�������� 0���� �ʱ�ȭ�ϰ� ���ڿ��� ""���� �ʱ�ȭ�մϴ�.
		
		if(inputNumber % 2 == 0) {	//if���� ����Ͽ� ������ true�� ��쿡 �����ϴ� �߰�ȣ ������ �ۼ�
			result = "¦��";
			System.out.println("¦������ �Ǻ����Դϴ�.");
		} else { 
			result = "Ȧ��";
			System.out.println("Ȧ������ �Ǻ����Դϴ�.");
		}
		System.out.println("�Է��Ͻ� ���ڴ� " + inputNumber
				+ "�̰�, �� ���ڴ� " + result +"�Դϴ�.");
		
		sc.close();
	
		
	}
}
