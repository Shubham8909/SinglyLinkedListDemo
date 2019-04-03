package com.linkedlist.demo;

public final class Example{

@Override
	public String toString() {
		return "Example --> number=" + number + ", employe=" + employe + "<--";
	}

private final int number;
 private final Employe employe;
 
public Example(int number, Employe employe) {
	super();
	this.number = number;
	this.employe = employe;
}
 
public int getNumber() {
	return number;
}

public Employe getEmploye() {
	return new Employe(employe.getId(),employe.getName());
	//return employe;
}
 
 
}