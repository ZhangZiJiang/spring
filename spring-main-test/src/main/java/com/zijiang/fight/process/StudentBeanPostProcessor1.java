package com.zijiang.fight.process;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.PriorityOrdered;
import org.springframework.stereotype.Component;

/**
 * @program spring
 * @description:
 * @author: zhangbo
 * @create: 2020/11/09 16:18
 */
@Component
public class StudentBeanPostProcessor1 implements BeanPostProcessor, PriorityOrdered {

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		if("StudentDTO".equals(bean.getClass().getSimpleName())){
			System.out.println("BeanPostProcessor后置处理器1111：：：：" + bean.getClass());
		}
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		return bean;
	}

	@Override
	public int getOrder() {
		return 100;
	}
}
