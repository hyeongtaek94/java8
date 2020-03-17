package java8;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Day04Chapter01 {
	public static void main(String[] args) throws Exception{
		int number;
		BufferedReader inbr = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("년도를 입력하세요! : ");
		number = Integer.parseInt(inbr.readLine());
		System.out.println("입력한 년도는 " + number + "년 입니다.");
		
	}
}
