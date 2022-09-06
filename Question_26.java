package com.numbers;
// Program to Demonstrate the Working of Keyword long

public class Question_26 {
	public static void main(String...k)  
	{  
	long min=-9223372036854775808L;  
	        long max=9223372036854775807L;  
	        System.out.println("min: "+min);  
	        System.out.println("max: "+max);  
	}  
}
/*The long contains minimum value of -263 and a maximum value of 263-1.
From Java 8, the long can represent as an unsigned 64-bit long, which has a minimum value of 0 and a maximum value of 264-1
Its default value is 0L.
Its default size is 8 byte.
It is used when you need a higher range integer value. */