package com.numbers;
//  Java Program to print the duplicate elements of an array

public class Question_44 {

	public static void main(String[] args) {
		int[] arr = new int[] { 1, 4, 2, 7, 8, 8, 3, 7, 3, 6, 2 };
		System.out.println("Duplicate elements in given array: ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j])
					System.out.println(arr[j]);
			}
		}
	}
}
