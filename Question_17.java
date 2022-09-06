package com.numbers;

import java.util.Scanner;

public class Question_17 {
	// find area between the
	// two given concentric circles
	static double calculateArea(int x, int y) {
		double pi = 3.1415926536;
		double aox = pi * x * x;
		double aiy = pi * y * y;
		return aox - aiy;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the values of x anad y");
		int x = scan.nextInt();
		int y = scan.nextInt();
		System.out.println(calculateArea(x, y));
		scan.close();
	}
}
