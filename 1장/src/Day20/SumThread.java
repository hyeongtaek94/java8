package Day20; //�ٸ� �������� ���Ḧ ��ٸ� -join()

public class SumThread extends Thread {
	private long sum;

	public long getSum() {
		return sum;
	}

	public void setSum(long sum) {
		this.sum = sum;
	}

	public void run() {
		for (int i = 1; i <= 1_000_000_000; i++) {
			sum += i;
		}
	}
}
