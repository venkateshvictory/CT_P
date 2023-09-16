package com.real.icrement.logics;

public class ArthamaticSeries {

	///example 1+2+3+4+5+6...n; 55
	
	/*
	 * public static void main(String[] args) {
	 *  int n=10; int sum=0; 
	 *  for(int i=0;i<=n; i++) {
	 *   sum=sum+i; 
	 *   } System.out.println(sum);
	 *    }
	 */
	
	/*public static void main(String[] args) {
		int n=10;
		int sum=0;
		for(int i=1,a=1;i<=n; i++,a++) {
			sum=sum+a;
		}
		System.out.println(sum);
	}*/
	
// example 9+13+17...n;
	
	/*public static void main(String[] args) {
		int n=33;
		int sum=0;
		for(int i=1,a=9; i<n;i++,a+=4) {  //a=a+4
			sum=sum+a;
		}
		System.out.println(sum);
		
	}*/
	
// example 2+4+6+8....n
	/*public static void main(String[] args) {
		int n=10;
		int sum=0;
		for(int i=1,a=2;i<n;i++,a+=2) {
			sum=sum+a;
		}
		System.out.println(sum);
	}*/
	
	//exmaple 1+3+5+7..n
	//example 10+9+8...1
	
	public static void main(String[] args) {
		int n=10;
		int sum=0;
		for(int i=1,a=10;i<=n;i++,a--) {
			sum=sum+a;
		}
		System.out.println(sum);
		
	}
	
}
