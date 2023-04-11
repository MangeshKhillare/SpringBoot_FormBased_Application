package com.fourelementSoftech.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "Course_Dtls")
@Data
public class Course {

	@Id
	@Column(name = "Course_Id")
	private Integer courseId;

	@Column(name = "Course_Name")
	private String courseName;

}
