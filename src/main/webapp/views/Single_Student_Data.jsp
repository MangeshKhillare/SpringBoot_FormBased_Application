<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Single Data Page</title>
</head>
<body>

	<div align="center">
		<table border="1">
			<thead>
				<tr>
					<th colspan="7" style="color: blue"><b>Student Single Data</b></th>
				</tr>
				<tr>
					<th rowspan="7" style="color: violet">Student Id</th>
					<th style="color: orange">Student Name</th>
					<th style="color: blue">Email Id</th>
					<th style="color: Magenta">Mobile No</th>
					<th style="color: olive">Gender</th>
					<th style="color: rgb(0, 128, 255)">Course Name</th>
					<th style="color: Green">Timing</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>${singleStudentdata.studentId}</td>
					<td>${singleStudentdata.studentName}</td>
					<td style="color: blue">${singleStudentdata.emailId}</td>
					<td>${singleStudentdata.mobileNo}</td>
					<td>${singleStudentdata.gender}</td>
					<td style="color: rgb(255, 0, 255)">${singleStudentdata.courseName}</td>
					<td>${singleStudentdata.timing}</td>
				</tr>
			</tbody>
		</table>
	</div>
</body>
</html>