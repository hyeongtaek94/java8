package java8;

import java.util.Scanner;

public class Day0510 {
	public static void main(String[] args)  {
		String ga = "가위";
		String ba = "바위";
		String bo = "보";
		String user = "";
		String com = "";		
		
		/* 사람 입력 */
		Scanner sc = new Scanner(System.in);
		System.out.print("가위, 바위, 보 중 하나를 선택하세요. <가위=a, 바위=b, 보=c>: ");
		user = sc.next();
		switch(user) {
			case "a":
			case "A":
				user = ga;
				break;
			case "b":
			case "B":
				user = ba;
				break;
			case "c":
			case "C":
				user = bo;
				break;
			default:
				user ="error";

		}
		
		if(user == "error") {
			System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
			System.exit(0);
		}
		
		/* 컴퓨터 설정 */
		int number = (int) (Math.random() * 3);
		switch(number) {
			case 0:
				com = "ga";
				break;
			case 1:
				com = "ba";
				break;
			case 2:
				com = "bo";
				break;
		}
		
		
		if((user == bo && com == ba) || (user == ga && com == bo) || (user == ba && com == ga)) {
			System.out.println("사람승! 사람:" + user + ", 컴퓨터:" + com);
		} else if (user == com) {
			System.out.println("비겼습니다! 사람:" + user + ", 컴퓨터:" + com);
		} else {
			System.out.println("컴퓨터 승! 사람:" + user + ", 컴퓨터:" + com);
		}
		
		
		
		
		//가위, 바위, 보 중 하나를 선택하세요. <가위=a, 바위=b, 보=c>: b
		//컴퓨터 승! <컴퓨터:보, 사람:바위>
		
	}
}
