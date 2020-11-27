package com.zijiang.fight.factory;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.AnnotatedBeanDefinition;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

/**
 * @program spring
 * @description:
 * @author: zhangbo
 * @create: 2020/11/09 20:07
 */
@Component
public class MyBeanFactory implements BeanFactoryPostProcessor {
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		AnnotatedBeanDefinition annotatedBeanDefinition = (AnnotatedBeanDefinition)beanFactory.getBeanDefinition("studentDTO");
		annotatedBeanDefinition.setScope("prototype");
	}
}
