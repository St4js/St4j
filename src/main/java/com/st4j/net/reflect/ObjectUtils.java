package com.st4j.net.reflect;

import java.lang.reflect.Method;

/**
 * 通过反射操作对象
 *
 */
public class ObjectUtils {

    /**
     * 得到未知对象中的已知属性名值
     * @param o 未知对象
     * @param fieldName 已知属性名
     * @return
     */
    public static Object getFieldValueByName(Object o,String fieldName) {
        try {
            String firstLetter = fieldName.substring(0, 1).toUpperCase();
            String getter = "get" + firstLetter + fieldName.substring(1);
            Method method = o.getClass().getMethod(getter, new Class[] {});
            Object value = method.invoke(o, new Object[] {});
            return value;
        } catch (Exception e) {
            return null;
        }
    }

}
