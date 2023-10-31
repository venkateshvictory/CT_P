package com.real.icrement.logics;

public class DuckNumber {

	// a number which is a number which has zeros present in it eg.402,280

	public static void main(String[] args) {

		int n = 402;
		int m = n;
		int count = 0;
		while (n != 0) {
			int d = n % 10;
			if (d == 0) {
				count++;
				
			}
			n = n / 10;
		}
		if (count > 0) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
	}
}
