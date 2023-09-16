package com.real.icrement.logics;

public class NeonNumber {
// sum of digits of square of the number is equal to the number
	// eg: 9: 9*9 =81,9 =8+1
	public static void main(String[] args) {
		int n=9;
		int m=n;
		int sum =0;
		n=n*n;
		while(n!=0) {
			int d=n%10;
			sum =sum+d;
			n=n/10;
		}
		if(sum==m) {
			System.out.println("yes");
		}else {
			System.out.println("No");
		}
	}
}
