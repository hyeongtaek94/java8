package java8;

public class Day0902 {
	public static void main(String[] args) {
		/*
		 * @
		 * @@
		 * @@@
		 * @@@@
		 * @@@@@
		 * */
		for(int i=0; i<5; i++)	{
			for(int j=0; j<=i; j++)	{
				System.out.print("@");		
			}
			System.out.println();
		}
		
		
//		����
		for(int i=6; i>=0; i--)	{
			for(int j=0; j<=i; j++)	{
				System.out.print("@");
			}
			System.out.println();
		}
		
		
		/*
		 * �¿����
		 * ####@
		 * ###@@
		 * ##@@@
		 * #@@@@
		 * @@@@@
		 * */
		for(int i=4; i>=0; i--)	{
			for(int j=0; j<5; j++)	{
				if(i>j)	{
				System.out.print(" ");	//������ @�ڸ�
				} else	{
					System.out.print("@");
				}
			}
			System.out.println();
		}
		
		
		/*
		 * 
		 *		@
		 *	   @@@
		 *	  @@@@@
		 * 	 @@@@@@@
		 *  @@@@@@@@@
		 */
		for(int i=4; i>=0; i--)	{
			for(int j=0; j < i; j++)	{
				System.out.print(" ");
			}
			for(int j=0; j<5-i; j++)	{
				System.out.print("@");
			}
			for(int j=0; j<4-i; j++)	{
				System.out.print("@");
			}
			System.out.println();
		}
		
//		����
		for(int i=0; i<4; i++)	{
			for(int j=0; j <=i; j++)	{
				System.out.print(" ");
			}
			for(int j=0; j<4-i; j++)	{
				System.out.print("@");
			}
			for(int j=0; j<3-i; j++)	{
				System.out.print("@");
			}
			System.out.println();		//������
		}
	}
}
