package java8;

import java.util.Random;
import java.util.Scanner;

public class Day0708 {
	/*���� ���� �� ����
	 *'q'�� �Է¹����� ���α׷��� ����
	 *���۽� ������ 3��, ���� 0��
	 *���� �¸��� 100�� �߰�
	 *����� �� 10�� �߰�
	 *��ǻ�� �¸��� ������ 1�� ����
	 *
	 *�������� 0���� ������ ����ϼ���.	
	 * */
	public static void main(String[] args) {
//	 ���� ����
		final String ga = "����";
		final String ba = "����";
		final String bo = "��";
		String user = "";
		String com = "";
		int score = 0;
		int life = 3;
		Scanner sc = new Scanner(System.in);
		
		while(true) {
		
//			����
		do {
		System.out.println("����, ����, �� �� �ϳ��� �Է��� �ּ���. (���� : 1, ���� : 2, �� : 3, ���� : 4)");
		System.out.print("> ");
		int temp = sc.nextInt();
		switch(temp) {
			case 1:
			user = ga;
			break;
			
			case 2:
			user = ba;
			break;
			
			case 3:
			user = bo;
			break;
			
			case 4:
				System.out.println("4���� �����ϼ̽��ϴ�. ���α׷��� �����մϴ�.");
				System.out.println("score: " + score + ", life: " + life);
				System.exit(0);
			default:
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			}
		} while(user.equals(""));
		
//		��ǻ��
		Random rd = new Random();
		int temp = rd.nextInt(3);
		switch(temp) {
			case 0:
				com= ga;
				break;
			case 1:
				com= ba;
				break;
			case 2:
				com= bo;
				break;
			
			
		}
		
		/*if(user == "error") {
			System.out.println("�߸� �ԷµǾ����ϴ�. ���α׷��� �����մϴ�.");
			System.exit(0);
		}
		
		int number = (int) (Math.random() * 3 );
		switch(number) {
		case 0:
		com= ga;
		break;
		
		case 1:
		com= ba;
		break;
		
		case 2:
		com= bo;
		break;
		}	*/
		
		/* ������ ���� �Ǻ� */
		if(
				(user.equals(ga) && com.equals(bo))
				||(user.equals(ba) && com.equals(ga))
				|| (user.equals(bo) && com.equals(ba)))	{
			score += 100;
			System.out.println("���� ��!!" + " ����: " + user + ", ��ǻ��: " + com);
		} else if(user.equals(com)) {
			score += 10;
			System.out.println("�����ϴ�!" + " ����: " + user + ", ��ǻ��: " + com);
		} else {
			life -= 1;
			System.out.println("��ǻ�� ��!" + " ����: " + user + ", ��ǻ��: " + com);
		} 
			System.out.println("score: " + score + ", life: " + life);
			if(life ==0)	{
				System.out.println("������ �����մϴ�.");
				System.exit(0);
			}
		}
	}
}
