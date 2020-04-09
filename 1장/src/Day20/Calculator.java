package Day20;	//스레드 (동기화 메소드와 동기화 블록)

public class Calculator {
	private int memory;

	public int getMemory() {
		return memory;
	}

	public synchronized void setMemory(int memory) {
		this.memory = memory;
		try {
			Thread.sleep(2000);		//2초동안 잠재웠다가
		} catch (InterruptedException e) {
		}
		System.out.println(Thread.currentThread().getName() + ": " + this.memory);	//깨어나면 출력하라
	}
}
