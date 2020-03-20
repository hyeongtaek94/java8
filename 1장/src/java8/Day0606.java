package java8;

import java.util.Scanner;

public class Day0606 {
	public static void main(String[] args) {
		/*
		 * 몇 단을 출력할지 입력받아서 화면에 출력하는 프로그램을 작성하세요.
		 * */
		Scanner sc = new Scanner(System.in);
		System.out.print("몇 단을 출력하시겠습니까?: ");
		int num = sc.nextInt();
		
		for(int i=1; i<10; i++) {
			System.out.println(num + "x" + i + "=" + (num*i));
		}
		sc.close();
	}
}
