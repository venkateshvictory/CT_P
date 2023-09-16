package com.real.icrement.logics;

import java.util.Scanner;

public class FactorialOfMT0N {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter m: ");
		int m =sc.nextInt();
		System.out.println("Enter n: ");
		int n= sc.nextInt();
		if(m<n && m>0 && n>0) {
			for(int i=m; i<=n; i++) {
				long fact =1;
				for(int j=1;j<=i; j++) {
					fact *=j;
					System.out.println("Factorial of " + i + " = " + fact);
					
				}
			}
			
		}else {
			System.out.println("invalid input");
		}
		
		
	}
}
//4!= 4*3*2*1=24
//3!= 3*2*1=6
//5!= 5*4*3*2*1=120