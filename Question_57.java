package com.numbers;

import java.util.Scanner;
//  Write a program to print the following output for the given input. You can assume the string is of odd length
public class Question_57 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the String : ");
		String str = scan.next();
		if (str.length() % 2 != 0) {
			for (int i = 0; i < str.length(); i++) {
				for (int j = 0; j < str.length(); j++) {
					if ((i == j) || ((i + j) == (str.length() - 1))) {
						System.out.print(str.charAt(j));
					} else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
		} else {
			System.out.println("The string is in even length.");
		}
		scan.close();
	}

}
