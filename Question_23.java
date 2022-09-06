package com.numbers;
//What is the value of x1 if x=5 ?   x1=++x – x++ + –x

public class Question_23 {
public static void main(String args[]) {
	int x=5;
     if(x==5)
     {
     	int x1=++x - x++ + --x;
     	System.out.println("value of x1 :"+x1);
     }
}
}
