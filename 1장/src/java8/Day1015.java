package java8;

import java.util.Scanner;

public class Day1015 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		final int kimbab = 2000;
		final int dduk = 2000;
		final int odeng = 500;
		final int sundae = 2000;
		int a, b, c, d;
		
		System.out.println("�����н��Դϴ�. �޴��� ������ �����ϴ�.");
		System.out.println("��� 1���� 2000�� �Դϴ�");
		System.out.println("������ 1�κ��� 2000�� �Դϴ�");
		System.out.println("���� 1���� 500�� �Դϴ�");
		System.out.println("���� 1�κ��� 2000�� �Դϴ�");
		System.out.println("��� ������ ���� ���� ������ �Է����ּ���.");
		System.out.println();
		
		
		
		System.out.print("��� �� �κ� �����Ͻðڽ��ϱ�?");
		a = sc.nextInt();
		System.out.print("�����̴� �� �κ� �����Ͻðڽ��ϱ�?");
		b = sc.nextInt();
		System.out.print("������ � �����Ͻðڽ��ϱ�?");
		c = sc.nextInt();
		System.out.print("����� �� �κ� �����Ͻðڽ��ϱ�?");
		d = sc.nextInt();
		System.out.println();
		
		System.out.println("����� " + a + "�� �ֹ��ϼ̽��ϴ�.");
		System.out.println("��� : " + kimbab * a);
		System.out.println("�����̴� " + b + "�� �ֹ��ϼ̽��ϴ�.");
		System.out.println("������ : " + dduk * b);
		System.out.println("������ " + c + "�� �ֹ��ϼ̽��ϴ�.");
		System.out.println("���� : " + odeng * c);
		System.out.println("����� " + d + "�� �ֹ��ϼ̽��ϴ�.");
		System.out.println("���� : " + sundae * d);
		System.out.println();
		
		System.out.println("�� �ݾ� : " + (kimbab * a + dduk * b + odeng * c + sundae * d));
		sc.close();
	}
}
