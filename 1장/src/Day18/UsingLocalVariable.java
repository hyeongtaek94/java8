package Day18;	//람다식 로컬변수사용

public class UsingLocalVariable {
	void method(int arg)	{	//arg는 final 특성을 가짐
		int localVar = 40;		//localVar는 final 특성을 가짐
		
		//arg = 31;				//final 특성 때문에 수정 불가
		//localVar = 41;		//final 특성 때문에 수정 불가
		
		//람다식
		MyFunctional f1=() ->{
				//로컬변수 사용
			System.out.println("arg: " + arg);
			System.out.println("localVar: " + localVar + "\n");
		};
		f1.method();
	}
	
	void method2(int x) {
		System.out.println(x);
		x = 50;
		System.out.println(x); //값을바꾸는게 허용된다.
								//람다는 객체의 특성을가지고있으므로 값을바꿀수없다.
	}
}
