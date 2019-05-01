package com.xkzhangsan.synchronizedpack.bank;

public class Account {
	
	private double balance;
	
	public synchronized void addAmount(double amount){
		double tmp = balance;
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		tmp+=amount;
		balance=tmp;
	}

	public synchronized void substractAmount(double amount){
		double tmp = balance;
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		tmp-=amount;
		balance=tmp;
	}
	

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	

}
