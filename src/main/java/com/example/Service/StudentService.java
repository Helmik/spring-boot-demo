package com.example.Service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.DAO.StudentDao;
import com.example.Entity.Student;

@Service
public class StudentService {
	@Autowired
	private StudentDao studentDao;
	
	public Collection<Student> getAllStudents(){
		return this.studentDao.getAllstudents();
	}
	
	public Student getStudentById(int id){
		return this.studentDao.getStudentById(id);
	}
}
