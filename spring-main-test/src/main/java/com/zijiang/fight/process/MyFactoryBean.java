package com.zijiang.fight.process;

import com.zijiang.fight.factory.MyBeanFactory;
import org.springframework.beans.factory.FactoryBean;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @program spring
 * @description:
 * @author: zhangbo
 * @create: 2020/11/15 00:43
 */
public class MyFactoryBean implements InvocationHandler {

//	private Class clazz;
//
//	public MyFactoryBean(Class clazz){
//		this.clazz = clazz;
//	}


//	@Override
//	public Object getObject() throws Exception {
//		Proxy.newProxyInstance(this.getClass().getClassLoader(), new Class[]{clazz}, this);
//		return null;
//	}
//
//	@Override
//	public Class<?> getObjectType() {
//		return null;
//	}
//
//	@Override
//	public boolean isSingleton() {
//		return false;
//	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] objects) throws Throwable {


//		Method method1 = proxy.getClass().getInterfaces()[0].getMethod(method.getName(), String.class);
//
//		Select select = method1.getDeclaredAnnotation(Select.class);
//		System.out.println(select.value()[0]);
		return null;
	}
}
