package com.real.icrement.logics;

public class PrimeNumber {

	public static void printPrimeNumber(int n) {
		int count = 0;

		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				count++;
			}
		}
		if(count==2) {
			System.out.println("its a primeNumber");
		}else 
			System.out.println("not a primeNumber");
	}

	public static void main(String[] args) {
		int n = 10;
		printPrimeNumber(n);

	}

}
