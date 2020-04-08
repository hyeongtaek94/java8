package Day19;

import java.util.function.Function;
import java.util.function.IntBinaryOperator;

public class Ex2 {
	public int add(int a, int b) {
		return a * b;
	}
	public static int mul(int a, int b) {
		return a * b;
		
	}
	
	public void oper(IntBinaryOperator operator, int a, int b) {
		System.out.println("����/�ν��Ͻ� �޼ҵ� ����: " + operator.applyAsInt(a,b));
	}
	
	public void operS(Function<String, String> StringOperator, String a) {
		System.out.println("�Ű������� �޼ҵ� ����: " + StringOperator.apply(a));
}

public static void main(String[] args) {
	Ex2 ex = new Ex2();
	
	ex.oper((a, b) -> Ex2.mul(a, b),1,1)	;
	//���� �޼ҵ� ����
	ex.oper(Ex2::mul, 1, 1);
	
	ex.oper((a, b) -> ex.add(a,b),1,1) ;
	//�ν��Ͻ� �޼ҵ� ����	
	ex.oper(ex::add, 1, 1);
	
	ex.operS(s -> s.toLowerCase(), "STRING");
	//�Ű������� �޼ҵ� ����
	ex.operS(String::toLowerCase,  "STRING");
	}
}
