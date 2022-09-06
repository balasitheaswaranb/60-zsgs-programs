package com.numbers;

import java.util.Scanner;
// Program to Find the Largest Number Among Three Numbers

public class Question_30 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter A value");
		int a = scan.nextInt();
		System.out.println("Enter B value");
		int b = scan.nextInt();
		System.out.println("Enter C value");
		int c = scan.nextInt();
		if (a > b) {
			if (a > c)
				System.out.println("Largest No is A");
			else if (b > c)
				System.out.println("Largest No is B");
			else
				System.out.println("Largest No is C");
		} else if (b > c) {
			if (b > a)
				System.out.println("Largest No is B");
		} else
			System.out.println("Largest No is C");
		scan.close();
	}
}
