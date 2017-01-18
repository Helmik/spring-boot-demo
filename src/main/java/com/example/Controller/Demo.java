package com.example.Controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.Entity.Student;
import com.example.Service.StudentService;

@RestController
@RequestMapping("/students")
public class Demo {
	@Autowired
	private StudentService studentService;
	
	@RequestMapping(method = RequestMethod.GET)
	public Collection<Student> getAllStudents(){
		return studentService.getAllStudents();
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Student getStudentById(@PathVariable("id") int id){
		return this.studentService.getStudentById(id);
	}
}
