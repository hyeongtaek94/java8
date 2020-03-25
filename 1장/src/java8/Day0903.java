package java8;

public class Day0903 {
	/*
	 * 1���� 25���� 5ĭ 5�ٷ� ����ϼ���.
	 * */
	public static void main(String[] args) {
		for(int i=1; i<=25; i++)	{
				System.out.print(i + "\t");
				if(i%5 ==0)	{
					System.out.println();
			}
		}
		System.out.println();
		
		int cnt = 1;
		for(int i=1; i<=5; i++)	{
			for(int j=1; j<=5; j++)	{
				System.out.printf("%02d ", cnt);
//				System.out.print(cnt + "\t"); ���� ����� �̰ſ��� �տ� 0�̺���
				cnt++;
			}
			System.out.println();
		}
	

/*
 * 01 02 03 04 05	0
 * 10 09 08 07 06 	10
 * 11 12 13 14 15	20
 * 20 19 18 17 16	30
 * 21 22 23 24 25	40
 * */

		for(int i=0; i<5; i++)	{
		for(int j=0; j<5; j++)	{
			if(i % 2 == 0)	{
			System.out.print((i*5)+j+1 + "\t");
			} else {
				System.out.print((i+1)*5-j + "\t");
			}
			}
			System.out.println();
		}
		
		/*
		 * @
		 *	@
		 *	 @
		 *	  @
		 *	   @
		 * */
		
		for(int i=0; i<5; i++)	{
			for(int j=0; j<5; j++) 	{
				if(i == j)	{
					System.out.print("@");
				} else {
					System.out.print(" ");
				}
				
			}System.out.println();
		}	
		
		
	}
}







/*
 * prntf�� ����(format)�� �°� ����ϴ� �޼ҵ��Դϴ�.
 * printf�� C���� ������� ����ϴ� �޼ҵ��ε� �ڹٿ����� ����� �� �ֽ��ϴ�.
 * ù��° �μ�(�Է°�)�� ��� ������ �Է��ϰ� �ι�°�۴� ������Ŀ� ������ ������ �Է��մϴ�.
 * 
 * ������ ������ %�� �����մϴ�.
 * d : decimal ������
 * f : float �Ǽ�
 * lf : long float -> double �Ǽ�
 * o : octa ������
 * x : hexa 16����
 * b : binary 2����
 * s : String ���ڿ�
 * c : char ���� 1��
 * 
 * ������ �� �ִ� ��
 * ���ʿ� ���ڸ� �Է��ϸ� �ڸ����� ����
 * %2�� -> �������� 2�ڸ��� ���, %10d -> �������� 10�ڸ� ���
 * ���� �տ� 0�� ���̸� �� ������ 0���� ä��ϴ�. �ٸ� ���ڴ� ����� �� �����ϴ�.
 * ���� ���ʿ� -�� ���̸� ���������մϴ�.
 * */




