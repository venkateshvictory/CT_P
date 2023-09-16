package com.real.icrement.logics;

import java.util.Scanner;

public class Age {

	public static void main(String[] args) {
		
		System.out.println("enter 10 array elements");
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[10];
		for(int i=0;i<arr.length;i++) {
		   arr[i]=sc.nextInt();
		}
		
		int below18=0;
		int in18And60=0;
		int above60=0;
		
		for(int j=0;j<arr.length;j++) {
			
			if(arr[j]<18) {
				below18=below18+1;
				System.out.println("the below 18 are " +arr[j]);
			}
			if(arr[j]>18 && arr[j]<60) {
				in18And60=in18And60+1;
				System.out.println("the above 18 and 60 are "+ arr[j]);
			}
			if(arr[j]>60) {
				above60=above60+1;
				System.out.println("the above are "+ arr[j]);
			}
		}
		System.out.println(below18);
		System.out.println(above60);
		System.out.println(in18And60);
	}
}
