package Day13;

import java.util.StringTokenizer;

public class TokenEx {
	public static void main(String[] args) {
		String now = "2020/03/31";
		
		StringTokenizer st = new StringTokenizer(now, "/");
		
		int cnt = st.countTokens();
		System.out.println("���� ��ū ��: " + cnt);
		
		while(st.hasMoreTokens()) {
			String temp = st.nextToken();
			System.out.println(temp);
		}
		
	}
}
/*
 * �Ľ�-�����ڿ� ���� ���ڿ��� ������ �۾�
 * ��ū - ��ü ���ڿ��� ���еǴ� ���ڿ�(�Ǵ� ����)�� �������� �ɰ� �����̰�,
 * �̶� ���еǴ� ���ڿ�(�Ǵ� ����)�� �����ڶ�� �Ѵ�.
 * 
 * String nextToken():�Ľ��ؼ� ���� ��ū�� ��ȯ
 * boolean hasMoreTokens():���ڰ� �� �ִ��� �˷���
 * countTokens():��ū��
 * */
