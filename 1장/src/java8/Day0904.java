package java8;

import java.util.Random;
import java.util.Scanner;

public class Day0904 {
	public static void main(String[] args) {
//		구구단 게임을 작성하세요.
		
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		int subScore = 0;
		
		long startTime = System.currentTimeMillis();
		for(int i=0; i<10; i++) {
			int num1 = (int)(Math.random()*8)+2;
			int num2 = (int)(Math.random()*9)+1;
			System.out.print(num1 + " X " + num2 + " = ");
			int answer = sc.nextInt();
			
			if(num1 * num2 == answer)	{
				System.out.println("정답입니다.");
			}	else	{
				subScore += 5;
				System.out.println("오답입니다." + subScore + "점 감점입니다.");
			}
		}
		long endTime = System.currentTimeMillis();
		long playTime = endTime - startTime / 1000;
		long score = 100 - playTime - subScore;
		if(score > 100)	{
			score = 100;
		}	else if(score <0)	{
			score = 0;
		}
		System.out.println("최종 점수는 " + score + "입니다.");
		sc.close();
	}
}
