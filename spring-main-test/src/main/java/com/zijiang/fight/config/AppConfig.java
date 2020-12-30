package com.zijiang.fight.config;

import com.zijiang.fight.dto.StudentDTO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @program spring
 * @description:
 * @author: zhangbo
 * @create: 2020/10/26 14:39
 */
@ComponentScan(basePackages={"com.zijiang.fight"})
@Configuration
public class AppConfig {



	@Bean
	public StudentDTO student(){
		StudentDTO studentDTO = new StudentDTO();

		return studentDTO;
	}
}
