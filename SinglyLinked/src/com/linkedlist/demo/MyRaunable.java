package com.linkedlist.demo;

public class MyRaunable implements Runnable {
	
	Display d;
	String name;
	
	public MyRaunable(Display d, String name) {
		this.d = d;
		this.name = name;
	}
	@Override
	public void run() 
	{
		try {
			d.wish(name);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		}
	}


