package java8;

import java.util.Scanner;

public class Day0705 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�� ���� ����Ͻðڽ��ϱ�?: ");
		int line = sc.nextInt();
		if(line % 2 == 0) {
			System.out.println("¦���� ������� �ʽ��ϴ�. ���α׷��� �����մϴ�.");
			System.exit(0);	//¦����� ����
		}
		
		int upLine = line / 2;
		int downLine = line - upLine;
		
		for(int i=0; i<upLine; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for(int i=downLine; i>0; i--) {
			for(int j=0; j<i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
