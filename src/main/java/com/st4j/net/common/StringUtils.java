package com.st4j.net.common;

import java.util.Optional;

public class StringUtils {

	public static boolean isEmpty(Object str) {
		return (str == null || "".equals(str));
	}

	/**
	 * 判断对象是否为空，为空返回true，不为空返回false -->JDK1.7-=
	 * 
	 * @date 2015-4-3 下午5:51:35
	 * @param o
	 * @return
	 */
	public static boolean isNull(Object o) {
		if (null == o || "".equals(o.toString()) || "null".equals(o.toString())) {
			return true;
		}
		return false;
	}

	/**
	 * 避免空指针,安全的获取map值,为空返回"",不为空则按照实际值返回. -->JDK1.8+=
	 */
	public static String safeGetValue(Object str) {
		return Optional.ofNullable(str).map(value -> value.toString().trim()).orElse("") + "";
	}

	/**
	 * 判断对象是否为空，为空返回true，不为空返回false -->JDK1.7
	 * 
	 * @date 2019-01-17 10:40
	 * @param boolean
	 * @return
	 */
	public static boolean checkParam(Object... obj) {

		for (Object object : obj) {
			if ("".equals(object) || object == null) {
				return false;
			}
		}
		return true;
	}
}
