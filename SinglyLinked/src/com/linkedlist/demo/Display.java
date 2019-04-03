package com.linkedlist.demo;

/**
 * @author shubham
 *
 */
public class Display {
	
	
	/**
	 * @param name
	 * @throws InterruptedException
	 */
	public void  wish(String name) throws InterruptedException {
	 
		Display d= new Display();
	synchronized (d) {
		for(int i=1; i<=10; i++) {
			System.out.print("Good Morning :");
			Thread.sleep(1000);
			System.out.println(name);
		}
		
	}
		
	}
	
/*	public  static synchronized  void  wish1(String name) throws InterruptedException {
		
		for(int i=1; i<=10; i++) {
			System.out.print("Good Morning :");
			Thread.sleep(1000);
			System.out.println(name);
		}
		
	}*/


}
