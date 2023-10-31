package com.real.icrement.logics;

public class SEcondHighestElementINarra {

	public static void main(String[] args) {
		
		int array[] = {12,34,52,5,66,55};
		
		for(int i=0; i<=array.length; i++) {
			
			for(int j=0; j<array.length-1; j++)
			if(array[i] <array[j]) {
				
				array[i]=array[i];
				
			}
			
		}
		
		System.out.println(array);
	}
}
