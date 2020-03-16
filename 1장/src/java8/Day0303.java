package java8;

public class Day0303 {
	public static void main(String[] args) {
		int number1 = 100; //지역변수
		System.out.println(number1);
		
		{	//중괄호 블럭
			System.out.println(number1);
			int number2 = 200; //블럭변수 	중괄호 안 블럭 number2는 외부에서 사용 안되나,
								//내부에 number1은 내부에서사용가능
			System.out.println(number2);
		}
		
		System.out.println(number1);
		//System.out.println(number2);
		
	}
}
