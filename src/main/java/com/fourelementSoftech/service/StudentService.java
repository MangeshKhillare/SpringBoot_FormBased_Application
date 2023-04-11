package com.fourelementSoftech.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fourelementSoftech.entity.Student;
import com.fourelementSoftech.entity.StudentDBSave;
import com.fourelementSoftech.repository.CourseRepository;
import com.fourelementSoftech.repository.GenderRepository;
import com.fourelementSoftech.repository.StudentReposiotry;
import com.fourelementSoftech.repository.TimingRepository;

@Service
public class StudentService {

	@Autowired
	private CourseRepository courseRepository;

	@Autowired
	private GenderRepository genderRepository;

	@Autowired
	private TimingRepository timingRepository;

	@Autowired
	private StudentReposiotry studentReposiotry;

	public List<String> getCourses() {

		List<String> coursesName = courseRepository.getCoursesName();

		return coursesName;
	}

	public List<String> getGenders() {

		List<String> genderName = genderRepository.getGenderName();

		return genderName;
	}

	public List<String> getTimings() {

		List<String> timingsName = timingRepository.getTimingsName();

		return timingsName;
	}

	public boolean saveStudent(Student student) {

		StudentDBSave entity = new StudentDBSave();
		BeanUtils.copyProperties(student, entity);

		StudentDBSave save = studentReposiotry.save(entity);

		return save != null & save.getStudentId() != null;
	}

	public List<StudentDBSave> getAllStudent() {

		List<StudentDBSave> findAlls = studentReposiotry.findAll();

		return findAlls;
	}

	public StudentDBSave getSingleRecordStudent(Integer studentId) {

		StudentDBSave studentDbSave = studentReposiotry.findById(studentId).get();

		return studentDbSave;

	}

	public StudentDBSave updateStudent(StudentDBSave student) {
		StudentDBSave save = studentReposiotry.save(student);

		return save;
	}

	public boolean deleteStudent(Integer studentId) {

		studentReposiotry.deleteById(studentId);

		return true;
	}

	public boolean deleteAllUser() {

		studentReposiotry.deleteAll();

		return true;
	}

}
