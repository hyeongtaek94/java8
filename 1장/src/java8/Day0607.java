package java8;	//while¹®

public class Day0607 {
	public static void main(String[] args) {
	
	for(int i=0; i<10; i++) {
		System.out.println(i);
	}
	
	int index = 0;
	while(index < 10) {
		System.out.println(index++);
		index++;
	}
	}
}
