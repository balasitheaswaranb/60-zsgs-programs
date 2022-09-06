package com.numbers;

import java.util.Scanner;
//Write a program to print a letters from the user input character to 'Z' without using strings

public class Question_2 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the character = ");
		char ch = scan.next().charAt(0);
		for (char i = 'A'; i <= 'Z'; i++) {
			if (ch <= i) {
				System.out.print(i + " ");
			}
		}
		scan.close();
	}
}
