package Day20;	//스레드 상태

public class StatePrintThread extends Thread {
	private Thread targetThread;

	public StatePrintThread(Thread targetThread) {
		this.targetThread = targetThread;
	}

	public void run() {
		while (true) { // 스레드 상태를 0.5초에 한 번씩 출력
			Thread.State state = targetThread.getState();
			System.out.println("타겟 스레드 상태: " + state);
			if (state == Thread.State.NEW) {		//새로만든 상태라면
				targetThread.start();			// targetThread를 실행해라
			}
			if (state == Thread.State.TERMINATED) {	//종료되었다면
				break;								//와일문을 종료해라
			}
			try {
				Thread.sleep(500); // 0.5초간 일시 정지
			} catch (Exception e) {
			}
		}
	}

}
