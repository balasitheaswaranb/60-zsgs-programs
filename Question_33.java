package com.numbers;
  //  Program to Check Whether a Character is an Alphabet or not

public class Question_33 {
	public static void main(String[] args) {
		char c = '*';
		if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))
			System.out.println(c + " is an alphabet.");
		else
			System.out.println(c + " is not an alphabet.");
	}
}
