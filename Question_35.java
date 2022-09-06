package com.numbers;
import java.util.Scanner;
//  Program to Find Factorial of a Number and the factorial number's sum of digits.

public class Question_35 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number :");
		long n = sc.nextInt(), k = 1, sum = 0;
		for (int i = 1; i <= n; i++) {
			k *= i;
			sum += i;
		}

		System.out.println("Factorial of is num : " + k);
		System.out.println("Sum of is Factorial : " + sum);
		sc.close();
	}
}
