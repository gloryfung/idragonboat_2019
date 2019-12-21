package cn.idragonboat.demo;

import java.lang.reflect.Field;
/*
 * String类不可变，可以通过反射修改
 */
public class CompareDemo {
	
	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		
		String str = "冯志联";
		System.out.println(str);
		Field field = String.class.getDeclaredField("value");
		field.setAccessible(true);
		char[] value = (char[]) field.get(str);
		value[0] = 'a';
		System.out.println(str);
				
		
	}
	
}
