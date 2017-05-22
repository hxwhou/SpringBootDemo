package com.ibm.cruise.service;

import java.util.List;

import com.ibm.cruise.entity.Student;

public interface StudentService {
	List<Student> getStudentList() throws Exception;
}
