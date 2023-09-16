package com.real.icrement.logics;

public class SquareRoot {

	public static double squareRoot(int number) {

		double temp;
		double sr =number/2;
		do {
			temp=sr;
			sr=(temp+(number/temp))/2;
			
		}while((temp-sr)!=0);
			return sr;
		}
	
	public static void main(String[] args) {
		int n=64;
	double value	=squareRoot(n);
	System.out.println(value);
	}
}
