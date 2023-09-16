package com.real.icrement.logics;

public class PalindromeExample {
// if reverse a number is same as reverse also
	public static void main(String[] args) {

		int n=454;
		int reverse=0;
		int temp=n;
		while(n>0) {
			
			int remainder = n%10;
			reverse= reverse*10+remainder;
			 n=n/10;
			
		}
		if(temp==reverse) {
			System.out.println("its a palindrom");
		}else
		{
			System.out.println("its not a palindrom");
		}
	}
}
