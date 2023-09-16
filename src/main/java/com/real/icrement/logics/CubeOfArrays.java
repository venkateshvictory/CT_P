package com.real.icrement.logics;

import java.util.Scanner;

public class CubeOfArrays {

	public static void main(String[] args) {
		
		int arr[] = new int[10];
		System.out.println("enter array of 5 elements");
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println("cube of arrays");
		for(int j=0;j<arr.length;j++) {
			 arr[j]=arr[j]*arr[j]*arr[j];
			System.out.println(arr[j]);
		}
	}
}
