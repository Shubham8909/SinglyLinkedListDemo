package com.linkedlist.demo;

/**
 * @author shubham
 *
 */
public class MainThreadDemo {
	
	public static void main(String[] args) throws InterruptedException  {
	//	Display d = new Display();
	//	Display d1 = new Display();
		System.out.println(Thread.currentThread().getPriority());
	//	MyRaunable r= new MyRaunable(d,"Shubham");
	 //   MyRaunable r1= new MyRaunable(d1,"Don");
		//Thread t= new Thread(r);
		MainThread t1= new MainThread();
		//Thread t1= new Thread(r1);
    	t1.start();
    	
    	
    	synchronized (t1) {
    		System.out.println("Main thread start");
    		
    		t1.wait();
    		
    		System.out.println("total ="+ t1.total);
			
		}
     	
	//	t.join();
     	System.out.println("Main thread end");
	}


} 
