package com.real.icrement.logics;

import java.util.Scanner;

public class FindElement {

	public static void main(String[] args) {
		System.out.println();
		int count=0;
		Scanner sc = new Scanner(System.in);
		int x=33;
		int i;
		int arr[] = new int[10];
		for( i=0; i<arr.length;i++) {
		       arr[i]=sc.nextInt();
		}
		for( i=0;i<arr.length;i++) {
			
			if(arr[i]==x) {
				count++;
				break;
			}else {
				count=0;
			}
		}
		if(count==1) {
			System.out.println("element found at position :"+(i+1));
		}
		else {
			System.out.println("not found");
		}
	}
}
