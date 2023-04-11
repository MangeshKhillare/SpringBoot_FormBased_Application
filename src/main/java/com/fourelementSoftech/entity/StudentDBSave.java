package com.fourelementSoftech.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "Student_Db_Save")
@Data
public class StudentDBSave {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Student_Id")
	private Integer studentId;

	@Column(name = "Student_Name")
	private String studentName;

	@Column(name = "Email_Id")
	private String emailId;

	@Column(name = "Mobile_No")
	private String mobileNo;

	@Column(name = "Gender")
	private String gender;

	@Column(name = "Course_Name")
	private String courseName;

	@Column(name = "Timinig")
	private String timing;

}
