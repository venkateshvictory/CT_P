package com.real.icrement.logics;

public class CompositeNumber {

	//composite number a number which has more than one factor(exc,1,n)
	//eg: 8=2,4=2
	public static void main(String[] args) {
		int n=8;
		int count=0;
		for(int i=1;i<=n; i++) {
			if(n%i==0) 
				count=count+1;
			}
			if(count>3) {
				System.out.println("it is a compositeNumber");
			}	else {
				System.out.println("not a composite number");
			}
			
		}
	}

