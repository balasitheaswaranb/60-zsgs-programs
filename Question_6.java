package com.numbers;

import java.util.Scanner;

public class Question_6 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number = ");
		int n = scan.nextInt();
		int total = n + 101;
		System.out.println("group 1");
		for (int i = 101; i < total; i = i + 4) {
			System.out.println(i);
		}
		System.out.println("group 2");
		for (int j = 102; j < total; j = j + 4) {
			System.out.println(j);
		}
		System.out.println("group 3");
		for (int k = 103; k < total; k = k + 4) {
			System.out.println(k);
		}
		System.out.println("group 4");
		for (int l = 104; l < total; l = l + 4) {
			System.out.println(l);
		}
		scan.close();
	}
}
