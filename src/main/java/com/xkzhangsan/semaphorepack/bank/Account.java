package com.xkzhangsan.semaphorepack.bank;

import java.util.concurrent.Semaphore;

public class Account {
	
	private double balance;
	
	private final Semaphore semaphore = new Semaphore(1);
	
	public void addAmount(double amount){
		try {
			semaphore.acquire();
			double tmp = balance;
			Thread.sleep(10);
			tmp+=amount;
			balance=tmp;
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			semaphore.release();
		}
	}

	public void substractAmount(double amount){
		try {
			semaphore.acquire();
			double tmp = balance;
			Thread.sleep(10);
			tmp-=amount;
			balance=tmp;
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			semaphore.release();
		}
	}
	

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	

}
