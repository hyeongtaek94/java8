package java8;

import java.util.Scanner;

public class Day1109 {
	public static void main(String[] args) {
		/*
		 * Ű����κ��� �� ���� ���� ���� �Է¹޾Ƽ�, ���� ���ϴ� �׷��� �ۼ��Ͻÿ�.
		 * ��, �Է¹��� 2���� ������ ���� 500�� �ʰ��ϸ� ���α׷��� �ߴ��Ѵ�
		 * (while/do_while�� ���)
		 * */
		
		Scanner sc = new Scanner(System.in);
		while (true) {
		
		System.out.print("�� ���� ���� ���� �Է����ּ���: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int res = a * b;
		System.out.println(a + " x " + b + " = " + res);
		if(res > 500) {
			break;
		}
		
		}
		System.out.println("������� 500�� �ʰ��Ͽ� ���α׷��� �����մϴ�.");
		
	}
}
