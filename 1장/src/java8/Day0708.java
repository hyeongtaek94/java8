package java8;

import java.util.Random;
import java.util.Scanner;

public class Day0708 {
	/*가위 바위 보 게임
	 *'q'를 입력받으면 프로그램을 종료
	 *시작시 라이프 3개, 점수 0점
	 *유저 승리시 100점 추가
	 *비겼을 시 10점 추가
	 *컴퓨터 승리시 라이프 1개 감소
	 *
	 *라이프가 0개면 총점을 출력하세요.	
	 * */
	public static void main(String[] args) {
//	 변수 설정
		final String ga = "가위";
		final String ba = "바위";
		final String bo = "보";
		String user = "";
		String com = "";
		int score = 0;
		int life = 3;
		Scanner sc = new Scanner(System.in);
		
		while(true) {
		
//			유저
		do {
		System.out.println("가위, 바위, 보 중 하나를 입력해 주세요. (가위 : 1, 바위 : 2, 보 : 3, 종료 : 4)");
		System.out.print("> ");
		int temp = sc.nextInt();
		switch(temp) {
			case 1:
			user = ga;
			break;
			
			case 2:
			user = ba;
			break;
			
			case 3:
			user = bo;
			break;
			
			case 4:
				System.out.println("4번을 선택하셨습니다. 프로그램을 종료합니다.");
				System.out.println("score: " + score + ", life: " + life);
				System.exit(0);
			default:
				System.out.println("잘못 입력하셨습니다.");
			}
		} while(user.equals(""));
		
//		컴퓨터
		Random rd = new Random();
		int temp = rd.nextInt(3);
		switch(temp) {
			case 0:
				com= ga;
				break;
			case 1:
				com= ba;
				break;
			case 2:
				com= bo;
				break;
			
			
		}
		
		/*if(user == "error") {
			System.out.println("잘못 입력되었습니다. 프로그램을 종료합니다.");
			System.exit(0);
		}
		
		int number = (int) (Math.random() * 3 );
		switch(number) {
		case 0:
		com= ga;
		break;
		
		case 1:
		com= ba;
		break;
		
		case 2:
		com= bo;
		break;
		}	*/
		
		/* 게임의 승패 판별 */
		if(
				(user.equals(ga) && com.equals(bo))
				||(user.equals(ba) && com.equals(ga))
				|| (user.equals(bo) && com.equals(ba)))	{
			score += 100;
			System.out.println("유저 승!!" + " 유저: " + user + ", 컴퓨터: " + com);
		} else if(user.equals(com)) {
			score += 10;
			System.out.println("비겼습니다!" + " 유저: " + user + ", 컴퓨터: " + com);
		} else {
			life -= 1;
			System.out.println("컴퓨터 승!" + " 유저: " + user + ", 컴퓨터: " + com);
		} 
			System.out.println("score: " + score + ", life: " + life);
			if(life ==0)	{
				System.out.println("게임을 종료합니다.");
				System.exit(0);
			}
		}
	}
}
