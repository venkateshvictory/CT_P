package com.real.icrement.logics;

public class GCD {

	// 30 and 45 is 15
	public static void main(String[] args) {
		int num1=30;
		int num2=45;
		int gcd=1;
		for(int i=1; i<=num1&& i<=num2;i++) {
			if(num1%i==0 && num2%i==0) {
				gcd=i;
			}
			
		}
		System.out.println("GCD of "+num1+ "and " +num2+" is "+gcd);
	}
}
