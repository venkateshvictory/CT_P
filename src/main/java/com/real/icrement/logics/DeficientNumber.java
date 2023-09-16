package com.real.icrement.logics;

public class DeficientNumber {

	//deficient number: sum of factors is less than the number itself eg: 21. factors 1,3,7 = 11<21
	public static void main(String[] args) {
		int n=21;
		int sum=0;
		for(int i=1;i<n; i++) {
			if(n%i==0) {
				sum=sum+i;
			}
		}
		if(sum<n) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
	}
}
