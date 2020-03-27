package java8;

import java.util.Scanner;

public class Day1109 {
	public static void main(String[] args) {
		/*
		 * 키보드로부터 두 개의 정수 값을 입력받아서, 곱을 구하는 그램을 작성하시오.
		 * 단, 입력받은 2개의 정수값 곱이 500을 초과하면 프로그램을 중단한다
		 * (while/do_while문 사용)
		 * */
		
		Scanner sc = new Scanner(System.in);
		while (true) {
		
		System.out.print("두 개의 정수 값을 입력해주세요: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int res = a * b;
		System.out.println(a + " x " + b + " = " + res);
		if(res > 500) {
			break;
		}
		
		}
		System.out.println("결과값이 500을 초과하여 프로그램을 종료합니다.");
		
	}
}
