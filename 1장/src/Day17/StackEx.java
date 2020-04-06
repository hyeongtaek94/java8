package Day17;	//후입선출(LIFO: Last In First Out)은 나중에 넣은 객체가 먼저 빠져나가는 자료구조를말함.

import java.util.Stack;

public class StackEx {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();	//임포트
	
		int num;
		try {
			num = stack.peek();
			System.out.println(num);
		} catch(Exception e) {
			System.out.println("데이터가 없습니다.");	//데이터가없으면 예외발생함
		}
		
		stack.push(10);
		stack.push(20);
		num = stack.peek();
		System.out.println(num);	
		stack.push(30);
		stack.push(40);
		stack.push(50);
		System.out.println();
		
		while(!stack.isEmpty()) {
			num = stack.pop();
			System.out.println(num);
		}
		System.out.println(stack.isEmpty());
		
	}
}
