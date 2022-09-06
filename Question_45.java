package com.numbers;
//   Java Program to print the sum of all the items of the array
public class Question_45 {
	public static void main(String[] args) {
	    int [] numbers = new int [] {5, 3, 1, 100};
	    int sum =0;
	    for (int i = 0; i < numbers.length; i++)
	    	sum+=numbers[i];
	    System.out.println("sum of all numbers in array = "+sum);
}

}
