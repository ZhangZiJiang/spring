package com.zijiang.fight.dto;

import org.springframework.stereotype.Component;

/**
 * @program spring
 * @description: 学生dto
 * @author: zhangbo
 * @create: 2020/09/01 17:35
 */
@Component
public class StudentDTO {
	private String name;
	private String age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "StudentDTO{" +
				"name='" + name + '\'' +
				", age='" + age + '\'' +
				'}';
	}
}
