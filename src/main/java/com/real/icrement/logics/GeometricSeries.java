package com.real.icrement.logics;

public class GeometricSeries {

	/*
	 * public static void main(String[] args) { //2+4+8+16 ...n
	 * 
	 * int n=5; int sum=0; for(int i=1,k=2;i<=n;i++,k*=2) { sum=sum+k; }
	 * System.err.println(sum); }
	 */

	// 10+30+90+270
	/*
	 * public static void main(String[] args) { int n=5; int sum=0; for(int
	 * i=1,k=10;i<=n;i++,k*=3) { sum=sum+k; } System.err.println(sum); }
	 */

	// 5+25+125+...n
	/*
	 * public static void main(String[] args) { int n=5; int sum=0; for(int
	 * i=1,k=5;i<=n; i++,k*=5) { sum=sum+k; } System.out.println(sum); }
	 */

	// x/2+ x/4+x/8+x/16
	/*public static void main(String[] args) {

		int n = 5;
		int sum = 0;
		int x = 1;
		for (int i = 1, k = 2; i <= n; i++, k += 2) {
			sum = sum + (x / k);
		}
	}*/
	
	//2-6+18-54...n
	/*
	 * public static void main(String[] args) {
	 * 
	 * 
	 * int sum=0; int n=5; for(int i=1,k=2;i<=n;i++,k*=3) { if(i%2==0) sum=sum-k;
	 * else sum=sum+k;
	 * 
	 * } System.out.println("sum:"+sum); }
	 */
	/*public static void main(String[] args) {
		
		//x+2/10+x+4/30+x=6/90
		int sum=0;
		int n=5;
		int x=3;
		for(int i=1,a=2,k=2;i<=n;i++,a+=2,k*=3) {
			
				sum=sum+(x+a)/k;
			
		}
		System.out.println("sum:"+sum);
		}
		*/
}
