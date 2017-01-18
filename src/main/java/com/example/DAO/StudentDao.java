package com.example.DAO;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.example.Entity.Student;

@Repository
public class StudentDao {
	private static Map<Integer,Student> students;
	
	static {
		students = new HashMap<Integer, Student>() {
			{
				put(1, new Student(1, "Helmik", "Computer science"));
				put(2, new Student(2, "Xali", "Chemestry"));
				put(3, new Student(3, "Karina", "Maths"));
			}
		};
	}
	
	public Collection<Student> getAllstudents(){
		return this.students.values();
	}
	
	public Student getStudentById(int id){
		return this.students.get(id);
	}
	
}
