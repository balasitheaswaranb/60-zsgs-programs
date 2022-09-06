package com.numbers;

public class Question_21 {
	// If int y = 10 then find int z = (++y * (y++ + 5))
	public static void main(String args[]) {
		 int y=10;
		 if(y==10) {
		 int z= ++y * (y++ + 5);
	     System.out.printf("Output of z=++y1 *(y++ + 5) is :"+z);
		 }
}
}