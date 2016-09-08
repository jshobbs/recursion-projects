package com.jeffhobbsonline;

import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple Factorial.
 */
public class FactorialTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public FactorialTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( FactorialTest.class );
    }

    /**
     * Unit Tests
     * 
    */
    public void testNegativeInteger()
    {
    	Assert.assertEquals(-4, Factorial.factorial(-4));
    } 
    public void testIntegerZero()
    {
    	Assert.assertEquals(0, Factorial.factorial(0));
    } 
    public void testIntegerOne()
    {
    	Assert.assertEquals(1, Factorial.factorial(1));
    } 
    public void testIntegerTwo()
    {
    	Assert.assertEquals(2, Factorial.factorial(2));
    } 
    public void testIntegerFour()
    {
        Assert.assertEquals(24, Factorial.factorial(4));
    } 
    public void testIntegerSix()
    {
        Assert.assertEquals(720, Factorial.factorial(6));
    } 
    public void testIntegerTen()
    {
    	Assert.assertEquals(3628800, Factorial.factorial(10));
    }
}