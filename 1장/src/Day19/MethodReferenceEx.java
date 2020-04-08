package Day19;

import java.util.function.IntBinaryOperator;

public class MethodReferenceEx {
	public static void main(String[] args) {
		IntBinaryOperator operator;
		
		operator = new IntBinaryOperator() {	//익명구현객체
			
			@Override
			public int applyAsInt(int left, int right) {
				return Calculator.staticMethod(left, right);
			}
		};
		
		int result = operator.applyAsInt(10, 20);
		System.out.println(result);
		
		operator = (int left, int right) -> {	//람다식
			return Calculator.staticMethod(left, right);
		};
		
		operator = (x, y) ->Calculator.staticMethod(x, y);	//람다식 더줄였음
		result = operator.applyAsInt(10, 20);
		System.out.println(result);
		
		operator = Calculator::staticMethod;	//정적메소드 참조
		result = operator.applyAsInt(10, 20);
		System.out.println(result);
		
		Calculator calc = new Calculator();
		
		operator = calc::instanceMethod;	//인스턴스 메소드 참조
		result = operator.applyAsInt(10, 20);
		System.out.println(result);
	}
}
