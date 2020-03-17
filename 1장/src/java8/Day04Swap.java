package java8;

import java.util.Scanner;

public class Day04Swap {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, m; //변수는 소문자로!!
		int temp;
		
		System.out.print("입력 N: ");
		n = sc.nextInt();
		System.out.print("입력 M: ");
		m = sc.nextInt();
		
		System.out.println("교환 전: N = " + n + " , M = " + m);
		
		/* swap 코드 (n=10, m=20으로 가정) */
		//n = m;
		//m = n;
		temp = n;
		n = m;
		m = temp;
		
		System.out.println("교환 후: N = " + n + " , M = " + m);

		
		
		
	}
}
