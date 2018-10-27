package com.java1234.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.java1234.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>,JpaSpecificationExecutor<Student>{
	 
}
