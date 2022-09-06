package com.numbers;

import java.util.Scanner;
//   write a program to find the difference between the given number and it's reverse number.

public class Question_3 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number = ");
		int num = scan.nextInt();
		int numRev = 0, num1 = num;
		while (num != 0) {
			int remainder = num % 10;
			numRev = numRev * 10 + remainder;
			num /= 10;
		}
		int sum = num1 + numRev;
		System.out.println(num1 + " + " + numRev + " = " + sum);
		scan.close();
	}
}
