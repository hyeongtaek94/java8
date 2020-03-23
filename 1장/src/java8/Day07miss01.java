package java8;

import java.util.Scanner;

public class Day07miss01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("두개의 정수를 입력하세요 : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(a == b)
		{
				System.out.println("같다");
		}
		else
				System.out.println("다르다");
	}
}
