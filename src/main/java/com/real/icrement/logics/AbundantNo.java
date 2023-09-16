package com.real.icrement.logics;

public class AbundantNo {
// sum of factor is greater then the number itself
	//eg: 12 factors: 1,2,3,4,6=16>12
	public static void main(String[] args) {
		int n=12;
		int sum=0;
		for(int i=1;i<n; i++) {
			if(n%i==0) {
				sum=sum+i;
			}
		}
		if(sum>n) {
			System.out.println("yes");
		}else {
			System.out.println("no"
					+ "");
		}
	}
}
