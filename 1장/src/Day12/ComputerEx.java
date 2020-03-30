package Day12;

public class ComputerEx {
	public static void main(String[] args) {
		Computer com = new Computer();
		int[] arr1 = {10, 20, 30};
		int res1 = com.sum(arr1);
		System.out.println(res1);
		
		int res2 = com.sum(new int[]{10, 20, 30, 40, 50});	//new int[]를붙여 객체형태로 맞춰줘야됨
		System.out.println(res2);
		
		int res3 = com.sum2(arr1);
		System.out.println(res3);
	
		int res4 = com.sum2(new int[]{10, 20, 30, 40, 50});
		System.out.println(res4);
		
		int res5 = com.sum2(10, 20, 30, 40, 50);	//가변형인자를 사용하면 사용가능  인자:입력하는 값(매개변수)
		System.out.println(res5);					//가변형을 많이쓰진 않음. 인수:매개변수를 설정한거, 통틀어 매개변수라함.
		
//		int res6 = com.sum(10, 20, 30);	//가변형인자가 아니기때문에 사용X
	}
	
}
