package java8;

public class Day0702 {
	public static void main(String[] args) {
		for (int i=1; i<=100; i++) {
			if(i%3 == 0 && i%5 == 0) { 	//or i%3 == 0 && i%5 == 0 i%15 == 0
				System.out.println(i + "PINGPONG");
			
		} 
		else if(i%3 == 0) {
			System.out.println(i + "PING");
		}
		else if(i%5== 0) { 	//or i%3 == 0 && i%5 == 0 i%15 == 0
			System.out.println(i + "PINGPONG");
		}	else {
			System.out.println(i);
		}	
		}
		
		for(int i=1; i<=100; i++) {
			System.out.print(i + " ");
			if(1%3 ==0) {
				System.out.print("PING");
			}
			if(i%5 == 0) {
				System.out.print("PONG");
			}
			
				
				System.out.println();
			
		}
	}
}
