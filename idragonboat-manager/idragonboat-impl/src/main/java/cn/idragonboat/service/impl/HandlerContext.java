package cn.idragonboat.service.impl;

import java.util.Map;

import com.iglory.utils.BeanTool;

import cn.idragonboat.service.AbstractHandler;

public class HandlerContext {
	
	private Map<String, Class> handlerMap; 
	
	public HandlerContext(Map<String, Class> handlerMap) {
		this.handlerMap = handlerMap;
	}
	
	public AbstractHandler getInstance(String type) {
		
		Class clazz = handlerMap.get(type);
		if (null == clazz) {
			throw new IllegalArgumentException("not found handler for type :" + type);
		}
		
		return (AbstractHandler)BeanTool.getBean(clazz);
	}
}
