package java8;

public class Day07miss07 {
	public static void main(String[] args) {
		int count = 0;
		
		for(int i = 1; i<= 50; i++)
		{
			if(i % 3 ==0)
				count++;
		}
		System.out.println(count);
	}
}
