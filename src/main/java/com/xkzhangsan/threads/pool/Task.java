package com.xkzhangsan.threads.pool;

public class Task implements Runnable{
	
	private String name;

	public Task(String name) {
		super();
		this.name = name;
	}

	@Override
	public void run() {
		System.out.println("task:"+name+" start...");
	}

}
