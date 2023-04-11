package com.fourelementSoftech.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.fourelementSoftech.entity.StudentDBSave;

@Repository
public interface StudentReposiotry extends JpaRepository<StudentDBSave, Serializable> {

	@Query("Select studentId from StudentDBSave")
	public List<String> getAllStudent();

	@Query("Select studentId from StudentDBSave")
	public List<String> getStudentId(Integer studentId);

	@Query("Select studentId from StudentDBSave")
	public List<StudentDBSave> updateStudent(Integer studentId);
}
