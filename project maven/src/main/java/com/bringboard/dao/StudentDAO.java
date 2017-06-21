package com.bringboard.dao;

import java.util.List;

import com.bringboard.model.Student;

public interface StudentDAO {

	public boolean saveStudent(Student c);
	public void updateStudent(Student c);
	public List<Student> allStudents();
	public List<Student> fetchStudent(String sname);
	public void deleteStudent(String sname );

}
