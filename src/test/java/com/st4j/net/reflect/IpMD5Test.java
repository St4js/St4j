package com.st4j.net.reflect;

import com.st4j.net.common.HttpUtils;
import com.st4j.net.date.DateTimeUtils;
import com.st4j.net.encrypt.MD5Utils;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.apache.commons.lang3.time.DateUtils;

import java.io.IOException;
import java.text.ParseException;
import java.util.Date;

public class IpMD5Test extends TestCase {
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public IpMD5Test(String testName) {
        super(testName);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite(IpMD5Test.class);
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp() {
        assertTrue(true);
    }

    /**
     * test for JSONUtils
     */
    public void testMd5() {
        System.out.println(MD5Utils.getPwd("111"));
        System.out.println(MD5Utils.getPwd("111"));
    }

    public void testHttpUtils() throws IOException {
        HttpUtils.BodyPost("http://www.baidu.com", null);
    }

    public void testDateUtils() throws ParseException {
//		System.out.println(formatDate(parseDate("2010/3/6")));
//		System.out.println(getDate("yyyy年MM月dd日 E"));
//		long time = new Date().getTime()-parseDate("2012-11-19").getTime();
//		System.out.println(time/(24*60*60*1000));
        System.out.println(DateTimeUtils.formatDateTime(new Date()));
    }
}
