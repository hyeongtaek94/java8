package Day13;	//p169.3번	compareTo()메소드:누가 앞에가나 뒤에가나 정렬할때 사용

public class CompareToEx {
	public static void main(String[] args) {
		String a = "aaa";			//a  a  a	a  a  b
		String b = "aab";			//97 97 97  97 97 98	모두 같다면 0을반환
		int res = a.compareTo(b);	//						 2번째에서 같지않다면 뒤에는 계산하지않는다.
		System.out.println("비교결과: " + res);
		
		
		String a1 = "aaa";
		String b1 = "ABC";
		int res1 = a1.compareTo(b1);
		System.out.println("비교결과: " + res1);
		
		
		String c = "Java Programming Very Good";
		String d = "Java Programming";
		
		boolean compare1 = c.regionMatches(false, 5, d, 5, 11);
		boolean compare2 = c.regionMatches(false, 0, d, 0, 4);
		boolean compare3 = c.regionMatches(false, 0, d, 0, 4);
		
		System.out.println(compare1);
		System.out.println(compare2);
		System.out.println(compare3);
		
	}
}
