package com.numbers;

import java.util.Scanner;
/*  Write a program to find the sum of the series. The series will be like 1 +11 + 111 +
1111 +.. n terms.
Eg 1: Input:  Input the number of terms : 5
Output :
1 + 11 + 111 + 1111 + 11111
The Sum is : 12345  */

public class Question_60 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println(" Input the number of terms : ");
		int n = scan.nextInt();
		int sum = 1,j=1;
		for (int i = 1; i <= n; i++) {
			System.out.print("+"+j);
			sum += j;
			
			j=(j*10)+1;
			
		}
		System.out.println("\nThe Sum is : "+sum);
		scan.close();
	}
}
