package com.example.lesson04.dao;

import org.springframework.stereotype.Repository;

import com.example.lesson04.model.Student;

@Repository
public interface StudentDAO {
	public Student insertStudent(Student student);
}
