package java8; //숫자 야구 게임 만들기

import java.util.Random;
import java.util.Scanner;

public class Day1016 {
	public static void main(String[] args) {

		/*
		 * 1. 난수로 숫자 3개를 만들 때는 do-while문을 사용하여 3개의 숫자가 모두 다르도록 조정합니다. 2. 먼저 난수를 구하는
		 * Random 클래스에서 배운대로 1부터 9사이의 숫자 하나를 난수로 만들어서 x에 할당합니다 3. 같은 방법으로 y값을 구한 후 이미 구한
		 * x와 y의 값을 비교하여 같은 경우에는 다시 y값을 구하는 일을 반복합니다. 4. 결국 x와 y값이 달라질 때까지 난수를 구하는 일을
		 * 반복하는 셈이 됩니다. 5. 세번째 숫자인 z의 경우도 마찬가지입니다. 6. 다만, z의 경우는 이미 구한 숫자가 x와 y 두 개이기
		 * 때문에 x와도 비교하고 y와도 비교해야합니다. 7. 이처럼 어떤 일을 일단 한 번 한 후에 조건을 비교해서 반복 여부를 결정할 때는
		 * do-while문이 편리합니다 8. x,y,z 값은 com 배열에 저장하고, 사용자가 입력한 3개의 수를 입력받아 user 배열에
		 * 저장합니다 9. 이때 플레이어(사람)가 입력한 값이 0또는 9보다 큰 숫자나 ㄴ같은 숫자가 없도록 앞의 난수 발생 때와 비슷한 방법으로
		 * do-while문을 사용해서 반복하도록합니다 10. 무사히 3개의 값을 모두 입력받으면, com 배열의 수와 user 배열의 수를 비교해서
		 * 위치와 값이 같으면 strike 값을 증가시키고 값은 같지만 위치가 다르면 ball 값을 증가시키는 방법으로 볼카운트를 구합니다. 11.
		 * strike 값이 3개면 게임이 종료되고, 그렇지 않은 경우엔 플레이어가 다시 한 번 숨겨진 숫자를 추측할 수 있도록 합니다. 12. 총
		 * 11회의 기회를 주고 그 안에 답을 못 맞히면 적절한 메세지를 출력하고 프로그램을 끝냅니다.
		 */

		Random rd = new Random();
		int[] com = new int[3];
		com[0] = rd.nextInt(9) + 1;
		do {
			com[1] = rd.nextInt(9) + 1;
		} while (com[0] == com[1]);
		do {
			com[2] = rd.nextInt(9) + 1;
		} while (com[0] == com[2] || com[1] == com[2]);

		Scanner sc = new Scanner(System.in);
		int[] user = new int[3];
		int strike = 0, ball = 0;

		for (int x = 0; x < 11; x++) {
			/* 유저 입력 부분 */
			System.out.print("첫 번째 값을 입력해 주세요(1 ~ 9): ");
			do {
				if (user[0] != 0) {
					System.out.println("범위를 초과하였습니다. 다시 입력해 주세요.");
				}
				user[0] = sc.nextInt();
			} while (user[0] < 1 || user[0] > 9);

			do {
				if (user[0] == user[1]) {
					System.out.println("동일한 숫자는 입력할 수 없습니다.");
				}
				System.out.print("두 번째 값을 입력해 주세요(1 ~ 9): ");
				do {
					if (user[1] != 0) {
						System.out.println("범위를 초과하였습니다. 다시 입력해 주세요.");
					}
					user[1] = sc.nextInt();
				} while (user[1] < 1 || user[1] > 9);
			} while (user[0] == user[1]);

			do {
				if (user[0] == user[2] || user[1] == user[2]) {
					System.out.println("동일한 숫자는 입력할 수 없습니다.");
				}

				System.out.print("세 번째 값을 입력해 주세요(1 ~ 9): ");
				do {
					if (user[2] != 0) {
						System.out.println("범위를 초과하였습니다. 다시 입력해 주세요.");
					}
					user[2] = sc.nextInt();
				} while (user[2] < 1 || user[2] > 9);
			} while (user[0] == user[2] || user[1] == user[2]);

			for (int i = 0; i < 3; i++) {
				if (com[i] == user[i]) {
				strike++;
			}
		}
			if (com[0] == user[1] || com[0] == user[2]) {
				ball++;
			}
			if (com[1] == user[0] || com[1] == user[2]) {
				ball++;
			}
			if (com[2] == user[0] || com[2] == user[1]) {
				ball++;
			}

			System.out.println(strike + "스트라이크, " + ball + "볼");
			if(strike == 3)	{
				System.out.println("정답입니다. 게임을 종료합니다.");
				System.exit(0);
			}
			strike = ball = 0;	//equls 왼쪽으로 대입됨.
			user= new int[3];
			
		}	
		
	}
}
