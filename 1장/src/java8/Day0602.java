package java8;

public class Day0602 {
	public static void main(String[] args) {
		int sum = 0;
		int i = 0; //i는 index
		
		for(i=1; i<=100; i++) {	//i++은 index= index +1 과 같음 ※식적고 세미콜론 무조건 써주기!
			sum += i;			//무조건 +,-만 쓰는건아니다 필요에의해서 *도 쓴다
		}
		
		System.out.println("1부터 100까지의 합: " + sum);
//		System.out.println("현재 i의 값: " + i);
		
	
	}
	
}
