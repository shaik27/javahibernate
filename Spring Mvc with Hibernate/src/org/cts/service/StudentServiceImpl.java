package org.cts.service;

import org.cts.bean.Student;
import org.cts.dao.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
//@Transactional
public class StudentServiceImpl implements StudentService {
	@Autowired
	StudentDao dao;
	@Override
	public void registerStudent(Student student) {
			dao.insert(student);
			System.out.println("Inserted");
	}

}
