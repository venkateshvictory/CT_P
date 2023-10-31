package com.real.icrement.logics;

import java.util.Stack;

public class DecimalToBinary {

	public static void main(String[] args) {
		int n=255;
		Stack stack = new Stack();
		
		while(n!=0) {
			int d= n%2;
			stack.push(d);
			n=n/2;
			
		}
		System.out.println("\n binary representation is : ");
		while(!(stack.isEmpty())) {
			System.out.print(stack.pop());
		}
		System.out.println();
	}
}
