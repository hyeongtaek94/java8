package Day19;

import java.util.function.Function;

public class FunctionAndThenComposeEx {
	public static void main(String[] args) {
		Function<Member, Address> functionA;
		Function<Address, String> functionB;
		Function<Member, String> functionAB;
		String city;
		
		functionA = (m) -> m.getAddress();
		functionB = (a) -> a.getCity();
		
		functionAB = functionA.andThen(functionB);	//andThen은 A의결과를 B로넘김
		city = functionAB.apply(new Member("홍길동", "hong", new Address("한국", "서울")));
		System.out.println("거주 도시: " + city);
		
		functionAB = functionB.compose(functionA);	//compose 은 andThen의 반대, 매개변수가 한개일때 사용가능 
		city = functionAB.apply(new Member("홍길동", "hong", new Address("한국", "서울")));
		System.out.println("거주 도시: " + city);
	}	
}
