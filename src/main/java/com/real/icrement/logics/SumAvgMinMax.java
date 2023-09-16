package com.real.icrement.logics;

import java.util.Scanner;

public class SumAvgMinMax {

	public static void main(String[] args) {
	int sum =0;
	int max ;
	int min ;
	double average;
	
	/*Scanner sc = new Scanner(System.in);
	System.out.println("Enter 10 array elements");
	int arr[] = new int[10];
	for(int i=0; i<arr.length;i++) 
	{
		arr[i] =sc.nextInt();
	}
	System.out.println("Array");
	max =arr[0];
	min =arr[0];
	for(int j=0; j<arr.length;j++) {
		if(min >arr[j]) {
			min =arr[j];
		}
		if(max<arr[j]) {
			max= arr[j];
		}
		sum+=arr[j];
	}
	average = sum/arr.length;

	System.out.println("sum" +sum);
	System.out.println("min" +min);
	System.out.println("max" +max);
	System.out.println("average :"+ average);
	}*/
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter 10 array elements ");
	int [] arr = new int[10];
	for(int i=0; i<arr.length;i++) {
		arr[i]=sc.nextInt();
	}
	for(int j=0; j<arr.length; j++) {
		sum= sum+arr[j];
	}
	System.out.println("sum of array is "+sum);
	System.out.println("average of sum : =" + sum/arr.length);
	min=arr[0];
	max=arr[0];
	for(int k=0; k<arr.length; k++) {
		   
		if(min>arr[k]) {
			min=arr[k];
		}
		if(max<arr[k]){
			max=arr[k];
		}
	
		
	}
	System.out.println(min);
	System.out.println(max);
	}
}
