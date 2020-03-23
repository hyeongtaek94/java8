package java8;	//짝수번째 \표시

import java.util.Scanner;

public class Day0703 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("몇 줄을 출력할까요?: ");
		int line = sc.nextInt();
		
		for(int i=0; i<line; i++) {
			for(int j=0; j<=i; j++) {
				if(j%2 ==0) {
					System.out.print("$");
				}else {
					System.out.print("\\");
				}
			}
			System.out.println();
		}
	}
}
