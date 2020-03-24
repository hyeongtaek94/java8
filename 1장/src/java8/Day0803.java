package java8;

import java.util.Random;
import java.util.Scanner;

public class Day0803 {
	public static void main(String[] args) {
		System.out.println("난수를 사용해서 구구단 문제를 출력하고 답을 입력하도록 작성하세요.");
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		int num1, num2, quiz, answer;
		
		
		long startTime = System.currentTimeMillis(); //millis ->millis second (1초/1000) , nanoTime -> 10의 9승초
//		System.out.println(startTime);
		for(int i=0; i<10; i++)	{
			num1 = (int)(Math.random() * 8)+2;	//math.random은 0보다 크거나같고 1보다 작은수, 8곱하면 7, +2 하면 9
			num2 = rd.nextInt(9) + 1;
			
			quiz = num1 * num2;
			
			System.out.print(num1 + " x " + num2 + " = ");
			answer = sc.nextInt();
			
			if(quiz == answer) {
					System.out.println("정답입니다.");
			} else {
				System.out.println("틀렸습니다. 게임을 종료합니다.");
				System.exit(0);
			}
		}
		long endTime = System.currentTimeMillis();
		System.out.println("[게임 진행 시간]");
		System.out.println(endTime - startTime + " ms");
	}
}