package com.real.icrement.logics;

import java.util.Scanner;

public class ArrayReverse {

	public static void main(String[] args) {
		
		int arr[] = new  int[10];
		System.out.println("enter 10 array elements ");
		Scanner sc= new Scanner(System.in);
		
		for(int i=0; i<arr.length;i++) {
	             arr[i]=sc.nextInt();		
		}
		
		System.out.println("array");
		
		for(int j=0; j<arr.length; j++) {
			System.out.println(arr[j]);
		}
		
		System.out.println("\n " + "/n reverse an array elements");
		for(int k=arr.length-1; k>0;k--) {
			System.out.println("reverse an array element is "+arr[k]);
		}
	}
}
