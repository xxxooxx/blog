package com.itshidu.web.service;

import org.springframework.data.domain.Page;

import com.itshidu.web.entity.Student;
import com.itshidu.web.vo.EasyuiResult;

public interface StudentService {

	EasyuiResult list(int page, int rows);

	void delete(long id);

	void update(Student stu);

	void save(Student stu);
	
}
