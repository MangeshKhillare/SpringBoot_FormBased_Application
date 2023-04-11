package com.fourelementSoftech.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.fourelementSoftech.entity.Gender;

@Repository
public interface GenderRepository extends JpaRepository<Gender, Serializable> {

	@Query("Select genderName from Gender")
	public List<String> getGenderName();
}
