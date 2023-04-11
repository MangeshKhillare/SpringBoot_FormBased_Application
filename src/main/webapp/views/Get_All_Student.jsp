<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>All Student Data</title>
</head>
<body>
	<div align="center">
		<h1 style="color: Green">All Student Data Successfully Show...</h1>
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
					<th style="color:rgb(0, 128, 255)">Course Name</th>
					<th style="color: Green">Timing</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${list}" var="u">
					<tr>
						<td>${u.studentId}</td>
						<td>${u.studentName}</td>
						<td style="color: blue">${u.emailId}</td>
						<td>${u.mobileNo}</td>
						<td>${u.gender}</td>
						<td style="color:rgb(255, 0, 255)">${u.courseName}</td>
						<td>${u.timing}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>