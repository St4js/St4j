package com.st4j.net.json;

import com.alibaba.fastjson.JSONObject;
import com.st4j.net.common.StringUtils;

import java.util.Map;

public class JSONUtils {

	/**
	 * 根据参数key数组验证非空,&&关系
	 */
	public static boolean validateByKeys(JSONObject jsonObject, String... strings) {
		if (strings.length > 0) {
			for (int i = 0; i < strings.length; i++) {
				if (StringUtils.isNull(StringUtils.safeGetValue(jsonObject.get(strings[i])))) {
					return false;
				} else {
					if (isJSONValid(jsonObject.getString(strings[i]))) {
						for (Map.Entry<String, Object> entry : JSONObject.parseObject(jsonObject.getString(strings[i])).entrySet()) {
							if (StringUtils.isNull(entry.getValue())) return false;
						}
					}
				}
			}
			return true;
		}
		return false;
	}
	

	/**
	 * 根据参数key数组验证非空,||关系
	 */
	public static boolean validateByKeysAllNull(JSONObject jsonObject, String... strings) {
		int count = 0;
		if (strings.length > 0) {
			for (int i = 0; i < strings.length; i++) {
				if (StringUtils.isNull(jsonObject.get(strings[i])))
					count++;
			}
		}
		return count == strings.length ? false : true;
	}
	
	/**
	 * 验证字符串是否为json格式
	 * */
	public final static boolean isJSONValid(String test) {
		try {
			JSONObject.parseObject(test);
		} catch (Exception ex) {
			try {
				JSONObject.parseArray(test);
			} catch (Exception ex1) {
				return false;
			}
		}
		return true;
	}

}
