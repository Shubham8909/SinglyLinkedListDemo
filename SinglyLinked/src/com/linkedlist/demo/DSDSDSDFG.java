package com.linkedlist.demo;

public class DSDSDSDFG extends Object {
	
	public String name;
	
	public DSDSDSDFG(String name){
		this.name= name;
		
		System.out.println("try to make one object");
	}

	@Override
	public boolean equals(Object obj) {
		
		if(this==obj) {
			return true;
		}
		if(obj== null || this.getClass()!=obj.getClass()) {
			return false;
		}
		DSDSDSDFG d= (DSDSDSDFG)obj;
		return this.name==d.name;
	}
	
	

}
