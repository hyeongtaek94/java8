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
		
		functionAB = functionA.andThen(functionB);	//andThen�� A�ǰ���� B�γѱ�
		city = functionAB.apply(new Member("ȫ�浿", "hong", new Address("�ѱ�", "����")));
		System.out.println("���� ����: " + city);
		
		functionAB = functionB.compose(functionA);	//compose �� andThen�� �ݴ�, �Ű������� �Ѱ��϶� ��밡�� 
		city = functionAB.apply(new Member("ȫ�浿", "hong", new Address("�ѱ�", "����")));
		System.out.println("���� ����: " + city);
	}	
}
