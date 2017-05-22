package com.ibm.cruise.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.cruise.entity.Student;
import com.ibm.cruise.service.StudentService;

@RestController
@RequestMapping("rest/student")
public class StudentController {
	private static final Logger logger = LoggerFactory.getLogger(StudentController.class);
	
	@Autowired
	private StudentService studentService;
	
	@RequestMapping("/list")
	public List<Student> getStudentList() throws Exception{
		logger.info("查询数据库读取Student集合");
		return studentService.getStudentList();
	} 

}
