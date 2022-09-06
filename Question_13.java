package com.numbers;

import java.util.Scanner;

// Area of Square
public class Question_13 {
	public static void main(String args[]) {
		int length, area;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the square : ");
		length = sc.nextInt();
		area = length * length;
		System.out.println("Area of the square is : " + area);
		sc.close();
	}
}
