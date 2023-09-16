package com.real.icrement.logics;

import java.util.Scanner;

public class StudentSub {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number of students:");
		
		int n= sc.nextInt();
		int rollNo[] = new int[n];
		int s1[] = new int[n];
		int s2[] = new int[n];
		int s3[] = new int[n];
		double total[] = new double[n];
		double avg[] = new double[n];
		for(int i=0;i<n;i++) {
			System.out.println("enter Student " + (i+1) + "details : ");
			System.out.println("Roll No :");
			rollNo[i] =sc.nextInt();
			System.out.println("Subject 1 Marks : ");
			s1[i]= sc.nextInt();
			System.out.println("Subject 2 Marks : ");
			s2[i]= sc.nextInt();
			System.out.println("Subject 3 Marks : ");
			s3[i]= sc.nextInt();
			total[i] = (s1[i] + s2[i]+ s3[i]);
			avg[i] =total[i]/3.0;
		}
		System.out.println("Roll No \t total \t average");
		for(int i=0; i<n; i++) {  
			System.out.println(rollNo[i] + "\t" + total[i] +  "\t    "  +"\t" + avg[i]);
		}
		
	}
}
