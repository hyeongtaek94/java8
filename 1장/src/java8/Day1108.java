package java8;

import java.util.Scanner;

public class Day1108 {
	/*	p.108 2번문제 응용
	 * 두 개의 정수를 입력받아서 큰값과 작은값을 출력
	 * 변수문을 이용하여
	 * 큰 값과 작은값을 구하는 프로그램을 작성하시오
	 * */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("두개의 정수를 입력하세요: ");
		int[] arr = new int[2];
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		if(arr[0] > arr[1]) {
			int temp = arr[0];
			arr[0] = arr[1];
			arr[1] = temp;
		}
		
		System.out.println("작은값: " + arr[0] + ", 큰값: " + arr[1]);
		sc.close();
		
		
		
		}
			
}
