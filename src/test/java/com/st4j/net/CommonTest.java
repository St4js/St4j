package com.st4j.net;

import com.alibaba.fastjson.JSONObject;
import com.st4j.net.common.StringUtils;
import com.st4j.net.json.JSONUtils;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class CommonTest
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public CommonTest(String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( CommonTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }

    /**
     * test for JSONUtils
     * */
    public void testCommon(){
        String str = null;
        System.out.println(StringUtils.isNull(str));
        System.out.println(StringUtils.safeGetValue(str));

    }

}
