package java8;

import java.util.Scanner;

public class Day1110 {
	public static void main(String[] args) {
		/* p.108 문제4번
		 * 한 학생의 자바 점수인 출석, 과제, 중간고사, 기말고사 점수(각각 100점 만점)를
		 * 키보드로부터 정수로 입력받아 학점을 화면에 출력하는 프로그램을 작성하시오.
		 * 
		 * <조건>
		 * 출석 20%, 과제 20%, 중간고사 30%, 기말고사 30%하여 100점 만점
		 * 조건2는 무시
		 * 학점: 90~100:A, 80~89:B, 70~79:C, 60~69:D, 0~59:F
		 * 
		 * */
		
		Scanner sc = new Scanner(System.in);
		int a = 0, b = 0, c = 0, d= 0;
		char grade;
		do {
			if(a<0 || a>100) {
				System.out.println("입력 범위를 초과하였습니다");
		}
				System.out.println("출석 점수를 입력해 주세요: ");
			 a = sc.nextInt();
			 
		}	while(a<0 || a> 100);
		
		do {
			if(b<0 || b>100) {
				System.out.println("입력 범위를 초과하였습니다");
		}
				System.out.println("과제 점수를 입력해 주세요: ");
			 b = sc.nextInt();
			 
		}	while(b<0 || b> 100);
		
		do {
			if(c<0 || c>100) {
				System.out.println("입력 범위를 초과하였습니다");
		}
				System.out.println("중간고사 점수를 입력해 주세요: ");
			 c = sc.nextInt();
			 
		}	while(c<0 || c> 100);
		
		do {
			if(d<0 || d>100) {
				System.out.println("입력 범위를 초과하였습니다");
		}
				System.out.println("기말고사 점수를 입력해 주세요: ");
			 d = sc.nextInt();
			 
		}	while(d<0 || d> 100);

		int score = (int)(a / 100.0 * 20 + b / 100.0 * 20 + c / 100.0 * 30 + d/ 100.0 * 30);
		System.out.println("총점은 " + score + "입니다.");
		if(score >= 90) {
			grade = 'A';
		} else if(score >= 80)	{
			grade = 'B';
		} else if(score >= 70)	{
			grade = 'C';
		} else if(score >= 60)	{
			grade = 'D';
		} else {
			grade = 'F';
		}
		System.out.println("당신의 학점은 " + grade + "입니다");
	
	
	
	}
}
