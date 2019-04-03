package com.linkedlist.demo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class StundentDemo {

	public static void main(String[] args) {

Studend s= new Studend("Shubham", "Agra1", "AP1", 1, "12015451546");
Studend s1= new Studend("Shubham1", "Agra2", "AP2", 1, "12015451546");
Studend s2= new Studend("Shubham2", "Agra3", "AP3", 1, "12015451546");
Studend s3= new Studend("Shubham3", "Agra4", "AP4", 1, "12015451546");
Studend s4= new Studend("Shubham4", "Agra5", "AP5", 1, "12015451546");
Studend s5= new Studend("Shubham5", "Agra6", "AP6", 1, "12015451546");
Studend s6= new Studend("Shubham2", "Agra3", "AP3", 1, "12015451546");
Studend s7= new Studend("Shubham3", "Agra4", "AP4", 1, "12015451546");
Studend s8= new Studend("Shubham4", "Agra5", "AP5", 1, "12015451546");
Studend s9= new Studend("Shubham5", "Agra6", "AP6", 1, "12015451546");

List<Studend> studentList= new ArrayList<>();
studentList.add(s);
studentList.add(s1);
studentList.add(s2);
studentList.add(s3);
studentList.add(s4);
studentList.add(s5);
studentList.add(s6);
studentList.add(s7);
studentList.add(s8);
studentList.add(s9);

System.out.println(studentList);
System.out.println(studentList.size());

Set<Studend> studentSet= new HashSet<>();
studentSet.addAll(studentList);

System.out.println(studentSet);
System.out.println(studentSet.size());






	}

}
