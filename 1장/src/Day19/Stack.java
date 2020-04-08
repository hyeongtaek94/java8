package Day19;	//���ÿ� �������


public class Stack<T> {
	int position;
	Object[] stack;

	public Stack() {
		position = 0;
		stack = new Object[20];

	}

	// ���ÿ� ��� ����
	public void push(T item) {
		if (position == 20)
			return;
		stack[position] = item;
		position++;
	}

	// ���ÿ� ��� ������
	public T pop() {
		if (position == 0)
			return null;
		position--;
		return (T) stack[position];

	}
}