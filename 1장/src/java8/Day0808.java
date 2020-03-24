package java8;	//�ִ������� �ּҰ����

import java.util.Scanner;

public class Day0808 {
	public static void main(String[] args) {
		/*
		 * �� ���� �Է¹޾Ƽ� �� ���� �ִ� ������� �ּ� ������� ����ϼ���.
		 * 
		 * 3 12 => [3, 12]
		 * 2 5 => [1, 10]
		 * 
		 * ��Ʈ : �� ���� ���� �ִ� ����� x �ּ� ������Դϴ�.
		 * */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�ΰ��� ���� �Է¹޾Ƽ� �� ���� �ִ� ������� �ּ� ������� ����ϼ���.");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int res1 = 0;	//�ּҰ����
		int res2 = 0;	//�ִ�����
		
		for(int i=1; i <= Integer.MAX_VALUE; i++)	{
			if(i % a ==0 && i % b ==0)	{
				System.out.println("�ּ� �����: " + i);
				res1 = i;
				break;
			}
		}
		res2 = a * b / res1;
		System.out.println("�ּ� �����: " + res1 + ", �ִ� �����: " + res2);
		sc.close();
		
	}
}
