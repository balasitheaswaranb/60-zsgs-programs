package com.numbers;

import java.util.Scanner;
//   Write a program to print the alphabet 'C' with the stars based on the given number
public class Question_55 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = scan.nextInt();
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				if (i == 0 || i == num - 1) {
					System.out.print("*");
				} else {
					System.out.print("*");
					j = num;
				}
			}
			System.out.println();
		}
		scan.close();
	}
}
