package com.real.icrement.logics;

public class ReveseAnInteger {

	public int reverseNumber(int n) {

		int reverse = 0;
		for (int i = 0; i <= n; i++) {

			int remainder = n % 10;
			reverse = reverse * 10 + remainder;
			n = n / 10;
		}
		//System.out.println(reverse);
		return reverse;
	}

	public static void main(String[] args) {

		int n = 124;

		ReveseAnInteger math = new ReveseAnInteger();
		int values=math.reverseNumber(n);
		System.out.println(values);

	}
}
