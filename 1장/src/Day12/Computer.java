package Day12;

public class Computer {
	int sum(int[] arr) {
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
			
		}
		return sum;		//꼭 변수에 넣어서 리턴할필요없음. 바로하면됨
	}
		
		int sum2(int... arr) {
			int sum = 0;
			for(int i=0; i<arr.length; i++) {
				sum += arr[i];
			}
			return sum;
	}
}
