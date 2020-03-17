package java8;

import java.util.Scanner;

public class Day04Chapter02 {
	public static void main(String[] args) throws Exception{
		int intnum;
		double db1num;
		Scanner sc = new Scanner(System.in);
		System.out.println("정수와 실수를 입력하세요! :");
		intnum = sc.nextInt();
		db1num = sc.nextDouble();
		System.out.println("입력한 정수는 " + intnum + " 입니다.");
		System.out.println("입력한 실수는 " + db1num + " 입니다.");
	}
}
