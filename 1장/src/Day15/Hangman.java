package Day15;

import java.util.Scanner;

public class Hangman {

	/*
	 * 예를 들어 숨겨진 단어가 internet이라면 문제 출제자는 _________을 칠판이나 종이에 표시해서 총 8글자임을 알려줍니다. 문제를
	 * 푸는 학습자는 8자로 이루어진 단어들 중 하나를 추측하고 t를 제시합니다. 출제자는 __t____t 로 t가 든 위치를 표시해줍니다
	 * String hiddenString; // 숨겨진 문자열(문제) StringBuffer outputString; // 플레이어의 입력에
	 * 따른 결과로 보여줄 문자열 StringBuffer inputString; // 플레이어가 입력한 문자들의 모임 int remainder;
	 * // 맞힐 문자열(못 맞히고 남아있는 문자의 수) int failed; // 실패한 횟수
	 */
	private String hiddenString; // 정답
	private StringBuffer outputString; // 화면 출력
	private StringBuffer inputString; // 입력한 문자
	private int remainder; // 남은 문자 수
	private int failed; // 틀린 횟수
	private Scanner sc;
	private String inputData;

	public Hangman() {
		this("hello");
	}

	public Hangman(String solution) {
		hiddenString = solution; // 정답초기화
		outputString = new StringBuffer();
		inputString = new StringBuffer();
		remainder = hiddenString.length();
		failed = 0;
		sc = new Scanner(System.in);
		inputData = "";
		for (int i = 0; i < remainder; i++) {
			outputString.append("_");
		}
	}

	public void playGame() {
		System.out.println("행맨 게임을 시작합니다.");
		show();
		do {
			do {
				setInputData();
			} while (checkChar(inputData));
			processGame();
			show(); // 입력받고 연산하고 보여주고
		} while (failed < 6 && remainder > 0); // failed가 6이 되거나 remainder가 0이되면 빠져나감
		System.out.println("행맨 게임을 종료합니다.");
	}

	private void show() {
		System.out.println("틀린 횟수: " + failed + "/6");
		System.out.println(outputString);
		System.out.println();
	}

	public void setInputData() {
		System.out.print("문자를 입력해 주세요: ");
		this.inputData = sc.next().substring(0, 1);
	}

	private boolean checkChar(String inputData) {
		if (inputString.indexOf(inputData) == -1) {
			inputString.append(inputData);
			return false;
		}
		System.out.println("이미 입력한 문자입니다.");
		return true;
	}

	private void processGame() {
		if (hiddenString.indexOf(inputData) == -1) {
			failed++;
		} else {
			int index = hiddenString.indexOf(inputData);
			do {
				System.out.println(inputData);
				outputString.replace(index, index + 1, inputData); // 문자바꿈
				remainder--;
				index = hiddenString.indexOf(inputData, index + 1); // 번호찾음
			} while (index != -1);
		}
	}
}
