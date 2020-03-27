package java8;

public class Day1112 {
	public static void main(String[] args) {
		/* p.109 6번
		 * 중첩된 for문을 사용하여 2차원 배열에 구구단을 저장한 후에,
		 * 화면에 출력하는 프로그램을 작성하시오.
		 * 출력도 중첩된 for 문을 사용한다
		 * */
		
		int[][] arr= new int[8][9];
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++)	{
				arr[i][j] = (i+2) * (j+1);
			}
		}
		
		for(int i=0; i<arr.length; i++)	{
			for(int j=0; j<arr[i].length; j++)	{
				System.out.print((i+2) + "x" + (j+1) + "=" + arr[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.println();
		
		int[][] ary = new int[10][10];
		
		for(int i=0; i<ary.length; i++) {
			for(int j=0; j<ary[i].length; j++) {
				ary[i][j] = i * j;
				
		}
	}
		for(int i=2; i<ary.length; i++) {
			for(int j=1; j<ary[i].length; j++) {
				System.out.print(i + "x" + j + "=" + ary[i][j] + "\t");
			}
			System.out.println();
		}
}
}