package com.ibm.cruise.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.cruise.dao.StudentDao;
import com.ibm.cruise.entity.Student;
import com.ibm.cruise.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentDao studentDao;

	@Override
	public List<Student> getStudentList() throws Exception {
		return studentDao.getStudentList();
	}

}
