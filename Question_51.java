package com.numbers;
/* Write a program to display the number in reverse order without use of String
functions.
Eg 1:  Input: 12345
Output :The number in reverse order is : 54321 */

public class Question_51 {
	public static void main(String[] args) {
		int a = 12345, reverse = 0;
		System.out.println(a);
		while (a != 0) {
			int remainder = a % 10; // Take a remainder of a%10
			reverse = reverse * 10 + remainder;
			a = a / 10;
		}
		System.out.println("The number in reverse order is : " + reverse);

	}
}
