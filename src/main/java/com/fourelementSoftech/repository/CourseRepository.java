package com.fourelementSoftech.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.fourelementSoftech.entity.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Serializable> {

	@Query("Select courseName from Course")
	public List<String> getCoursesName();
}
