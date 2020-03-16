package java8;

public class Day0308 {
	public static void main(String[] args) {
		int a = 10;
		System.out.println(a);
		a += 1;
		System.out.println(a);
		a += 1;
		System.out.println(a);
		a += 1;
		System.out.println(a);
		System.out.println();
		
		a++;	//전위, 전치 연산자
		System.out.println(a);
		a++;
		System.out.println(a);
		a++;
		System.out.println(a);
		System.out.println();
		
		++a;	//후위, 후치 연산자
		System.out.println(a);
		++a;
		System.out.println(a);
		++a;
		System.out.println(a);
		System.out.println();
		
		a--;
		System.out.println(a);
		a--;
		System.out.println(a);
		a--;
		System.out.println(a);
		System.out.println();
		
		a = 10;
		System.out.println(++a);
		System.out.println(++a);
		System.out.println(++a);
		System.out.println(++a);
		System.out.println(++a);
		System.out.println();
		
		System.out.println(a++);
		System.out.println(a++);
		System.out.println(a++);
		System.out.println(a++);
		System.out.println(a++);
		System.out.println();
		
		System.out.println(a);
	}
}
