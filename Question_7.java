package com.numbers;

public class Question_7 {
	public static void main(String[] args) {

		String str = "1234567";
		int len = str.length();
		for (int i = 0; i < len; i++) {
			int j = len - 1 - i;
			for (int k = 0; k < len; k++) {
				if (k == i)
					System.out.print(str.charAt(k));
				else if (k == j)
					System.out.print(str.charAt(i));
				else
					System.out.print(" ");
			}
			System.out.println("");
		}
	}
}
