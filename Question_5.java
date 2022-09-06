package com.numbers;

import java.util.Scanner;

public class Question_5 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value = ");
		char ch = scan.next().charAt(0);
		for (char i = 65; i <= 90; i++) {
			if (ch == i) {
				for (int j =i - 64; j >= 0; j--) {
					for (int k = 0; k < (int)j; k++) {
						System.out.print(i+" ");
		
					}
					System.out.println();
					i++;
				}
			}scan.close();
		}

	}
}
