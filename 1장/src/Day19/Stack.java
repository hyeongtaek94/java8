package Day19;	//스택에 요소저장


public class Stack<T> {
	int position;
	Object[] stack;

	public Stack() {
		position = 0;
		stack = new Object[20];

	}

	// 스택에 요소 저장
	public void push(T item) {
		if (position == 20)
			return;
		stack[position] = item;
		position++;
	}

	// 스택에 요소 꺼내옴
	public T pop() {
		if (position == 0)
			return null;
		position--;
		return (T) stack[position];

	}
}