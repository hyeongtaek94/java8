package Day16;

public class ArrayExceptionEx {
	public static void main(String[] args) {
		exceptionTest();
	}
	
	static void exceptionTest() {
		int[] arr = new int[3];
		try {
			arr[2] = 100;
			System.out.println(arr[2]);
//			throw new ArrayIndexOutOfBoundsException();	//���������� ���ܸ� �߻���Ű����
												//��ü�� �����ؼ� throw �մϴ�
		} catch(ArithmeticException |ArrayIndexOutOfBoundsException e) {	
			System.out.println("���� ������ �Ұ��ɴ��ϰų� �迭�� ������ ������ϴ�");
		} catch(Exception e) {
			System.out.println("�߻��� ��� ���ܸ� ó���մϴ�.");	//swich���� default ó��
			e.printStackTrace();									//Exception�� ������ �ö󰡸� �ȵ� ���� �������� ����ؾ���
			//printStackTrace: �ٸ������� �����ϰ� ���ǰ�, ������ ��½�Ŵ
		} finally {	//���ܿ� ������� ������ �����ϴ� �����Դϴ�. ���������մϴ�.	//try, catch�� �ѹ������� ���̻���ؾ��Ѵ�
			System.out.println("finally �����Դϴ�.");
		}
		
		try {
			Thread.sleep(1000);	//����ó�� ���̴� ������ �Ұ����� �ڵ�
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
