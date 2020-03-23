package java8;

import java.util.Scanner;

public class Day07miss02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("¼ıÀÚ ÀÔ·Â : ");
		int a = sc.nextInt();
		
		if(a % 2 == 0) {
			System.out.println("Â¦¼ö");
		} else {
			System.out.println("È¦¼ö");
		
		
			sc.close();
		}
	}
}
