package java8;

public class Day1102 {
	public static void main(String[] args) {
//		0~9까지 저장된 배열을 출력후
//		0으로 초기화하여 출력하세요.
		
		int[] arr = new int[10];
		for(int i=0; i<arr.length; i++) {
			arr[i] = i;
			
		}
		for(int number: arr) {
			System.out.println(number);
		}
		
//		for(int i=0; i<arr.length; i++) {	 //각각의 요소를 0으로 대입
//			arr[i] = 0;
//		}
		arr = new int[10];	//새로운 객체를 대입
		
		for(int number: arr) {
			System.out.println(number);
		}
		
	}
}
