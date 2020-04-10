package Day21;

public class Question3 {
	public static void main(String[] args) {
		Account account = new Account();
		Customer[] cArr = new Customer[4];
		for (int i = 0; i < 4; i++) {
			cArr[i] = new Customer(account);
			cArr[i].start();
		}
		for (int i = 0; i < 4; i++) {
			try {
				cArr[i].join();
			} catch (InterruptedException e) {

			}
		}
		System.out.println("총액은: " + account.getBalance());
	}
}

class Account {
	int balance = 1_000_000;

	synchronized void deposit(int money) {
		if (balance - money < 0) {
			Thread.currentThread().interrupt();
		} else {
			balance -= money;
			System.out.println(
					money + "원을 " + Thread.currentThread().getName() + "rk dlscnf, skadms wksdor: " + getBalance());
		}
	}

	public int getBalance() {
		return balance;
	}
}

class Customer extends Thread {
	private Account account;

	public Customer(Account account) { // 생성자
		this.account = account;
	}

	@Override
	public void run() {
		while (true) {
			account.deposit(9800);
			if (interrupted()) {
				break;
			}
		}
	}

}