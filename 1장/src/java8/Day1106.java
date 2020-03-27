package java8;

import java.util.Random;
import java.util.Scanner;

public class Day1106 {
	public static void main(String[] args) {
		/*
		 * 로또 생성기 작성 1. 6개의 랜덤한 숫자(1~45)를 배열에 입력하세요.
		 * 2. 중복되지 않도록 작성하세요.
		 */

		int[] lotto = new int[6];
		Random rd = new Random();
		System.out.println("로또 생성기");
		System.out.println("몇 게임을 생성하시겠습니까?: ");
		Scanner sc = new Scanner(System.in);
		int game = sc.nextInt();

		for (int x = 0; x < game; x++) {
//		로또 생성 시작
			for (int i = 0; i < lotto.length; i++) {
				lotto[i] = rd.nextInt(45) + 1;
				for (int j = 0; j < i; j++) {
					if (lotto[i] == lotto[j]) {
						i--;
						break;
					}
				}
			}
//		버블정렬을 사용해서 배열을 오름차순으로 정렬하세요.

			for (int i = 0; i < lotto.length; i++) { // 버블정렬, 외워서 쓰는수밖에없음.
				for (int j = 0; j < lotto.length - 1; j++) {
					if (lotto[i] < lotto[j]) { // r[i]>r[j] 로 바꾸면 내림차순으로 변경됨.
						int temp = lotto[i];
						lotto[i] = lotto[j];
						lotto[j] = temp;
					}
				}
			}

			for (int i = 0; i < lotto.length; i++) {
				System.out.print(lotto[i] + " ");
			}
			System.out.println();
//		로또 생성 끝
		}
	}
}
