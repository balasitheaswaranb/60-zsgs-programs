package com.numbers;

import java.util.Scanner;
/* Write a program to give the following output for the given input:
Example 1:  Input: a1b10
Output: abbbbbbbbbb
*/

public class Question_53 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = scan.nextLine();

		for (int j = 0; j < str.length(); j++) {
			char a = str.charAt(j);
			int b = ((int) str.charAt(++j) - 48);

			if (j + 1 >= str.length()) {
				for (int i = 0; i < b; i++)
					System.out.print(a);
				break;
			}

			if (((int) str.charAt(j + 1) - 48) > -1 && ((int) str.charAt(j + 1) - 48) < 10) {
				b = (b * 10) + ((int) str.charAt(++j) - 48);
			}
			// System.out.println(b);
			for (int i = 0; i < b; i++)
				System.out.print(a);
		}
		scan.close();
	}
}
