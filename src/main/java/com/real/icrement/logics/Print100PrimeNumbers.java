package com.real.icrement.logics;

public class Print100PrimeNumbers {

	public static void printPrime(int n) {
		for (int i = 2; i <= n; i++) {
			int count = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					count++;
				}
			}
			if (count == 2) {
				System.out.println(i);
			}
		}
		
	}

	public static void main(String[] args) {
		int n = 100;
       
        printPrime(n);
	}
}
