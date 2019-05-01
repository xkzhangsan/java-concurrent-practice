package com.xkzhangsan.threads.pool;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class Main {
	
	public static void main(String[] args) {
		ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newCachedThreadPool();
		for (int i = 0; i < 10; i++) {
			Task task = new Task("task"+i);
			executor.execute(task);
		}
	}

}
