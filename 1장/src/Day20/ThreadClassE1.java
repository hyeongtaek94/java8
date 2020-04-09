package Day20;	//p.332 �ǽ����� 1

public class ThreadClassE1 extends Thread{
	int delay;
	ThreadClassE1(String name, int delay){
		super(name);
		this.delay = delay;
	}
	
	public void run() {
		try {
			while(true) {
				System.out.println(getName()+" ");
				Thread.sleep(delay);
			}
		}catch(Exception e)	{System.out.println("error"); return;
	}
}
	public static void main(String[] args) {
		ThreadClassE1 t1 = new ThreadClassE1("������1", 500);
		ThreadClassE1 t2 = new ThreadClassE1("������2", 700);
		t1.start();
		t2.start();
	}
}