package com.itshidu.web.controller;

import java.awt.print.Book;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.itshidu.web.dao.StudentDao;
import com.itshidu.web.entity.Student;
import com.itshidu.web.service.StudentService;
import com.itshidu.web.vo.EasyuiResult;


@Controller
public class HelloController {
	
	@Autowired StudentService studentService;

	@ResponseBody
	@RequestMapping("/hello")
	public Object hello() {
		return "OK";
	}
	
	@RequestMapping("/hello/jsp")
	public Object hellojsp(HttpServletRequest request) {
		request.setAttribute("msg", "我终于找到你了");
		return "hello";
		
	}
	
	@RequestMapping("/hello/fmk")
	public Object hellojsp(ModelAndView mav) {
		mav.addObject("info","世界你好test");
		mav.setViewName("test");
		return mav;
		
	}
	
	@ResponseBody
	@RequestMapping("/student/list")
	public Object studentList(int page,int rows) {
		return studentService.list(page,rows);
	}
	
	@ResponseBody
	@RequestMapping("/student/delete")
	public Object remove(long id) {
		Map<String, Object> r = new HashMap();
		try {
			studentService.delete(id);
			r.put("code", 200);
		} catch (Exception e) {
			r.put("code", 500);
			r.put("msg", e.toString());
		}
		return r;
	}
	@ResponseBody
	@RequestMapping("/student/update")
	public Object update(Student stu) {
		//根据ID修改其他属性，只修改有的属性，没值的不修改
		studentService.update(stu);
		return "OK";
	}
	@ResponseBody
	@RequestMapping("/student/save")
	public Object save(Student stu) {
		studentService.save(stu);
		return "OK";
	}
}
