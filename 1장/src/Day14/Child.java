package Day14;

public class Child extends Parent{
	Child(String name){
		super(name);
//		super();	// ������������� �ڵ����� �����˴ϴ�.
					// super�� �ֱ⶧���� �θ� �ҷ��ü�����.
					// ���� this �θ�� super
		System.out.println("�ڽ��� �����մϴ�");
	}
}
//default �����ڰ� �θ� ���ٸ� �ڽĿ� ������ ���� ���������