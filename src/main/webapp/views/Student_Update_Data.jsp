<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Page</title>
</head>
<body>
	<div align="center">
		<h1 style="color: Green">Update Student Data</h1>
		<table border="1">
			<thead>
				<tr>
					<th colspan="7" style="color: Red"><b>Student Data</b></th>
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
					<td>${studentUpdateData.studentId}</td>
					<td>${studentUpdateData.studentName}</td>
					<td style="color: blue">${studentUpdateData.emailId}</td>
					<td>${studentUpdateData.mobileNo}</td>
					<td>${studentUpdateData.gender}</td>
					<td style="color: rgb(255, 0, 255)">${studentUpdateData.courseName}</td>
					<td>${studentUpdateData.timing}</td>
				</tr>
			</tbody>
		</table>
	</div>
</body>
</html>