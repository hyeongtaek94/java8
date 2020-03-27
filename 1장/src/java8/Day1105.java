package java8;	//�ζ� ��÷��

import java.util.Arrays;

public class Day1105 {
	/*
	 * 1. 1~45�� �Է��� �迭�� �ۼ��մϴ�.
	 * 2. �ۼ��� �迭�� �������� �����ϴ�.
	 * 3. 0�� �ε������� 6�� �ε������� ����մϴ�.
	 * */
	
	public static void main(String[] args) {
		int[] arr = new int[45];
		for(int i=0; i<arr.length; i++) {
			arr[i] = i+1;
			System.out.print(arr[i] + "\t");
			if((i+1) % 5 == 0) {
				System.out.println();
			}
		}
		System.out.println();
		
		for(int i=0; i<10_000; i++) {	//�������� 1���� ��������
			int r = (int)(Math.random() * 45);	
			int temp = arr[0];
			arr[0] = arr[r];
			arr[r] = temp;
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + "\t");
			if((i+1) % 5 ==0){
				System.out.println();
			}
		}
		System.out.println();
		
		System.out.println("�ζ� ��÷��");
		int[] ary = Arrays.copyOf(arr, 6);
		Arrays.sort(ary);
		System.out.print("��÷ ��ȣ: ");
		for(int i=0; i<ary.length; i++) {
			System.out.print(ary[i] + " ");
		}
		System.out.println(", ���ʽ� ��ȣ: " + arr[6]);
	}
}



















