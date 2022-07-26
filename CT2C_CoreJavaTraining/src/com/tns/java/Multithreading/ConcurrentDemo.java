//Java Program to demonstrate the concurrent program

package com.tns.java.Multithreading;

import java.util.concurrent.locks.ReentrantLock;

public class ConcurrentDemo {

	public static void main(String[] args) {

		ReentrantLock l = new ReentrantLock(); // object

		l.lock(); // lock the ReentrantLock object

		System.out.println(l.isLocked());

		// l.unlock();

		// display the held, count and queue length
		System.out.println(l.isHeldByCurrentThread());
		System.out.println(l.getHoldCount());
		System.out.println(l.getQueueLength());

	}

}
