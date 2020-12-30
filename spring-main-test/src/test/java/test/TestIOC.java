package test;

import com.zijiang.fight.config.AppConfig;
import com.zijiang.fight.dto.StudentDTO;
import org.springframework.beans.factory.annotation.Autowired;
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


		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//		StudentDTO studentDTO1 = (StudentDTO) context.getBean("studentDTO");
//		studentDTO1.setName("2323");
//		System.out.println("studentDTO1: " + studentDTO1);
//		StudentDTO studentDTO2 = (StudentDTO) context.getBean("studentDTO");
//		System.out.println("studentDTO2: " + studentDTO2);


//		StudentDTO student = (StudentDTO) context.getBean("studentDTO");
//		student.setName("张子枫");
//		student.setAge("10");
//		StudentDTO student2 = (StudentDTO) context.getBean("studentDTO");
//		System.out.println(student.hashCode());
//		System.out.println(student2.hashCode());


	}
}
