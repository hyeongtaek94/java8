package java8;

import java.util.Scanner;

public class Day0707 {
	public static void main(String[] args) {
//		�������� 2�ܺ��� 9�ܱ��� ����ϼ���.
		System.out.println("�������� 2�ܺ��� 9�ܱ��� ����ϼ���.");
		for(int i=2; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				System.out.print(i + "x" + j + "=" + (i*j) + "\t");	
			}
			System.out.println();
		}
//		�� ���� ������� �Է¹޾Ƽ� ����� �ּ���.
		Scanner sc = new Scanner(System.in);
		System.out.print("�� ���� ����ұ��?: ");
		int num = sc.nextInt();
		System.out.println(num + "�� ���");
		for(int i=1; i<=9; i++) {
			System.out.println(num + " x " + i + " = " + num*i );
		}
		System.out.println();
		
	}
}
