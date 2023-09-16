package com.real.icrement.logics;

public class SpecialNumber {
// a special number is a number whose sum of digits plus product of digits it is equal to orignal number e.g
	// for eg; 59=5+9+(5*9)=59
	public static void main(String[] args) {
		
		
		int n=59;
		int m=n;
		int sum =0,prod=1;
		while(n!=0) {
			int d=n%10;
			sum=sum+d;
			prod=prod*d;
			n=n/10;
		}
		if(sum+prod==m) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
	}
}
