package java8;

public class Day0701 {
	public static void main(String[] args) {
		int sum = 0;
		for(int i=1; i<=50; i++)	{
				sum += i;
				
		}
		double avg = sum / 50D;	//float�̶� double������ �Ҽ������� �����ִ�.
		System.out.println("1���� 50������ ���� ���:" + avg);
	}
}
