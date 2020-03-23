package java8;	//반대로

import java.util.Scanner;

public class Day0704 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("몇 줄을 출력하시겠습니까?: ");
		int line = sc.nextInt();
		
		for(int i= line; i>0; i--) {
			for(int j=0; j<i; j++) {
				if(j % 2 == 0) {
				System.out.print("$");
			}	else {
				System.out.print("\\");	// \를 문자로 출력하려면 두개를 넣어야함
			}
		}
		System.out.println();
		}
	
//	for(int i=line; i>0; i--) {
//		System.out.println(i);
	
	}
}
