package com.project.service;

import java.util.List;

import com.project.dao.StudentDao;
import com.project.model.Student;

public class StudentServiceImpl implements StudentService {

	private StudentDao studentDao;
	
	public void setStudentDao(StudentDao studentDao) {
		this.studentDao = studentDao;
	}
	
	
	
	@Override
	public int save(Student student) {
 
		return studentDao.save(student);
	}

	@Override
	public boolean updateStudent(Student student) {
		// TODO Auto-generated method stub
		return studentDao.updateStudent(student);
	}

	@Override
	public boolean deleteStudent(Student student) {
		// TODO Auto-generated method stub
		return studentDao.deleteStudent(student);
	}

	@Override
	public Student findByID(int studentId) {
		// TODO Auto-generated method stub
		return studentDao.findByID(studentId);
	}

	@Override
	public Student findByName(int studentId) {
		// TODO Auto-generated method stub
		return studentDao.findByID(studentId);
	}

	@Override
	public List<Student> findAll() {
		// TODO Auto-generated method stub
		return studentDao.findAll();
	}

}
