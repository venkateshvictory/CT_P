package com.real.icrement.logics;

public class Strings {

	public static void main(String[] args) {
		
		
		String a ="newspaper";
		a=a.substring(5,7);
	
		System.out.println(a);
		char b =a.charAt(1);
		System.out.println(b);
		a=a+b;
		System.out.println(a);
		
		 String Str = new String("Welcome to geeksforgeeks");
		 
	        // using substring() to extract substring
	        // returns (whiteSpace)geeksforgeeks
	 
	        System.out.print("The extracted substring is :");
	        System.out.println(Str.substring(9,14));
	}
}
