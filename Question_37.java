package com.numbers;
//   Java Program to print the elements of an array present on odd position

public class Question_37 {
	 public static void main(String[] args) {
		    int [] numbers = new int [] {5, 12, 16, 3, 9, 7, 1, 100};
		    System.out.println("Array Elements on even Positions: ");
		    for (int i = 0; i < numbers.length; i = i+2) {
		      System.out.println(numbers[i]);
		    }
}

}
