package com.jeffhobbsonline;

/**
 * Fibonacci recursion
 *
 */
public class Fibonacci 
{
    public static void main( String[] args )
    {
        int fib = fibonacci_calc(6);
        System.out.println(fib);
    }
    
    public static int fibonacci_calc(int fib_rec){
    	if (fib_rec == 0)
    		return 0;
    	if (fib_rec == 1)
    		return 1;
    	return fibonacci_calc(fib_rec-1) + fibonacci_calc(fib_rec-2);
    }
}
