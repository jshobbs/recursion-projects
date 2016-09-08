package com.jeffhobbsonline;

import java.util.Scanner;

/**
 * Factorial Using Recursion
 *
 */
public class Factorial 
{
    public static void main( String[] args )
    {
   	 Scanner scanner = new Scanner(System.in);
   	 boolean validInteger = false;

   	 while (!validInteger){
          System.out.print("Enter a non-negative integer : ");
          String integerInput = scanner.nextLine();
          
          try{
         	 int n = Integer.parseInt(integerInput);
         	 
         	 if(n >= 0){
         		 System.out.println("Factorial of " + n + " equals: " + factorial(n));
         		 validInteger = true;
         	 }
          } catch (NumberFormatException e){
         	 System.out.println("Input incorrect " + e.getMessage());
          }
   	 }
   	 
   	 scanner.close();
    }
    
    public static int factorial(int n){
    	if (n == 1)
    		return 1;
    	else
    		return n  * factorial(n-1);
    }
}