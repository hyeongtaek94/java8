package java8; 	//for 구구단

public class Day0605 {
	public static void main(String[] args) {
		System.out.println("구구단 출력");
		
		for(int i=2; i<9; i++) {
			System.out.print(i + "단" +"\t");
			for(int j=2; j<=9; j++) {
				System.out.print(j + "x" + i + "=" + (i * j) + "\t");	//*가 우선순위 \t는 한칸띄우기
			}
			System.out.println();
		}
	}
}
