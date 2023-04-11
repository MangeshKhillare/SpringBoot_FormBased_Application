package com.fourelementSoftech.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "Gender_Dtls")
@Data
public class Gender {

	@Id
	@Column(name = "Gender_Id")
	private Integer genderId;

	@Column(name = "Gender_Name")
	private String genderName;

}
