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
     * Rigourous Tests
     */
    public void testApp()
    {
        assertTrue( true );
    }
    public void testZero()
    {
    	Assert.assertEquals("olleh", ReverseString.reverseString("hello"));
    }
}
