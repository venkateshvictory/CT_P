package com.real.icrement.logics;

public class KNSpecialNumber {
// a special number is a number whose sum of factorial of digits is equal to the number
	// eg: 145 =1!+4!+5!
	// 4!=24
	// 5!=120
	// 1!=1
	public static void main(String[] args) {

		int n = 145;
		int m = n;
		int sum = 0;
		while (n != 0) {
			int d = n % 10;
			int fact = 1;
			for (int i = 1; i <= d; i++) {
				fact = fact * i;

			}
			sum = sum + fact;
			n = n / 10;
		}
		if (sum == m) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
	
	
	}

	}

