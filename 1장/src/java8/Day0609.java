package java8;

import java.util.Scanner;

public class Day0609 {
	public static void main(String[] args)  {
		String ga = "가위";
		String ba = "바위";
		String bo = "보";
		String user = "";
		String com = "";		
		Scanner sc = new Scanner(System.in);
		int score = 0;
		int life = 3;
		
		
		while(true) {
			/* 사람 입력 */
			System.out.print("가위, 바위, 보 중 하나를 선택하세요. <가위=a, 바위=b, 보=c, 종료=q>: ");
			user = sc.next();
			switch (user) {
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
			case "q":
			case "Q":
				user = "quit";
				break;
			default:
				user = "error";

			}

			if (user == "error") {
				System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
				System.exit(0);
			} else if(user == "quit") {
				System.out.println("종료를 선택하셨습니다. 프로그램을 종료합니다.");
				System.exit(0);
				break;
			}

			/* 컴퓨터 설정 */
			int number = (int) (Math.random() * 3);
			switch (number) {
			case 0:
				com = ga;
				break;
			case 1:
				com = ba;
				break;
			case 2:
				com = bo;
				break;
			}

			if ((user.equals(bo) && com.equals(ba)) || (user.equals(ga) && com.equals(bo))
					|| (user.equals(ba) && com.equals(ga))) {
				System.out.println("사람승! 사람:" + user + ", 컴퓨터:" + com);
				score += 10;
			} else if (user.equals(com)) {
				System.out.println("비겼습니다! 사람:" + user + ", 컴퓨터:" + com);
				score += 1;
			} else {
				System.out.println("컴퓨터 승! 사람:" + user + ", 컴퓨터:" + com);
				life -= 1;
			}
			System.out.println("현재 점수" + score + ", 현재 라이프: " + life);
			System.out.println();
			
			if(life==0) {
				System.out.println("게임이 종료되었습니다.");	
				break;
			}
			// 게임끝
		}

	}

	// 가위, 바위, 보 중 하나를 선택하세요. <가위=a, 바위=b, 보=c>: b
	// 컴퓨터 승! <컴퓨터:보, 사람:바위>

}


