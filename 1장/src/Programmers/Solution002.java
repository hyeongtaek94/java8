package Programmers;

public class Solution002 {
	public String solution(String s, int n) {
		char[] chArr = s.toCharArray();
		String answer = "";
		
		for(int i = 0; i < chArr.length; i++) {
			if((chArr[i] >= 'a' && chArr[i] <= 'z') || (chArr[i] >= 'A' && chArr[i] <= 'Z')) {
				chArr[i] += n;
				if(chArr[i] > 'z') {
					chArr[i] -= 26;
				}
			}  else if ((chArr[i] >= 'A' && chArr[i] <= 'Z')){
				chArr[i] += n;
				if(chArr[i] > 'Z') {
					chArr[i] -= 26;
				}
			}
			answer += chArr[i];
		}
		
		return answer;
	}

}
