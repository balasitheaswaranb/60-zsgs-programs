package com.numbers;

import java.util.Scanner;
/*   Find if a String2 is substring of String1. If it is, return the index of the first
occurrence. else return -1.
Eg 1: Input: String 1: test123string
          String 2: 123
         Output: 4
Eg 2:  Input: String 1: testing12
         String 2: 1234
         Output: -1 */

public class Question_59 {

	public static int substring(String str, String Substr) {
		if (str.contains(Substr)) {
			char fullstring[] = str.toCharArray();
			char sub[] = Substr.toCharArray();
			for (int i = 0; i < fullstring.length; i++) {
				if (sub[0] == fullstring[i])
					return i;
			}
		}
		return -1;

	}

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the String : ");
		String str = scan.nextLine();
		System.out.print("Enter the String : ");
		String substr = scan.next();

		System.out.println(Question_59.substring(str, substr));
		scan.close();

	}
}
