package com.real.icrement.logics;

public class Loop {

	public static void main(String[] args) {
		for(int x=0; x<10; x++) {
			if(x%2==0) {
				System.out.println("even");
			}
			else {
				continue;
			}
		}
	}
}
