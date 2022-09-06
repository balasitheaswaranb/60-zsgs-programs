package com.numbers;
//   Java Program to print the smallest element in an array
public class Question_39 {
	public static void main(String[] args) {
		int[] arr = new int[] { 1, 113, 257, 758, 56 };
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < max)
				max = arr[i];
		}
		System.out.println("smallest element present in given array: " + max);
	}

}
