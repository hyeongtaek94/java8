package Day20;

public class JoinEx {
	public static void main(String[] args) {
		SumThread t = new SumThread();
		t.start();
		try {
			Thread.sleep(10);
			t.join();		//t가 완전히 끝나야지 됨
		} catch (InterruptedException e) {
		}
		System.out.println(t.getSum());
	}
}
