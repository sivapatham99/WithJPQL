package com.example.projectWithJPQL.model;



import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQuery;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@NamedQuery(
		name = "Student.findByName",
		
		query = "SELECT s FROM Student s WHERE s.name = :name")

public class Student {
	@Id
	private int id;
	private String name;
	private int age;

}
