package com.numbers;

public class Question_18 {
	public static void main(String[] args) {
		int a1 = 100;
		int a2 = 190;
		// ++a1-a2–
		// int n1=(++a1-a2--);
		System.out.println("The output for ++a1-a2-- is " + (++a1 - a2--));
		// a%b++
		System.out.println("The Output for a%b++ is " + a1 % a2++); // PEDMAS
		// a*=b+5
		System.out.printf("The Output for  a*=b+5 %d ", +(a1 *= a2 + 5)); // PEDMAS
		// x=69>>>2
		System.out.println("The Output for  x=69>>>2 is " + (a1 = 69 >>> 2));
	}
}
