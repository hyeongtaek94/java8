package java8;

public class Day0303 {
	public static void main(String[] args) {
		int number1 = 100; //��������
		System.out.println(number1);
		
		{	//�߰�ȣ ��
			System.out.println(number1);
			int number2 = 200; //������ 	�߰�ȣ �� �� number2�� �ܺο��� ��� �ȵǳ�,
								//���ο� number1�� ���ο�����밡��
			System.out.println(number2);
		}
		
		System.out.println(number1);
		//System.out.println(number2);
		
	}
}
