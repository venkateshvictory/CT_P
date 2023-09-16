package com.real.icrement.logics;

import java.util.Scanner;

public class ArrayDisplay {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 10 array elements");
		int arr[] = new int[10];
		for(int i=0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Array :" );
		for(int j=0;j<arr.length; j++) {
			System.out.println(arr[j]);
		}
	}
}
