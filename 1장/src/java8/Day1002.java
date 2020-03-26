package java8;

public class Day1002 {
	public static void main(String[] args) {
		
	
	int s0 = 10;
	int s1 = 20;
	int s2 = 30;
	int s3 = 40;
	int s4 = 50;
	int si = 100;
	int[] students = {10, 20, 30, 40, 50};	//중괄호로 배열을 초기화하면
											//배열의 크기를 입력되는 값으로 자동 계산합니다.
	
	int res1 = s0 + s1 + s2 + s3 + s4;
	System.out.println(res1);
	int res2 = students[0] + students[1] + students[2] + students[3] + students[4];
	System.out.println(res2);
	
	int res3 = 0;
	for(int i=0; i<5; i++)	{
		res1 += students[i];	//배열의 인덱스를 변수로 사용가능합니다.
	}
	System.out.println(res3);
	
	s0 = 100;
	System.out.println(s0);	//s0초기화
	students[0] = 1000;	//배열의 인덱스는 일반 변수와 동일하게 사용합니다.
	System.out.println(students[0]);
	}
}
