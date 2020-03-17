package java8;

import java.util.Scanner;

public class Day04LAB {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int width, height;
		int area, perimeter;
		System.out.print("너비를 입력해 주세요: ");
		width = sc.nextInt();
		System.out.print("높이를 입력해 주세요: ");
		height = sc.nextInt();
		
		area = width * height;
		perimeter = 2*(width + height);
		
		System.out.println("사각형의 넓이: " + area);
		System.out.println("사각형의 둘레: " + perimeter);
		
		sc.close();
	}
}
