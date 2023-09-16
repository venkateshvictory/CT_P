package com.real.icrement.logics;

import java.util.Scanner;

public class PrintEvenNumbers {

	public static void main(String[] args) {
		System.out.println("enter 10 array elements");
		Scanner sc = new Scanner(System.in);
		int[] arr =new int[10];
		for(int i=0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		for(int j=0;j<arr.length;j++) {
			if(j%2==0) {
				System.out.println("the even number is "+j);
			}
		}
	}
}
