package java8; 	//for ������

public class Day0605 {
	public static void main(String[] args) {
		System.out.println("������ ���");
		
		for(int i=2; i<9; i++) {
			System.out.print(i + "��" +"\t");
			for(int j=2; j<=9; j++) {
				System.out.print(j + "x" + i + "=" + (i * j) + "\t");	//*�� �켱���� \t�� ��ĭ����
			}
			System.out.println();
		}
	}
}
