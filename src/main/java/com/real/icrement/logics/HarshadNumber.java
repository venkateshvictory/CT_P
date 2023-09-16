package com.real.icrement.logics;

public class HarshadNumber {

	public static void main(String[] args) {
		int n=156;
		int m=n;
		int sum =0;
		while(n!=0) {
			int d=n%10;
			sum=sum+d;
			n=n/10;
		}
		if(m%sum==0)
		{System.out.println("yes");
		}else {
			System.out.println("NO");
		}
	}
}
