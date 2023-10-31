package com.real.icrement.logics;

public class BooleanExample {

	public static void main(String[] args) {
		
		int result=0;
		Boolean b1 = new Boolean("TRUE");
		System.out.println("\t " +b1);
		Boolean b2= new Boolean("true");
		System.out.println("\t " + b2);
		Boolean b3 = new Boolean("tRuE");
		System.out.println( "\t" +b3 );
		Boolean b4 = new Boolean("false");
		System.out.println("\t" +b4);
		
		
		if(b1==b2)
			result=1;
		if(b1.equals(b2))
			result =result+10;
		if(b2==b4)
			result =result+100;
		if(b2.equals(b4))
			result =result+1000;
		if(b2.equals(b3))
			result=result+10000;
		System.out.println(result);
		
		
		String s = "ABC";
		s.toLowerCase();
		s=s+"def";
		System.out.println(s);
		
	       String a = "newspaper";
	       System.out.println("at Zero index is "+a.charAt(0));
	       System.out.println("at onenth index "+a.charAt(1));
	       System.out.println("at second index "+a.charAt(2));
	       System.out.println("at third index"+a.charAt(3));
	       System.out.println("at fourth index"+a.charAt(4));
	       System.out.println("at 5th index"+ a.charAt(5));
	       System.out.println("at 6th index"+a.charAt(6));
	       System.out.println("at 7th index"+a.charAt(7));
	       System.out.println("at 8th index"+ a.charAt(8));
	      // a=a.substring(3);
	       System.out.println("the subString is " + a.substring(3));
	       System.out.println("the index char is " +a);
	       
	}
	
}
