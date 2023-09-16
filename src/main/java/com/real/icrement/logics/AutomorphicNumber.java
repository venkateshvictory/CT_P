package com.real.icrement.logics;

import ch.qos.logback.core.recovery.ResilientSyslogOutputStream;

// number is a number which is contained in the last digit of its square eg: 25 in 625
public class AutomorphicNumber {

	/*
	 * public static void main(String[] args) { int n = 625; int flag = 0; int q = n
	 * * n; while (n != 0) { int d = n % 10; int d1 = q % 10; if (d != d1) { flag =
	 * 1; } n = n / 10; q = q / 10; }
	 * 
	 * if (flag == 0) System.out.println("yes"); else System.out.println("no"); }
	 */
	
	public static void main(String[] args) {
		int n=625;
		int m=n*n;
		int flag=0;
		for(int i=1; i<=n; i++) {
			
			int r=n%10;
			int r1=m%10;
			if(r1 != r) {
				flag=1;
			}
			n=n/10;
			m=m/10;
			   
		}
		if(flag==0) {
			System.out.println("yes");
		}else {
		System.out.println("no");
		}
	}

}
