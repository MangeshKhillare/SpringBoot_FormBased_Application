package com.fourelementSoftech.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.fourelementSoftech.entity.Student;
import com.fourelementSoftech.entity.StudentDBSave;
import com.fourelementSoftech.service.StudentService;

@Controller
public class StudentController {

	@Autowired
	private StudentService studentService;

	@GetMapping("/studentForm")
	public String loadStudentForm(Model model) {

		// List<String> courses = studentService.getCourses();
		// List<String> genders = studentService.getGenders();
		// List<String> timings = studentService.getTimings();

		model.addAttribute("courses", studentService.getCourses());
		model.addAttribute("genders", studentService.getGenders());
		model.addAttribute("timings", studentService.getTimings());

		model.addAttribute("student", new Student());

		return "Student_Registration_Form";
	}

	@PostMapping("/saveStudent")
	public String saveStudent(Student student) {
		System.out.println(student);

		studentService.saveStudent(student);

		return "SuccessPage";
	}

	@GetMapping("/getAllStudent")
	public String getAllStudent(Model model) {

		List<StudentDBSave> allStudent = studentService.getAllStudent();

		model.addAttribute("list", allStudent);
		for (StudentDBSave studentDBSave : allStudent) {

			System.out.println(studentDBSave);
		}

		return "Get_All_Student";
	}

	@GetMapping("/getSingleRecordStudent/{studentId}")
	public String getSingleRecordStudent(@PathVariable Integer studentId, Model model) {

		StudentDBSave singleRecordStudent = studentService.getSingleRecordStudent(studentId);

		model.addAttribute("singleStudentdata", singleRecordStudent);

		return "Single_Student_Data";
	}

	@GetMapping("/updateRecord/{studentId}")
	public String updateData(@PathVariable Integer studentId, Model model) {

		StudentDBSave dbSave = studentService.getSingleRecordStudent(studentId);
		StudentDBSave updateStudent1 = studentService.updateStudent(dbSave);
		model.addAttribute("studentUpdateData", updateStudent1);

		return "Student_Update_Data";
	}

	@GetMapping("/deleteSingleRecord/{studentId}")
	public String deleteSingleRecord(@PathVariable Integer studentId) {

		studentService.deleteStudent(studentId);

		return "Delete_Student";
	}

	@GetMapping("/deleteAllRecord")
	public String deleteAllRecord() {

		studentService.deleteAllUser();

		return "Delete_AllStudent";

	}
}
