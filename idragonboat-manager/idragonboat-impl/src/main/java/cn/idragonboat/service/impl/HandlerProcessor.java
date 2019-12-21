package cn.idragonboat.service.impl;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import com.iglory.anno.HandlerType;
import com.iglory.utils.ClassScaner;

@Component
public class HandlerProcessor implements BeanFactoryPostProcessor{
	
	private static final String HANDLER_PACKAGE = "cn.idragonboat.service";
	
	@Autowired
	ApplicationContext applicationContext;

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {

		Map<String, Class> handlerMap = new HashMap<String, Class>();
		Set<Class<?>> scanSet = ClassScaner.scan(HANDLER_PACKAGE, HandlerType.class);
		for (Class<?> clazz : scanSet) {
			String type = clazz.getAnnotation(HandlerType.class).value();
			handlerMap.put(type, clazz);
		}
		
		//初始化HandlerContext，将其注册到spring容器中
		HandlerContext context = new HandlerContext(handlerMap);
		beanFactory.registerSingleton(HandlerContext.class.getName(), context);
		
		
	}
	
	
	
	
}
