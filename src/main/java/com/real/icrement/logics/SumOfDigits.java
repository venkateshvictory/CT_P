package com.real.icrement.logics;

public class SumOfDigits {

	
	public static void main(String[] args) {
		
		int n=225;
		int sum=0;
		int count=0;
		while(n>0) {
			
			int remainder=n%10;
			 sum = remainder+sum;
			 count=count+1;
			 n=n/10;
		}
		System.out.println(sum);
		System.out.println(count);
	}
}
