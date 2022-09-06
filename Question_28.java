package com.numbers;

import java.util.Scanner;

//  Program to Check Whether a Number is Even or Odd
public class Question_28 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = scan.nextInt();
		if (num % 2 == 0)
			System.out.println(num + " is even");
		else
			System.out.println(num + " is odd");
		scan.close();
	}
}
