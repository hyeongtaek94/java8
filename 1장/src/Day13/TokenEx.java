package Day13;

import java.util.StringTokenizer;

public class TokenEx {
	public static void main(String[] args) {
		String now = "2020/03/31";
		
		StringTokenizer st = new StringTokenizer(now, "/");
		
		int cnt = st.countTokens();
		System.out.println("현재 토큰 수: " + cnt);
		
		while(st.hasMoreTokens()) {
			String temp = st.nextToken();
			System.out.println(temp);
		}
		
	}
}
/*
 * 파싱-구분자에 따라 문자열을 나누는 작업
 * 토큰 - 전체 문자열을 구분되는 문자열(또는 문자)을 기준으로 쪼갠 단위이고,
 * 이때 구분되는 문자열(또는 문자)를 구분자라고 한다.
 * 
 * String nextToken():파싱해서 구한 토큰을 반환
 * boolean hasMoreTokens():문자가 더 있는지 알려줌
 * countTokens():토큰수
 * */
