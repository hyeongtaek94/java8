package Day16;	//제한된 타입 파라미터(<T extends 최상위타입>)

public class BoundedTypeParameterExample {
	public static void main(String[] args) {
//		String str;	Control+t에서 확인
		//String str = Util.compare("a", "b"); (x)	//String은 Number가 아니기때문
		
		int result1 = Util.compare(10, 20);	//t1과 t2가 int이므로integer로 유추가 가능
		System.out.println(result1);	//-1
		
		int result2 = Util.<Number>compare(4.5, 3);	//t1은 double, t2는 int
		System.out.println(result2);	//1
		
		int result3 = Util.compare(100, 100);
		System.out.println(result3);
	}
}
