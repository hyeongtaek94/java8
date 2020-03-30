package Day12;

public class CalculatorEx {
	public static void main(String[] args)	{
		Calculator calc = new Calculator();
		calc.powerOn();
		int res1 = calc.plus(10,  20);
		System.out.println(res1);
		
		byte num1 = 10;
		byte num2 = 3;
		double res2 = calc.divide(num1, num2);
		System.out.println(res2);
		
		long num3 = 100;
		long num4 = 30;
		double res3 = calc.plus(num3, num4);
		System.out.println(res3);
		calc.powerOff();
	}
}
