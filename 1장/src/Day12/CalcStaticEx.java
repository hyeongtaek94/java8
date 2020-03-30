package Day12;

public class CalcStaticEx {
	public static void main(String[] args) {
		
		CalcStatic cs = new CalcStatic();
		double res1 = cs.pi * 10;
		int res2 = cs.plus(10,  3);	//노랑색 쓸데없는 메모리가 차지하므로
		int res3 = cs.minus(10, 3);	//수정해라는 메세지
		
		
		double result1 = 10 * 10 * CalcStatic.pi;
		int result2 = CalcStatic.plus(10, 5);
		int result3 = CalcStatic.minus(10, 5);
		
		CalcStatic calcs = new CalcStatic();
		
		System.out.println("result1: " + result1);
		System.out.println("result2: " + result2);		// static같은경우에는
		System.out.println("result3: " + result3);		// class명.네임 으로 사용가능
		System.out.println("result4: " + calcs.pi);		// class에 소속됨.
		
		System.out.println(CalcStatic.number);
		CalcStatic.number = 100;
		System.out.println(CalcStatic.number);
		
		
	}
	
}
