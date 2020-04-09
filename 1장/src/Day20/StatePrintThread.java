package Day20;	//������ ����

public class StatePrintThread extends Thread {
	private Thread targetThread;

	public StatePrintThread(Thread targetThread) {
		this.targetThread = targetThread;
	}

	public void run() {
		while (true) { // ������ ���¸� 0.5�ʿ� �� ���� ���
			Thread.State state = targetThread.getState();
			System.out.println("Ÿ�� ������ ����: " + state);
			if (state == Thread.State.NEW) {		//���θ��� ���¶��
				targetThread.start();			// targetThread�� �����ض�
			}
			if (state == Thread.State.TERMINATED) {	//����Ǿ��ٸ�
				break;								//���Ϲ��� �����ض�
			}
			try {
				Thread.sleep(500); // 0.5�ʰ� �Ͻ� ����
			} catch (Exception e) {
			}
		}
	}

}
