package Day20;	//������ (����ȭ �޼ҵ�� ����ȭ ���)

public class Calculator {
	private int memory;

	public int getMemory() {
		return memory;
	}

	public synchronized void setMemory(int memory) {
		this.memory = memory;
		try {
			Thread.sleep(2000);		//2�ʵ��� ������ٰ�
		} catch (InterruptedException e) {
		}
		System.out.println(Thread.currentThread().getName() + ": " + this.memory);	//����� ����϶�
	}
}
