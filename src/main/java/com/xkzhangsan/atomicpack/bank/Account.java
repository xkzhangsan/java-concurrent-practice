package com.xkzhangsan.atomicpack.bank;

import java.util.concurrent.atomic.AtomicLong;

public class Account {
	
	private AtomicLong balance = new AtomicLong();
	
	public void addAmount(long amount){
		this.balance.getAndAdd(amount);
	}

	public void substractAmount(long amount){
		this.balance.getAndAdd(-amount);
	}

	public long getBalance() {
		return balance.get();
	}

	public void setBalance(long balance) {
		this.balance.set(balance);
	}

}
