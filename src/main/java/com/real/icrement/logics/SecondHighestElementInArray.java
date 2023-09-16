package com.real.icrement.logics;

public class SecondHighestElementInArray {

	public static void main(String[] args) {

		int array[] = { 120,124,3545,100,99,76, 45, 56, 86, 46 };
		             //45,76,56,86,46
		             //45,56,76,86,46

		for (int i = 0; i < array.length; i++) {

			for(int j=i+1; j<array.length; j++) {
			int temp;
			if (array[i] > array[j]) {
				temp = array[i];
				array[i] = array[j ];
				array[j] = temp;

			}

		}
		
	}
		for (int arr : array) {
			
			System.out.println(arr);
		}
	System.out.println(array[10-2]);
	System.out.println(array[9]);
	     
		
}}