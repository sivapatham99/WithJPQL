package com.example.projectWithJPQL.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.projectWithJPQL.model.Student;
import com.example.projectWithJPQL.repository.JpqlInterface;

@RestController
@RequestMapping("/students")
public class StudentController {
	
	@Autowired
	private JpqlInterface obj;
	
	@GetMapping("/{name}")
	public List<Student> findByName(@PathVariable String name){
		return obj.findByName(name);
	}
}
