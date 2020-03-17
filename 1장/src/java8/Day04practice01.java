package java8;

import java.util.Scanner;

public class Day04practice01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름, 학번, 토플점수를 입력하세요! : ");
		String name = sc.next();
		int no = sc.nextInt();
		int score = sc.nextInt();
		
		System.out.println("나의 이름은" + name + " 입니다.");
		System.out.println("학번은 " + no +" 입니다.");
		System.out.println("그리고 토플점수는 " + score + " 입니다.");
		
		sc.close();
	}
}
