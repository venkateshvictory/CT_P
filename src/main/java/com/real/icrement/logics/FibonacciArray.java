package com.real.icrement.logics;

public class FibonacciArray {

	public static void main(String[] args) {
		
		int [] arr= new int[30];
		arr[0]=1;
		arr[1]=1;
		
		for(int i=2;i<arr.length;i++) {
			arr[i]=arr[i-1]+arr[i-2];
		}
		for(int a : arr ) {
			System.out.println(a);
		}
		
		System.out.println("fflore");
		///for
	    int first=1;
		int second=1;
		int third=0;
		for(int i=2;i<=10;i++) {
	         	third=first+second;
	         	first=second;
	         	second=third;
	         	System.out.println(third);
		}

		
	}
}
