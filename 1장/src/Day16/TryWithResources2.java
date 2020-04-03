package Day16;

import java.util.Scanner;
import java.io.File; 

public class TryWithResources2 {
	public void getData(String file) {
		Scanner sc = null;
		try {
			sc = new Scanner(new File(file));
			System.out.println(sc.hasNextLine());
		} catch (Exception e) {
			System.err.println("���ܹ߻�");
			System.out.println();
			e.getMessage();
			System.out.println();
			e.printStackTrace();
		} finally {	//����� ��Ʈ���� ������ �ݱ� ���ؼ� finally ������ �̿�(1.6���� ����)
			if(sc != null) {
				sc.close();
			}
		}
	}
		public static void main(String[] args) {
			TryWithResources2 twr = new TryWithResources2();
			twr.getData("test.txt");
	}
}
