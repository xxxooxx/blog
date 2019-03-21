package com.itshidu.web.test;

import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.itshidu.web.dao.StudentDao;
import com.itshidu.web.entity.Student;

public class TestSave {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:spring/ApplicationContext.xml");
		StudentDao dao = ctx.getBean(StudentDao.class);
		Date dt = new Date();
		for(int i=1;i<=200;i++) {
			Student s = new Student();
			s.setName("悟空"+i);
			s.setCode(String.format("XH%04d", i));
			s.setCreateTime(dt);
			s.setUpdateTime(dt);
			dao.save(s);
		}

	}

}
