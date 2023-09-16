package com.real.icrement.logics;

public class SubIndexOfEx{

	/*public static String reverse(String s) {
		int x= s.indexOf(" ");
		if(x == -1) 
			return s;
		
		return reverse(s.substring(x+1) + " " + s.substring(0, x));
		
	}
	public static void main(String[] args) {
		String str ="I am good";
		String rev = reverse(str);
		System.out.println("Reversed sentence: "+rev);
	}*/
	
	public static void main(String[] args) {
	
		char ch[] = {'c','b','d'};
		
		String s= "telugu web guru";
		System.out.println(s.substring(7));
	     System.out.println(s.indexOf("u",13));  // indexOf(String str,int fromIndex);int-string
	     System.out.println(s.indexOf("w")); //indexOf(String str);int-string
	    
	    System.out.println(s.lastIndexOf("g"));
	     
		
	
	
	}
}
