package java8;

import java.util.Scanner;

public class Day0901 {

	/*
	 * 1~100�߿� �����ϰ� ������ �����Ѵ�. �Է��� ���� ���亸�� ũ�� "Up" �Է��� ���� ���亸�� ������"Down" ���� ����մϴ� �ִ�
	 * ȸ���� 10ȸ�� �����մϴ�. ������ ��Ҹ� ���� ������ ����մϴ�.
	 */

	public static void main(String[] args) {
		int number = (int) (Math.random() * 100) + 1;
		int inputNum = 0;
		int cnt = 0;
		Scanner sc = new Scanner(System.in);

		//���ӽ���
		long startTime = System.currentTimeMillis();
		while (true) {
			//�����Է�
			do {
				if (inputNum != 0) {
					System.out.println("�߸� �Է��ϼ̽��ϴ�.");
				}
				System.out.print("���ڸ� �Է��� �ּ���(1~100)");
				inputNum = sc.nextInt();
			} while (inputNum < 1 || inputNum > 100);

			//������
			cnt++;
			if (number == inputNum) {
				System.out.println("�����Դϴ�." + cnt + "ȸ �Է��Ͽ����ϴ�.");
			} else if (number > inputNum) {
				System.out.println("Up!! " + cnt + "ȸ �Է��Ͽ����ϴ�.");
			} else {
				System.out.println("Down!! " + cnt + "ȸ �Է��Ͽ����ϴ�.");
			}

			if (cnt == 10) {
				System.out.println("���������� 0���Դϴ�. ������ �����մϴ�.");
				break;
			}
		}
		//�������
		long endTime = System.currentTimeMillis();
		long playTime = (endTime - startTime) / 1000; // �и��� ->��
		double score = (180 - playTime) / 18000.0;
		System.out.println("���������� " + score + "���Դϴ�.");
	}
}
