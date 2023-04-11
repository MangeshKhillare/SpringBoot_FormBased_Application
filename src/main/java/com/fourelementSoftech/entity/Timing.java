package com.fourelementSoftech.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "Timing_Dtls")
@Data
public class Timing {

	@Id
	@Column(name = "Timing_Id")
	private Integer timingId;

	@Column(name = "Timing_Name")
	private String timingName;

}
