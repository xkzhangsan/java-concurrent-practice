package com.xkzhangsan.atomicpack.bank;

public class Company implements Runnable{
	
	private Account account;
	
	public Company(Account account) {
		super();
		this.account = account;
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			account.addAmount(1000);
			System.out.println("Company add 1000 balance:" + account.getBalance());
		}
	}
}
