package com.numbers;

import java.util.Scanner;
//  Program to Calculate the Sum of Natural Numbers and find the largest digit of the sum.
public class Question_34 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		/*
		 * Formula to find sum of n natural number n*(n+1)/2 natural number starts from
		 * 1 to infinity and only positive integer
		 */
		int NN = n * (n + 1) / 2;
		System.out.print("Sum of %d natural number is : " + NN);
		sc.close();
	}

}
