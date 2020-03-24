package java8;

import java.util.Scanner;

public class Day0807 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 두개를 입력해주세요: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(!(a > -10_000_000 && a <= 10_000_000))	{	//!를 써서 반전을 시킴으로 else를 쓰지않고 이렇게 써도됨
			System.out.println("A값의 입력 범위를 초과하였습니다.");
			System.exit(0);
		}
		if(!(b >= -10_000_000 && b <= 10_000_000))	{
			System.out.println("b값의 입력 범위를 초과하였습니다.");
			System.exit(0);
		}
		int min = 0 , max = 0, sum = 0;
		if(a > b)	{
			max = a;
			min = b;
		}	else if(a == b)	{
			System.out.println(a);
			System.exit(0);		//else if이 필요는 없음 (없어도 동일한 답이나옴)
		}	else	{
			min = a;
			max = b;
		}
		
			for(int i=min; i<=max; i++)	{
				sum += i;
			}
			System.out.println("a부터 B까지의 합은: " + sum);
	}
}
