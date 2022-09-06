package com.numbers;

import java.util.Scanner;
/*Write a program to evaluate the polynomial equation
 */
public class Question_16 {
	public static void main(String[] args) {
        double a,b,c;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the values of a b and c");
        a=scan.nextDouble();
        b=scan.nextDouble();
        c=scan.nextDouble();
       findingRoots fr = new findingRoots(); 
       fr.calValue(a, b, c); 
       scan.close();
    }  
}

class findingRoots
{ 
    void calValue(double a, double b, double c) 
    { 
        double dis;
        double root;
     if (a == 0) 
     { 
        System.out.println("It is not in quadratic form"); 
        return; 
     } 
   
      dis= Math.pow(b,2.0) - 4*a*c; 
      root = Math.sqrt(Math.abs(dis)); 
   
     if (dis > 0) 
     { 
        System.out.println("The roots of a given quadratic equation are real and different"); 
        System.out.print("Values of roots : ");
        System.out.println((double)(-b + root) / (2 * a) + ", " 
                            + (double)(-b - root) / (2 * a)); 
     } 
     else // dis < 0 
     { 
        System.out.println("The roots of a given quadratic equation are complex \n"); 
        System.out.print("Values of roots:");
        System.out.println( -(double)b / ( 2 * a ) + " + i" 
                          + root + ", "  + -(double)b / ( 2 * a ) 
                          + " - i" + root); 
     }

    }

}
