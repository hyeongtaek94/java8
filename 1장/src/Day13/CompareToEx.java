package Day13;	//p169.3��	compareTo()�޼ҵ�:���� �տ����� �ڿ����� �����Ҷ� ���

public class CompareToEx {
	public static void main(String[] args) {
		String a = "aaa";			//a  a  a	a  a  b
		String b = "aab";			//97 97 97  97 97 98	��� ���ٸ� 0����ȯ
		int res = a.compareTo(b);	//						 2��°���� �����ʴٸ� �ڿ��� ��������ʴ´�.
		System.out.println("�񱳰��: " + res);
		
		
		String a1 = "aaa";
		String b1 = "ABC";
		int res1 = a1.compareTo(b1);
		System.out.println("�񱳰��: " + res1);
		
		
		String c = "Java Programming Very Good";
		String d = "Java Programming";
		
		boolean compare1 = c.regionMatches(false, 5, d, 5, 11);
		boolean compare2 = c.regionMatches(false, 0, d, 0, 4);
		boolean compare3 = c.regionMatches(false, 0, d, 0, 4);
		
		System.out.println(compare1);
		System.out.println(compare2);
		System.out.println(compare3);
		
	}
}
