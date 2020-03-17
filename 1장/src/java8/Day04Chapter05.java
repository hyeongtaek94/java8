package java8;

import java.util.Scanner;

public class Day04Chapter05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double pi = 3.15169;
		
		System.out.print("반지름을 입력하세요: ");
		int r = sc.nextInt();
		System.out.print("원주의 값 : ");
		
		double result = 2 * pi * r;
		System.out.println(result);
		System.out.print("원주의 값 : ");
		
		result = 2 * Math.PI * r;
		System.out.println(result);
		
		sc.close();
		
	}
}
