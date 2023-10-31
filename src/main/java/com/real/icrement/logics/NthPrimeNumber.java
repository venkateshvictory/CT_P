package com.real.icrement.logics;

import java.util.Scanner;

public class NthPrimeNumber {

	//https://www.geeksforgeeks.org/sql-join-set-1-inner-left-right-and-full-joins/
	public static void nthPrimeNumber(int n) {
		//System.out.println(n);
		  int add =0;
		  int primeNumber =0;
		 
		for(int i=2; i<=n; i++) {
			int count=0;
			for(int j=1; j<=i; j++) {
				if(i%j==0) {
					count++;
				}
				
			}
			//primeNumber=i;
			if(count==2 ) {
				
				System.out.println("the nth prime number is "+ i);
				add=add+1;
//				if()
			}
			
			if(add==n) {
				System.out.println("the nth prime number is " + i);
			}
			
			
		}
		
		//System.out.println(primeNumber);
		System.out.println(add);
		
	
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	
		 int n=sc.nextInt();
		nthPrimeNumber(n);
	}
}

