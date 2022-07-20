//Create a thread using thread class- second technique

package com.tns.java;

class ChildThread extends Thread {

	// thread run method
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("This is child thread");
			Thread.yield(); // passes the execution control to the main thread
		}

		System.out.println("Running Thread");
	}
}

public class ThreadLifeCycle {

	public static void main(String[] args) {

		// create an object for ChildThread class
		ChildThread t = new ChildThread();
		t.start(); // starting the thread

		for (int i = 0; i < 10; i++)
			System.out.println("This is child thread");

	}

}
