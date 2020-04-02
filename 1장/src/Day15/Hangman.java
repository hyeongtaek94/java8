package Day15;

import java.util.Scanner;

public class Hangman {

	/*
	 * ���� ��� ������ �ܾ internet�̶�� ���� �����ڴ� _________�� ĥ���̳� ���̿� ǥ���ؼ� �� 8�������� �˷��ݴϴ�. ������
	 * Ǫ�� �н��ڴ� 8�ڷ� �̷���� �ܾ�� �� �ϳ��� �����ϰ� t�� �����մϴ�. �����ڴ� __t____t �� t�� �� ��ġ�� ǥ�����ݴϴ�
	 * String hiddenString; // ������ ���ڿ�(����) StringBuffer outputString; // �÷��̾��� �Է¿�
	 * ���� ����� ������ ���ڿ� StringBuffer inputString; // �÷��̾ �Է��� ���ڵ��� ���� int remainder;
	 * // ���� ���ڿ�(�� ������ �����ִ� ������ ��) int failed; // ������ Ƚ��
	 */
	private String hiddenString; // ����
	private StringBuffer outputString; // ȭ�� ���
	private StringBuffer inputString; // �Է��� ����
	private int remainder; // ���� ���� ��
	private int failed; // Ʋ�� Ƚ��
	private Scanner sc;
	private String inputData;

	public Hangman() {
		this("hello");
	}

	public Hangman(String solution) {
		hiddenString = solution; // �����ʱ�ȭ
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
		System.out.println("��� ������ �����մϴ�.");
		show();
		do {
			do {
				setInputData();
			} while (checkChar(inputData));
			processGame();
			show(); // �Է¹ް� �����ϰ� �����ְ�
		} while (failed < 6 && remainder > 0); // failed�� 6�� �ǰų� remainder�� 0�̵Ǹ� ��������
		System.out.println("��� ������ �����մϴ�.");
	}

	private void show() {
		System.out.println("Ʋ�� Ƚ��: " + failed + "/6");
		System.out.println(outputString);
		System.out.println();
	}

	public void setInputData() {
		System.out.print("���ڸ� �Է��� �ּ���: ");
		this.inputData = sc.next().substring(0, 1);
	}

	private boolean checkChar(String inputData) {
		if (inputString.indexOf(inputData) == -1) {
			inputString.append(inputData);
			return false;
		}
		System.out.println("�̹� �Է��� �����Դϴ�.");
		return true;
	}

	private void processGame() {
		if (hiddenString.indexOf(inputData) == -1) {
			failed++;
		} else {
			int index = hiddenString.indexOf(inputData);
			do {
				System.out.println(inputData);
				outputString.replace(index, index + 1, inputData); // ���ڹٲ�
				remainder--;
				index = hiddenString.indexOf(inputData, index + 1); // ��ȣã��
			} while (index != -1);
		}
	}
}
