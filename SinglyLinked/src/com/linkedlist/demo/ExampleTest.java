package com.linkedlist.demo;

public class ExampleTest {
	
	

	public static void main(String[] args) {
		Employe em1 = new Employe(1, "Shubham");
		Employe em2 = new Employe(2, "Divyansh");
		Employe em3 = new Employe(3, "Aushu");
		
		
		
		Example e1= new Example(1, em1);
		Example e2= new Example(2, em2);
		Example e3= new Example(3, em3);
		
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
		
		e1.getEmploye().setId(5);
		e1.getEmploye().setName("CHUCU");
		System.out.println(e1);
	
	}

}
