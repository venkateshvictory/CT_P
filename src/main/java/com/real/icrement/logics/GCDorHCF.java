package com.real.icrement.logics;

public class GCDorHCF {

	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 20;
		while (num1 != num2) {
			if (num1 > num2) {
				num1 = num1 - num2;
			} else {
				num2 = num2 - num1;
			}
		}
		System.out.println(num2);
	}
}
