package Day20;

class Account {
	private int tot = 0;

	synchronized void deposit(int amt) {
		tot += amt;
	}

	int gettot() {
		return tot;
	}
}

class Customer extends Thread {
	Account acc1;

	Customer(Account acc) {
		this.acc1 = acc;
	}

	public void run() {
		try {
			for (int i = 0; i < 300; i++) {
				System.out.println("쓰레드 " + getName() + " : " + i + "번째");
				acc1.deposit(1000);
				sleep(50);
				if (acc1.gettot() >= 1_000_000)
					break;
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
public class ContributionCount {
	public static void main(String[] args) {
		Account acc = new Account();
		Customer cust[] = new Customer[10];
		for(int i=0; i<10; i++) {
			cust[i] = new Customer(acc);
			cust[i].start();
		}
		for(int i=0; i<10; i++) {
			try {
				cust[i].join();
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("총액은 : " + acc.gettot());
	}
}
