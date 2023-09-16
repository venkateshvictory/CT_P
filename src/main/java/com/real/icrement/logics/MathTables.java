package com.real.icrement.logics;

import java.util.Scanner;

public class MathTables {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1; i<=20; i++) {
			System.out.println(n +" X " + i + "=" + n*i);
		}
	}
}
