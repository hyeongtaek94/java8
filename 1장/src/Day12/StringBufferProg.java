package Day12;

public class StringBufferProg {
	public static void main(String[] args) {
		StringBuffer str = new StringBuffer("Java Programming");
		StringBuffer str2;
		
		str2 = str.insert(5, "JSP "); //5��°�� ��������
		System.out.println(str);
		System.out.println(str2);
		
		str.append(" Good ");
		str.append('A');
		System.out.println(str);
		
		str2.reverse();
		System.out.println(str2);	//������ ������
		
		str.setLength(10);
		System.out.println(str); //10���ڸ� ������ ������ (���� �����ּ�) 
	}
}
