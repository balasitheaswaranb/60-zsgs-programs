package com.numbers;

import java.util.Arrays;
/*Alternate sorting: Given an array of integers, rearrange the array in such a way that
the first element is first maximum and second element is first minimum.
Example: Input : {1, 2, 3, 4, 5, 6, 7}
Output: {7, 1, 6, 2, 5, 3, 4}
*/

public class Question_10 {
	public static void main(String[] args) {
		int arr[] = new int[] { 1, 2, 3, 4, 5, 6 };
		int n = arr.length;
		System.out.println("Original Array ");
		System.out.println(Arrays.toString(arr));
		int temp[] = arr.clone();
		int small = 0, large = n - 1;
		boolean flag = true;
		for (int i = 0; i < n; i++) {
			if (flag)
				arr[i] = temp[large--];
			else
				arr[i] = temp[small++];

			flag = !flag;
		}

		System.out.println("Modified Array ");
		System.out.println(Arrays.toString(arr));
	}
}
