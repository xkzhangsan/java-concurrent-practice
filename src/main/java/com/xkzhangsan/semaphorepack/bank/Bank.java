package com.xkzhangsan.semaphorepack.bank;

public class Bank implements Runnable{
	
	private Account account;
	
	public Bank(Account account) {
		super();
		this.account = account;
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			account.substractAmount(1000);
			System.out.println("Bank substract 1000 balance:" + account.getBalance());
		}
	}
}
