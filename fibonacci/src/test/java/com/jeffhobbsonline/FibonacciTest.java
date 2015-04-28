package com.jeffhobbsonline;

import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class FibonacciTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public FibonacciTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( FibonacciTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testZero()
    {
    	Assert.assertEquals(0, Fibonacci.fibonacci_calc(0));
    }
    public void testTwo()
    {
    	Assert.assertEquals(1, Fibonacci.fibonacci_calc(2));
    } 
    public void testSix()
    {
        Assert.assertEquals(8, Fibonacci.fibonacci_calc(6));
    } 
    public void testSeven()
    {
    	Assert.assertEquals(13, Fibonacci.fibonacci_calc(7));
    }
    public void testEight()
    {
    	Assert.assertEquals(21, Fibonacci.fibonacci_calc(8));
    }
}
