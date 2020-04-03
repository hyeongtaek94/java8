package Day16;

import java.util.Scanner;
import java.io.File; 

public class TryWithResources {
	public void getData(String file) {
		Scanner sc = null;
		try {
			sc = new Scanner(new File(file));
			System.out.println(sc.hasNextLine());
		} catch (Exception e) {
			System.err.println("예외발생");
			System.out.println();
			e.getMessage();
			System.out.println();
			e.printStackTrace();
		} finally {	//입출력 스트림을 강제로 닫기 위해서 finally 구간을 이용(1.6버전 이전)
			if(sc != null) {
				sc.close();
			}
		}
	}
		public static void main(String[] args) {
			TryWithResources twr = new TryWithResources();
			twr.getData("test.txt");
	}
}
