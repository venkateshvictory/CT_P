package com.real.icrement.logics;

import java.util.Scanner;

public class LCMandHCF {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m, n, i, min, hcf = 0;
		System.out.println("enter two numbers");
		m = sc.nextInt();
		n = sc.nextInt();
		min = Math.min(m, n);
		System.out.println(min);
		for (i = 1; i < min; i++) {
			if ((m % i == 0) && n % i == 0)
				hcf = i;
		}
		System.out.println("HCF of " + m + "and " + n + " is : " + hcf);
		System.out.println("LCM of " + m + " and " + n + "is: " + ((m * n) / hcf));
	}
}
