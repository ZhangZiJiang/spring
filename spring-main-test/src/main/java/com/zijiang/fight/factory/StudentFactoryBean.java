package com.zijiang.fight.factory;

import com.zijiang.fight.dto.StudentDTO;
import org.springframework.beans.factory.FactoryBean;

/**
 * @program spring
 * @description:
 * @author: zhangbo
 * @create: 2020/09/14 22:39
 */
public class StudentFactoryBean implements FactoryBean<StudentDTO> {

	private String studentInfo;

	@Override
	public StudentDTO getObject() throws Exception {
		StudentDTO s = new StudentDTO();
		String[] infos = studentInfo.split(",");
		s.setName(infos[0]);
		s.setAge(infos[1]);
		return s;
	}

	@Override
	public Class<StudentDTO> getObjectType() {
		return StudentDTO.class;
	}

	@Override
	public boolean isSingleton() {
		return false;
	}

	public String getStudentInfo() {
		return this.studentInfo;
	}

	public void setStudentInfo(String studentInfo) {
		this.studentInfo = studentInfo;
	}
}
