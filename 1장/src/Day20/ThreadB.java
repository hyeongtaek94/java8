package Day20; //다른 스레드에게 실행 양보 - yield()

public class ThreadB extends Thread {
	public boolean stop = false;
	public boolean work = true;

	public void run() {
		while (!stop) {
			if (work) {
				System.out.println("ThreadB 작업 내용");
			} else {
				Thread.yield();
			}
		}
		System.out.println("ThreadA 종료");
	}
}
