package com.real.icrement.logics;

public class ArthamaticBitmoreHigh {

	//exmaple x^1+x^2+x^3...n
	/*public static void main(String[] args) {
		
		int n=10;
		double sum=0;
		double x=2;
		for(int i=1,a=1; i<n; i++,a++) {
			
			sum=sum+Math.pow(x, a);
		}
		System.out.println(sum);
	}
	*/
	//example 9^2+13^2+17^2
	/*public static void main(String[] args) {
		
		int n=10;
		double sum=0;
		for(int i=1,a=9;i<=n; i++,a+=4) { //a=a+4
			sum =sum+Math.pow(9, 2);
		}
		System.out.println(sum);
	}*/
	
	// 1^3/x,3^3/x+5^3/x...n
	/*public static void main(String[] args) {
		
	int n=10;
	double sum=0;
	int x=1;
	for(int i=1,a=1;i<=n;i++,a+=2) {
		
		sum=sum+Math.pow(a, 3)/x;
	}
	System.out.println(sum);
	}*/
	
	//example 2/10+4/10+6/8+8/7
	public static void main(String[] args) {
		int n=10;
		double sum=0;
		for(int i=1,a=2,d=10;i<=n;i++,a+=2,d--) {
		
			sum=sum+a/d;
		}
		System.out.println(sum);
	}
}
