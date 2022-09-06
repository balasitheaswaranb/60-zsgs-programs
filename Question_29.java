package com.numbers;

import java.util.Scanner;

//  Program to Check Whether a Character is a Vowel or Consonant
public class Question_29 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char c = sc.next().charAt(0);
		c = Character.toLowerCase(c);
		switch (c) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.print("Given character is Vowel");
			break;
		default:
			System.out.println("Given character is Consonant");
			break;
		}
		sc.close();
	}

}
