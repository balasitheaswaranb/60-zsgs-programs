package com.numbers;

import java.util.Scanner;

/* Write a single program to generate a multiplicaiton and subtraction table for a given
number.
*/
public class Question_1 {
	void multiplication(int n) {
		System.out.println("\nMultiplication table");
		for (int i = 1; i <= 10; i++) {
			int mul = i * n;
			System.out.println(i + " * " + n + " = " + mul);
		}
	}

	void subraction(int m) {
		System.out.println("\nSubraction table");
		for (int j = 1; j <= 10; j++) {
			int sub = j - m;
			System.out.println(j + " - " + m + " = " + sub);
		}
	}

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the table number = ");
		int input = scan.nextInt();
		Question_1 q1 = new Question_1();
		q1.multiplication(input);
		q1.subraction(input);
		scan.close();
	}

}
