package java8;

import java.util.Random;
import java.util.Scanner;

public class Day0806 {
	public static void main(String[] args) {
		/* 구구단 게임 10회 완료시 실행시간을 출력하세요.*/
		
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		
		long startTime = System.currentTimeMillis();
		for(int i=0; i<10; i++)	{
			int num1 = (int)(Math.random()*8) +2;	//0부터 7까지나오는걸 int써서 7까지. 2~8까지
			int num2 = (int)(Math.random()*9) +1;
			System.out.print((i + 1) + ": " + num1+ " x " + num2 + " = ");
			int inputNum = sc.nextInt();
			if( inputNum == num1 * num2 )	{
				System.out.println("정답입니다.");
			}	else {
				System.out.println("틀렸습니다. 게임을 종료합니다");
				System.exit(0);
			}
		}
		long endTime = System.currentTimeMillis();
		System.out.println("게임 진행 시간");
		System.out.println(endTime - startTime + " ms");
		sc.close();
	}
}
