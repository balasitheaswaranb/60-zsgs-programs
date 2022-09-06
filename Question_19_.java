package com.numbers;
//a+=a++ + ++a + –a + a–; when a=28

public class Question_19_ {
	public static void main(String[] args) {
		int a=28;
		    a+=a++ + ++a + --a + a--;
	        System.out.println("The Output for  a+=a++ + ++a + –a + a– is "+a);
	}
}
