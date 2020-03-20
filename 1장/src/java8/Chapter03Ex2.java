package java8;

import java.io.IOException;
import java.util.Scanner;

public class Chapter03Ex2 {
	public static void main(String[] args) throws IOException {
		int intyear;
//		InputStreamReader isr = new InputStreamReader(System.in);
//		bufferedReader inbr = new BufferedReader(isr);//버퍼연결
		Scanner sc = new Scanner(System.in);
		System.out.println("윤년을 판별한 년도 입력! : ");
		
//		intyear = Integer.parseInt(inbr.readLine());
		intyear = sc.nextInt();
		
		
		if((intyear % 4 == 0 && intyear % 100 !=0) || (intyear % 400 == 0 )) {	// 조건 두개중에 하나만 맞으면
			System.out.println(intyear + "년은 윤년이다.");
		}	else {
			System.out.println(intyear + "년은 윤년이 아니다.");
		}
		
	}
}
