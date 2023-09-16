package com.real.icrement.logics;

public class SpyNumber {

	// a Spy number is a number which has sum its digits equals the product of the digits
	//ex: 123: 1+2+3 =1*2*3
	public static void main(String[] args) {
		
		int n=123;
		int m=n;
		int sum=0, prod=1;
		while(n!=0) {
			int d=n%10;
			sum =sum+d;
			prod=prod*d;
			n=n/10;
			
		}
		if(sum==prod) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
	}
}
