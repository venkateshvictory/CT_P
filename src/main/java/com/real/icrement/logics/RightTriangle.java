package com.real.icrement.logics;

public class RightTriangle {

	public static void main(String[] args) {
		int n=6;
		for(int i=0; i<6; i++) {
			for(int j=i; j<n; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
