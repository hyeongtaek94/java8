package java8;

public class Day0604 {
	public static void main(String[] args) {
		int i, j;
		for( i=0; i<3; i++) {
			for( j=0; j<5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(i=0; i<3; i++) {		//동의선상에 i는 다시써도 위내용값의 영향을 미치지않음
			System.out.println("안녕하세요");
		}
	}
}
