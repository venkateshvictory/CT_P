package com.real.icrement.logics;

import java.util.Scanner;

import org.springframework.util.FileSystemUtils;

public class SumOfAllOdd {

	public static void main(String[] args) {
		int arr[] = new int [10];
		int arr1[]= {103,44,3};
		
		Scanner sc  = new Scanner(System.in);
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int sum=0;
		for(int j=0;j<arr.length;j++) {
			if(j%2!=0) {
				System.out.println("the odd numbes is" +j);
				sum=sum+j;
			}
			
		}
		System.out.println("the sum of odd numbers is" +sum);
	}
}
