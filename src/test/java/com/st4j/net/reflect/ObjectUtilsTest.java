package com.st4j.net.reflect; 

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After;

import static org.junit.Assert.assertEquals;

/** 
* ObjectUtils Tester. 
* 
* @author <cja>
* @since <pre>1, 16, 2019</pre>
* @version 1.0 
*/ 
public class ObjectUtilsTest {
    public Otest otest;

    class Otest{
        private  String pa;
        private  String pb;

        public void setPa(String pa) {
            this.pa = pa;
        }

        public void setPb(String pb) {
            this.pb = pb;
        }

        public String getPa() {
            return pa;
        }

        public String getPb() {
            return pb;
        }
    }

@Before
public void before() throws Exception {
    otest=new Otest();
    otest.pa="pa";
    otest.pb="pb";
}

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: getFieldValueByName(Object o, String fieldName) 
* 
*/ 
@Test
public void testGetFieldValueByName() throws Exception {
    String tpa= (String) ObjectUtils.getFieldValueByName(otest,"pa");
    assertEquals("pa",tpa);
} 


} 
