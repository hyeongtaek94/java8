package java8;	//최대공약수와 최소공배수

import java.util.Scanner;

public class Day0808 {
	public static void main(String[] args) {
		/*
		 * 두 수를 입력받아서 두 수의 최대 공약수와 최소 공배수를 출력하세요.
		 * 
		 * 3 12 => [3, 12]
		 * 2 5 => [1, 10]
		 * 
		 * 힌트 : 두 수의 곱은 최대 공약수 x 최소 공배수입니다.
		 * */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("두개의 수를 입력받아서 두 수의 최대 공약수와 최소 공배수를 출력하세요.");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int res1 = 0;	//최소공배수
		int res2 = 0;	//최대공약수
		
		for(int i=1; i <= Integer.MAX_VALUE; i++)	{
			if(i % a ==0 && i % b ==0)	{
				System.out.println("최소 공배수: " + i);
				res1 = i;
				break;
			}
		}
		res2 = a * b / res1;
		System.out.println("최소 공배수: " + res1 + ", 최대 공약수: " + res2);
		sc.close();
		
	}
}
