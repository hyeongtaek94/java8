package java8;		//p.108 1��

import java.util.Scanner;

public class Day1107 {
	public static void main(String[] args) {
		/*
		 * Ű����κ��� �� ���� ������ �Է¹޴´�.
		 * Ű����κ��� ���� ������ 5�� ����� ������ ���� ���Ͽ�
		 * ȭ�鿡 ����ϴ� ���α׷��� �ۼ��Ͻÿ�
		 * (��� ����: �Է� ��, 5�� ����� ����, 5�� ����� ��)
		 * */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�� ���� ������ �Է��ϼ���.");
		System.out.print("> ");
		
		int num = sc.nextInt();
		
		int cnt = 0;
		int sum = 0;
		
		for(int i=1; i<=num; i++) {
			if(i%5==0) {
				cnt++;
				sum += i;
			}
		}
		System.out.println("5�� ����� ����: " + cnt + ", 5�� ����� ��: " + sum);
		sc.close();
	}
}
