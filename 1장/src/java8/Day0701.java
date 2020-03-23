package java8;

public class Day0701 {
	public static void main(String[] args) {
		int sum = 0;
		for(int i=1; i<=50; i++)	{
				sum += i;
				
		}
		double avg = sum / 50D;	//float이랑 double을쓰면 소수좀까지 볼수있다.
		System.out.println("1부터 50까지의 합의 평균:" + avg);
	}
}
