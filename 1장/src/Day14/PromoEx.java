package Day14;

public class PromoEx {
	public static void main(String[] args) {
		PromoChild pc = new PromoChild();
		pc.method1();
		pc.method2();
		pc.method3();
		
		PromoParent pp = pc;	//�ڽ��� �θ� ������ �����մϴ�.(�ڵ�����ȯ)
		pp.method1();
		pp.method2();
//		pp.method3();	//�θ��� �����̱� ������ �θ𿡴� method3�� �����ϴ�.
						//�׷��� ����� �Ұ����մϴ�
//		pc = pp;	//�ڽĿ� �θ� ������ �� �����ϴ�.
		
		pc = (PromoChild)pp;	//�ڽĿ� �θ� ������ �� �����ϴ�. ��������ȯ�� �����մϴ�.
		pc.method1();	//�θ��� ��ü�� �ڽ��� ��ü�� ���Ե� ���� �������� �ڽ� ��ü����߸� �մϴ�.
		pc.method2();
		pc.method3();
		
		PromoParent pp2 = new PromoParent();
		if(pp  instanceof PromoChild) {
			pc = (PromoChild)pp;	//��������ȯ�� ������ ���·� ������ �����մϴ�.
			pc.method3();
			
		} else {
			System.out.println("��������ȯ�� ����� �� �����ϴ�.");
		}
	}
}
