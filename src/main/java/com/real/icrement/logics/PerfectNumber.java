package com.real.icrement.logics;

public class PerfectNumber {

	// the sum of its positive divisiors excluding the number itself is equal to that number
	// example ,28 is a perfect number because ,28 is divisible by 1,2,4,7,14 and 28 and the sum of these values is
	//1+2+4+7+14
	public static void main(String[] args) {
		int n=28;
		int sum=0;
		for(int i=1;i<n;i++) {
			if(n%i==0) {
				sum=sum+i;
			}
		}
		if(sum==n) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
	}

}
