package com.xkzhangsan.reentrantlockpack.bank;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Account {
	
	private double balance;
	
	private final Lock lock = new ReentrantLock();
	
	public void addAmount(double amount){
		lock.lock();
		try {
			double tmp = balance;
			Thread.sleep(10);
			tmp+=amount;
			balance=tmp;
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}

	public void substractAmount(double amount){
		lock.lock();
		try {
			double tmp = balance;
			Thread.sleep(10);
			tmp-=amount;
			balance=tmp;
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}
	

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	

}
