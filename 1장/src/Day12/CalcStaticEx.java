package Day12;

public class CalcStaticEx {
	public static void main(String[] args) {
		
		CalcStatic cs = new CalcStatic();
		double res1 = cs.pi * 10;
		int res2 = cs.plus(10,  3);	//����� �������� �޸𸮰� �����ϹǷ�
		int res3 = cs.minus(10, 3);	//�����ض�� �޼���
		
		
		double result1 = 10 * 10 * CalcStatic.pi;
		int result2 = CalcStatic.plus(10, 5);
		int result3 = CalcStatic.minus(10, 5);
		
		CalcStatic calcs = new CalcStatic();
		
		System.out.println("result1: " + result1);
		System.out.println("result2: " + result2);		// static������쿡��
		System.out.println("result3: " + result3);		// class��.���� ���� ��밡��
		System.out.println("result4: " + calcs.pi);		// class�� �Ҽӵ�.
		
		System.out.println(CalcStatic.number);
		CalcStatic.number = 100;
		System.out.println(CalcStatic.number);
		
		
	}
	
}
