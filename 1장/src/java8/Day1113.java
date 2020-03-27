package java8;

import java.util.Scanner;

public class Day1113 {
	public static void main(String[] args) {
		final String ga = "가위"; // 1 바뀌면안되니 final 붙여주는거, 안붙여도상관없음
		final String ba = "바위"; // 2
		final String bo = "보"; // 3
		int user, com;
		Scanner sc = new Scanner(System.in);

		while (true) {
			/* 게임 시작 */
			com = (int) (Math.random() * 3) + 1;

			do {
				System.out.println("가위바위보 게임을 시작합니다");
				System.out.println("(가위: 1, 바위: 2, 보자기: 3, 종료: 4)");
				System.out.print("> ");
				user = sc.nextInt();
				
				if (user<1 || user > 4) {
					System.out.println("잘못입력하셨습니다. 다시 입력해주세요.");
				} else if(user ==4) {
					System.out.println("게임을 종료합니다.");
					System.exit(0);
				}

			} while (user < 1 || user > 3);

			String userStr = user == 1 ? "가위" : user == 2 ? "바위" : "보";
			String comStr = com == 1 ? "가위" : com == 2 ? "바위" : "보";
			if ((user == 1 && com == 3) || (user == 2 && com == 1) || (user == 3 && com == 2)) {
				System.out.println("유저승! 유저: " + userStr + ", 컴퓨터: " + comStr);
			} else if (user == com) {
				System.out.println("비겼음! 유저: " + userStr + ", 컴퓨터: " + comStr);
			} else {
				System.out.println("컴퓨터 승! 유저: " + userStr + ", 컴퓨터: " + comStr);
			}
			/* 게임 끝 */	//끝낼때 while(true)쓰고 맨밑에 중괄호 표시하나 추가하고 컨트롤 쉬프트 f 해서 맞춰주기
		}
	}
}
