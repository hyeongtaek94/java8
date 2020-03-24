package java8;	//for 1~100출력

public class Day0801 {
	public static void main(String[] args) {
		System.out.println("1~100까지 출력해주세요.");
		for(int i = 1; i<=100; i++) {
			System.out.println(i);
		}
			
		System.out.println("1~100 중에 3과 5의 공배수의 합은 얼마인가요?");
		
		int sum = 0;
		
		for(int i = 1; i<=100; i++)	{
			if((i%3 == 0) && (i% 5==0)) {
				sum += i;
			}
		}
		System.out.println("3과 5의 공배수의 합: " + sum);
		
		System.out.println("1~100 중에 짝수는 더하고 홀수는 뺀 결과를 출력하세요.");
		
		int sum1 = 0;
		int sum2 = 0;
		
		for(int i = 1; i<=100; i++)	{
			if(i%2 == 0){
				sum1 += i;
			} else{
				sum2 += i;
			}
			
		}
			System.out.println(sum1- sum2);
			
			sum = 0;
			for(int i=1; i<=100; i++)	{
				if(i % 2 == 0)	{
					sum += i;
				} else {
					sum -= i;
			}
			}
			System.out.println(sum);	
	}
}
