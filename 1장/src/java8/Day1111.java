package java8;

import java.util.Scanner;

public class Day1111 {
	public static void main(String[] args) {
		/* p.109 5������
		 * 
		 * ��ǰ �ܰ��� ������ �Է� �޾� ���� �ݾװ� �������� ����ϼ���
		 * ��� ����: ��ǰ �ܰ�, ��ǰ ����, ���� �ݾ�, ������
		 * 
		 * ����
		 * 1. �� ��ǰ ���� �ݾ��� 50���� �̻��� �� 30%, 100���� �̻��� �� 40%
		 * 2. ���ұݾ��� "��ǰ �ܰ� *����" ���� ���
		 * 
		 * */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���: ");
		int price = sc.nextInt();
		System.out.println("������ �Է��ϼ���: ");
		int amount = sc.nextInt();
		int res1 = price * amount;
		System.out.println("��ǰ �ܰ�: " + price + "��");
		System.out.println("��ǰ ����: " + amount + "��");
		
		int sale = 0;;
		if(res1 >= 1_000_000)	{
			price *= 0.6;
			sale = 40;
		}	else if(res1 >= 500_000)	{
			price *= 0.7;
			sale = 30;
		}
		
		System.out.println("������: " + sale + "%");
		System.out.println("���� �ݾ�: " + price * amount);
		sc.close();
	
	}
}









