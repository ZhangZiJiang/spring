package test;

import com.zijiang.fight.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @program spring
 * @description: ioc测试
 * @author: zhangbo
 * @create: 2020/08/24 09:46
 */
public class TestIOC {


	public static void main(String[] args) {
//		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
//
//		StudentDTO student = (StudentDTO) applicationContext.getBean("student2");
//
//		System.out.println(student.toString());

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.refresh();
		context.close();


//		StudentDTO student = (StudentDTO) context.getBean("studentDTO");
//		student.setName("张子枫");
//		student.setAge("10");
//		StudentDTO student2 = (StudentDTO) context.getBean("studentDTO");
//		System.out.println(student.hashCode());
//		System.out.println(student2.hashCode());


	}
}
