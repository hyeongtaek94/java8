package Day16;	//���ѵ� Ÿ�� �Ķ����(<T extends �ֻ���Ÿ��>)

public class BoundedTypeParameterExample {
	public static void main(String[] args) {
//		String str;	Control+t���� Ȯ��
		//String str = Util.compare("a", "b"); (x)	//String�� Number�� �ƴϱ⶧��
		
		int result1 = Util.compare(10, 20);	//t1�� t2�� int�̹Ƿ�integer�� ���߰� ����
		System.out.println(result1);	//-1
		
		int result2 = Util.<Number>compare(4.5, 3);	//t1�� double, t2�� int
		System.out.println(result2);	//1
		
		int result3 = Util.compare(100, 100);
		System.out.println(result3);
	}
}
