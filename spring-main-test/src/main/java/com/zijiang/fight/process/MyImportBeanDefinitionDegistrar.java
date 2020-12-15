package com.zijiang.fight.process;

import com.zijiang.fight.dao.StudentMapper;
import com.zijiang.fight.factory.MyBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanNameGenerator;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

import java.util.Objects;

/**
 * @program spring
 * @description:
 * @author: zhangbo
 * @create: 2020/11/15 00:34
 */
public class MyImportBeanDefinitionDegistrar implements ImportBeanDefinitionRegistrar {


	@Override
	public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {


		BeanDefinitionBuilder builder = BeanDefinitionBuilder.genericBeanDefinition(StudentMapper.class);
		GenericBeanDefinition beanDefinition = (GenericBeanDefinition) builder.getBeanDefinition();
		beanDefinition.getConstructorArgumentValues().addGenericArgumentValue(Objects.requireNonNull(beanDefinition.getBeanClassName()));

		beanDefinition.setBeanClass(MyBeanFactory.class);
		registry.registerBeanDefinition("studentMapper", beanDefinition);
	}

}
