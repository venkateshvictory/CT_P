package com.real.icrement.logics;

public class ExceptionEx1 {

	public static void badMethod() {
		throw new RuntimeException();
	}
	public static void main(String[] args) {
		try {
			badMethod();
			System.out.println("A");
		}catch(RuntimeException ex) {
			System.out.println("B");
			throw new RuntimeException();
		}
		catch(Exception ex1) {
			System.out.println("C");
		}finally {
			System.out.println("D");
		}
		System.out.println("E");
	}
	
}
