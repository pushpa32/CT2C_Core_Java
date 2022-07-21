package com.tns.java.Multithreading;

//Multithreading with Runnable Interface
class MyThread implements Runnable {

	public void run() {
		System.out.println("Running Thread");
	}
}

public class ThreadDemo {

	public static void main(String[] args) {
		// create an object for MyThread class
		MyThread mt = new MyThread();

		// create new thread from thread class to start the thread
		Thread t = new Thread(mt);
		t.start(); // starting the thread
	}

}
