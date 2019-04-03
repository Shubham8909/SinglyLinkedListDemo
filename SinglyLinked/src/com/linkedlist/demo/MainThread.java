
package com.linkedlist.demo;

/**
 * @author shubham
 *
 */
public class MainThread extends Thread {
	
	int total= 0;
/*	
	Display d;
	String name;
	
	public MainThread(Display d, String name) {
		this.d = d;
		this.name = name;
	}
	*/
	public void run() {
		
	synchronized (this) {
		System.out.println("child thread starts");
		
	for(int i=1; i<=100; i++)	{
		
		total = total +i;
	}
	System.out.println("child thread is giving notify");
	this.notify();
	}

	}

}
