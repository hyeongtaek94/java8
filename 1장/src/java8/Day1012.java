package java8;	//���� for��

public class Day1012 {
	public static void main(String[] args) {
		int[] arr = new int[300_000_000];
		int sum = 0;
		int sum2 = 0;
		
		System.out.println("C�� for��");
		
		long sTime1 = System.currentTimeMillis();
		for(int i=0; i<arr.length; i++)	{
			sum += i;
		}
		long eTime1 = System.currentTimeMillis();
		System.out.println(eTime1 - sTime1);
		System.out.println();
		
		System.out.println("���� for��");
		long sTime2 = System.currentTimeMillis();
		for(int number : arr)	{
			sum2 += number;
		}
		long eTime2 = System.currentTimeMillis();
		System.out.println(eTime2 - sTime2);

	
// ó������ ������ ��� �����͸� ����ؾ��Ѵٸ� ���� for��
//		Ư�� �����͸� ����ؾ��Ѵٸ� C�� for��
	}
}
