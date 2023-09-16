package com.real.icrement.logics;

public class ThreeDigitPrimeNumbers {

	public static void main(String[] args) {
		int j,r,d;
		for(int i=100;i<=999;i++) {
			r=0;
			for(j=i;j>0;j=j/10) {
				
				d=j%10;
				r=r*10+d;
			}
			if(r==i) {
				System.out.println(i);
			}
		}
	}
}
