package com.linkedlist.demo;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import javax.print.attribute.HashDocAttributeSet;

public class CodingInterview {
	
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc= new Scanner(System.in);
		System.out.println(" Enter Name which you want reverse");
		String str = sc.nextLine();
		String str1 = sc.nextLine();
		
		System.out.println("reverse---"+ str.substring(1));
		
	/*	char [] ch= str.toCharArray();
		System.out.println( ch.length);
		
		for(int i= 0; i<ch.length; i++) {
			System.out.print(ch[ch.length-1-i]);
		}*/
		
	/*	
		StringBuffer sbf= new StringBuffer();
		sbf=sbf.append(str);
		sbf=sbf.reverse();
		System.out.print(sbf);*/
		
		/*for(int i=1; i<=str.length(); i++)
		{
			System.out.print(str.charAt(str.length()-i));
		}*/
		
	/*	String [] s= str.split(" ");
		
		for(int i =0; i< s.length; i++) {
			
			
			System.out.print(s[s.length-1-i]);
			System.out.print(" ");
			
		}*/
		
		
		//!<!---------recursive----------!>
		
/*
		String myStr = "Guru99";
		//create Method and pass and input parameter string 
		String reversed = reverseString(myStr);
		
		
		System.out.println("The reversed string is: " + reversed);*/
		
	
 
 
/*	//Method take string parameter and check string is empty or not
	public static String reverseString(String myStr)
	{
		if (myStr.isEmpty()){
		 System.out.println("String in now Empty");	
		 return myStr;
		}
		//Calling Function Recursively
		System.out.println("String to be passed in Recursive Function: "+myStr.substring(1)+"---"+myStr.charAt(0));
		return reverseString(myStr.substring(1)) + myStr.charAt(0);
	
		
	}*/
		Map<Character, Integer> map;
		
		map= new HashMap<Character, Integer>();
		
for( int i =0; i<str.length(); i++) {
	
	if(map.containsKey(str.charAt(i))) {
		int count = map.get(str.charAt(i));
		map.put(str.charAt(i), count+1);
	}
	else 
		{
		map.put(str.charAt(i), 1);
		}
	}

System.out.println(map);
}

 
}

