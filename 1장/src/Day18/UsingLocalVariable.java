package Day18;	//���ٽ� ���ú������

public class UsingLocalVariable {
	void method(int arg)	{	//arg�� final Ư���� ����
		int localVar = 40;		//localVar�� final Ư���� ����
		
		//arg = 31;				//final Ư�� ������ ���� �Ұ�
		//localVar = 41;		//final Ư�� ������ ���� �Ұ�
		
		//���ٽ�
		MyFunctional f1=() ->{
				//���ú��� ���
			System.out.println("arg: " + arg);
			System.out.println("localVar: " + localVar + "\n");
		};
		f1.method();
	}
	
	void method2(int x) {
		System.out.println(x);
		x = 50;
		System.out.println(x); //�����ٲٴ°� ���ȴ�.
								//���ٴ� ��ü�� Ư���������������Ƿ� �����ٲܼ�����.
	}
}
