package com.example.projectWithJPQL.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.projectWithJPQL.model.Student;



public interface JpqlInterface extends JpaRepository<Student ,Integer>{

	@Query(name = "Student.findByName")
	List<Student> findByName(@Param("name")String name);
	
	

	
}
