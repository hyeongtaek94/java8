package java8;

public class Day0706 {
	public static void main(String[] args) {
		// 1~100�߿� 5�� ����� ���� ����ϼ���.
		System.out.println("1~100�߿� 5�� ����� ���� ����ϼ���.");
		int sum = 0;
		for(int i=1; i<=100; i++)	{
			if(i%5==0)	{
		
			sum += i;
			}
		}
		System.out.println(sum);
		
				
//		1~50�߿� 3�� ����� ȭ�鿡 ����ϼ���.
		System.out.println("1~50�߿� 3�� ����� ȭ�鿡 ����ϼ���.");
		for(int i=1; i<=50; i++)	{
			if(i%3==0)	{
				System.out.println(i);
			}
		}
		
//		1~50�߿� 3�� ����� ���հ� ������ ����ϼ���.
		System.out.println("1~50�߿� 3�� ����� ���հ� ������ ����ϼ���.");
		sum = 0;
		int cnt = 0;
		for(int i=1; i<=50; i++)	{
			if(i%3==0)	{
				sum += i;
				cnt++;
			}
		}
		System.out.println("����: " + sum + ", ����: " + cnt);
	}
}
