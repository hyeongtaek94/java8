package java8;

public class Day1101 {
	public static void main(String[] args) {
//		1부터 100까지 저장하는 배열을 만들고
//		전체의 합을 출력하는 코드를 작성하세요.
		
		int[] arr = new int[100];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = i + 1;
			System.out.println(arr[i] + "\t");
			if((i+1) % 5 == 0) {
				System.out.println();
			}
		}
		System.out.println();
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = i + 1;
		}
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i] + "\t");
			if((i+1) % 5 == 0) {
				System.out.println();
	}
}	System.out.println();

	int sum = 0;
	for(int i=0; i<arr.length; i++) {
		sum +=arr[i];
		
	}
	System.out.println("1~100의 합: " + sum);

}
}