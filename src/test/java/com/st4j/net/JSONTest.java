package com.st4j.net;

import com.alibaba.fastjson.JSONObject;
import com.st4j.net.json.JSONUtils;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class JSONTest
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public JSONTest(String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( JSONTest.class );
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
    public void testJSON() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("a","a");
        System.out.println(JSONUtils.isJSONValid(jsonObject.toJSONString()));
        System.out.println(JSONUtils.isJSONValid("asdad"));
        System.out.println(JSONUtils.validateByKeys(jsonObject,"a"));
        System.out.println(JSONUtils.validateByKeys(jsonObject,new String[]{"a","b"}));
        System.out.println(JSONUtils.validateByKeysAllNull(jsonObject,new String[]{"a","b"}));
        System.out.println(JSONUtils.validateByKeysAllNull(jsonObject,"b"));
    }
}
