package com.numbers;

import java.util.Scanner;
/*  Given two sorted arrays, merge them such that the elements are not repeated
Example 1:
Input: Array 1: 2,4,5,6,7,9,10,13
         Array 2: 2,3,4,5,6,7,8,9,11,15
Output: Merged array: 2,3,4,5,6,7,8,9,10,11,13,15   */

public class Question_9 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of array one:");
		int arrayOneSize = scan.nextInt();
		System.out.println("Enter the size of array two:");
		int arrayTwoSize = scan.nextInt();
		int mergedArray[] = new int[arrayOneSize + arrayTwoSize];
		int mergedArrayTemp[] = new int[arrayOneSize + arrayTwoSize];
		int FinalmergedArray[] = new int[arrayOneSize + arrayTwoSize];
		System.out.println("Enter the elements of array one:");
		for (int i = 0; i < arrayOneSize; i++) {
			mergedArray[i] = scan.nextInt();
			mergedArrayTemp[i] = mergedArray[i];
		}

		System.out.println("Enter the elements of array two:");
		for (int i = arrayOneSize; i < arrayOneSize + arrayTwoSize; i++) {
			mergedArray[i] = scan.nextInt();
			mergedArrayTemp[i] = mergedArray[i];
		}

		for (int i = 0; i < (arrayOneSize + arrayTwoSize) - 1; i++) {
			for (int j = i + 1; j < (arrayOneSize + arrayTwoSize); j++) {
				if (mergedArrayTemp[i] == mergedArrayTemp[j]) {
					mergedArrayTemp[j] = -100;
				}
			}
		}

		System.out.println("Final merged array without duplicate:");
		int finalArrayIteration = 0;
		for (int i = 0; i < arrayOneSize + arrayTwoSize; i++) {
			if (mergedArray[i] == mergedArrayTemp[i]) {
				FinalmergedArray[finalArrayIteration] = mergedArray[i];
				finalArrayIteration++;
				System.out.print(mergedArray[i]);
			}
		}
		scan.close();
	}
}
