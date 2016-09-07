package com.jeffhobbsonline;

import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for reverse string application.
 */
public class ReverseStringTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public ReverseStringTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( ReverseStringTest.class );
    }

    /**
     * Unit Tests
     */
    public void testSimpleStringWithNoSpaces()
    {
    	Assert.assertEquals("olleh", ReverseString.reverseString("hello"));
    }
    public void testSimpleStringWithSpaces()
    {
    	Assert.assertEquals("rac ecar", ReverseString.reverseString("race car"));
    }
    public void testSimpleStringThatFails()
    {
   	Assert.assertFalse("lleh".equals(ReverseString.reverseString("hello")));
    }
}