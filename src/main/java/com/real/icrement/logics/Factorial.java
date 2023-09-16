package com.real.icrement.logics;

public class Factorial {

	// n(n-1)
	// 5! =1x2x3x4x5

	/*
	 * public static int factorial(int n){
	 * 
	 * if(n==0) {
	 *  return 1; 
	 *  }else {
	 *   return (n*factorial(n-1)); 
	 *   }
	 * 
	 * }
	 * 
	 * public static void main(String[] args) { int n=5;
	 * System.out.println(factorial(n)); }
	 */
	
	
	public static void main(String[] args) {
		
		int n=5;
		int fact =1;
		for(int i=1;i<=n; i++) {
			fact =fact*i;
		}
		System.out.println(fact);
	}
}
