package com.iglory.utils;

import java.util.regex.Pattern;


public class StringHelper {
	
	/**
	 * 前导空格
	 */
	private static final Pattern PREFIX_PATTERN = Pattern.compile("^(" + '\u3000' + "|\\s)+");
	
	/**
	 * 后导空格
	 */
	private static final Pattern SUFIX_PATTERN = Pattern.compile("(" + '\u3000' + "|\\s) + $");
	
	/**
	 * 去除字符串前后的中英文空格
	 * @author 84426
	 * @param String
	 * @return
	 */
	public static String trim(String string) {
		if (isNullOrEmpty(string)) {
			return string;
		}
		
		string = PREFIX_PATTERN.matcher(string).replaceFirst("");
		return SUFIX_PATTERN.matcher(string).replaceFirst("");
	}
	
	public static boolean isNull(String value) {
		return value == null;
	}
	
	public static boolean isNotNull(String value) {
		return value != null;
	}
	
	public static boolean isNullOrEmpty(String value) {
		return value == null || value.isEmpty();
	}
	
	public static boolean isNotNullAndEmpty(String value) { 
		return value != null && !value.isEmpty();
	}
	
	public static boolean isNormal(String value) {
		return value != null && !value.isEmpty();
	}
	
	public static String nullOrEmpty(String value, String defaultValue) {
		if (isNullOrEmpty(value)) {
			return defaultValue;
		} else {
			return value;
		}
	}
	
	public static String nvl(String value, String defaultValue) {
		if (value == null || "".equals(value)) {
			return defaultValue;
		} else {
			return value;
		}
	}
	
	public static String nullOnly (String value, String defaultValue) {
		if (value == null) {
			return defaultValue;
		} else {
			return value;
		}
	}
	
	private StringHelper() {
		//工具类，不允许实例化
	}
}
