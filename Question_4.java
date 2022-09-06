package com.numbers;
//   Bitwise operators
public class Question_4 {
	public static void main(String args[]) {
		int x = 9, y = 8;
		/*
		 * bitwise and (&) x = 9, y = 8; 1001 & 1000 = 1000 = 8
		 */
		System.out.println("x & y = " + (x & y));
		/*
		 * bitwise exclusive or (^) x = 9, y = 8; 1001 ^ 1000 = 0001 = 1
		 */
		System.out.println("x ^ y = " + (x ^ y));
		/*
		 * bitwise inclusive or (|) x = 9, y = 8; 1001 | 1000 = 1001 = 9
		 */
		System.out.println("x | y = " + (x | y));
		/*
		 * bitwise Compliment (~) x = 9 -(x+1) 1001 = 0110 = = -10
		 */
		System.out.println("~x = " + (~x));
		int z = 80;
		/*
		 * Signed rigth shift operator (>>) b = a>>n b = a/(2^n) = 80/2^2= 20
		 */
		System.out.println("z>>2 = " + (z >> 2));

		/*
		 * Signed left shift operator (<<) b = a<<n b = a*(2^n) = 80*2^2= 320
		 */
		System.out.println("z<<2 = " + (z << 2));
		/*
		 * Unsigned Right shift operator (>>>)
		 * z=1010000 z >>>n = 0010100 = 20
		 */
		System.out.println("z>>>2 = " + (z >>> 2));
	}
}
