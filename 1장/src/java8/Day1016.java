package java8; //���� �߱� ���� �����

import java.util.Random;
import java.util.Scanner;

public class Day1016 {
	public static void main(String[] args) {

		/*
		 * 1. ������ ���� 3���� ���� ���� do-while���� ����Ͽ� 3���� ���ڰ� ��� �ٸ����� �����մϴ�. 2. ���� ������ ���ϴ�
		 * Random Ŭ�������� ����� 1���� 9������ ���� �ϳ��� ������ ���� x�� �Ҵ��մϴ� 3. ���� ������� y���� ���� �� �̹� ����
		 * x�� y�� ���� ���Ͽ� ���� ��쿡�� �ٽ� y���� ���ϴ� ���� �ݺ��մϴ�. 4. �ᱹ x�� y���� �޶��� ������ ������ ���ϴ� ����
		 * �ݺ��ϴ� ���� �˴ϴ�. 5. ����° ������ z�� ��쵵 ���������Դϴ�. 6. �ٸ�, z�� ���� �̹� ���� ���ڰ� x�� y �� ���̱�
		 * ������ x�͵� ���ϰ� y�͵� ���ؾ��մϴ�. 7. ��ó�� � ���� �ϴ� �� �� �� �Ŀ� ������ ���ؼ� �ݺ� ���θ� ������ ����
		 * do-while���� ���մϴ� 8. x,y,z ���� com �迭�� �����ϰ�, ����ڰ� �Է��� 3���� ���� �Է¹޾� user �迭��
		 * �����մϴ� 9. �̶� �÷��̾�(���)�� �Է��� ���� 0�Ǵ� 9���� ū ���ڳ� ������ ���ڰ� ������ ���� ���� �߻� ���� ����� �������
		 * do-while���� ����ؼ� �ݺ��ϵ����մϴ� 10. ������ 3���� ���� ��� �Է¹�����, com �迭�� ���� user �迭�� ���� ���ؼ�
		 * ��ġ�� ���� ������ strike ���� ������Ű�� ���� ������ ��ġ�� �ٸ��� ball ���� ������Ű�� ������� ��ī��Ʈ�� ���մϴ�. 11.
		 * strike ���� 3���� ������ ����ǰ�, �׷��� ���� ��쿣 �÷��̾ �ٽ� �� �� ������ ���ڸ� ������ �� �ֵ��� �մϴ�. 12. ��
		 * 11ȸ�� ��ȸ�� �ְ� �� �ȿ� ���� �� ������ ������ �޼����� ����ϰ� ���α׷��� �����ϴ�.
		 */

		Random rd = new Random();
		int[] com = new int[3];
		com[0] = rd.nextInt(9) + 1;
		do {
			com[1] = rd.nextInt(9) + 1;
		} while (com[0] == com[1]);
		do {
			com[2] = rd.nextInt(9) + 1;
		} while (com[0] == com[2] || com[1] == com[2]);

		Scanner sc = new Scanner(System.in);
		int[] user = new int[3];
		int strike = 0, ball = 0;

		for (int x = 0; x < 11; x++) {
			/* ���� �Է� �κ� */
			System.out.print("ù ��° ���� �Է��� �ּ���(1 ~ 9): ");
			do {
				if (user[0] != 0) {
					System.out.println("������ �ʰ��Ͽ����ϴ�. �ٽ� �Է��� �ּ���.");
				}
				user[0] = sc.nextInt();
			} while (user[0] < 1 || user[0] > 9);

			do {
				if (user[0] == user[1]) {
					System.out.println("������ ���ڴ� �Է��� �� �����ϴ�.");
				}
				System.out.print("�� ��° ���� �Է��� �ּ���(1 ~ 9): ");
				do {
					if (user[1] != 0) {
						System.out.println("������ �ʰ��Ͽ����ϴ�. �ٽ� �Է��� �ּ���.");
					}
					user[1] = sc.nextInt();
				} while (user[1] < 1 || user[1] > 9);
			} while (user[0] == user[1]);

			do {
				if (user[0] == user[2] || user[1] == user[2]) {
					System.out.println("������ ���ڴ� �Է��� �� �����ϴ�.");
				}

				System.out.print("�� ��° ���� �Է��� �ּ���(1 ~ 9): ");
				do {
					if (user[2] != 0) {
						System.out.println("������ �ʰ��Ͽ����ϴ�. �ٽ� �Է��� �ּ���.");
					}
					user[2] = sc.nextInt();
				} while (user[2] < 1 || user[2] > 9);
			} while (user[0] == user[2] || user[1] == user[2]);

			for (int i = 0; i < 3; i++) {
				if (com[i] == user[i]) {
				strike++;
			}
		}
			if (com[0] == user[1] || com[0] == user[2]) {
				ball++;
			}
			if (com[1] == user[0] || com[1] == user[2]) {
				ball++;
			}
			if (com[2] == user[0] || com[2] == user[1]) {
				ball++;
			}

			System.out.println(strike + "��Ʈ����ũ, " + ball + "��");
			if(strike == 3)	{
				System.out.println("�����Դϴ�. ������ �����մϴ�.");
				System.exit(0);
			}
			strike = ball = 0;	//equls �������� ���Ե�.
			user= new int[3];
			
		}	
		
	}
}
