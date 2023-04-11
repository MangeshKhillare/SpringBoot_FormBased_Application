<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Form Page</title>
<style type="text/css">
label {
	display: inline-block;
	width: 110px;
	height: 30px;
	margin: 5px;
	text-align: left;
	font-weight: 900;
}

button {
	padding: 10px;
	margin: 10px;
	background-color: orange;
	border: none;
	border-radius: 3px;
}

input[type=text], select {
	width: 200px;
}

input[type=radio] {
	display: inline-block;
	margin-left: 1px;
	margin-right: 1px;
	width: 15px;
}

input[type=checkbox] {
	display: inline-block;
	margin-left: 1px;
	width: 15px;
}
</style>
</head>
<body>
	<div align="center">
		<h1 style="color: green">
			<b><u>Student Registration Form</u></b>
		</h1>


		<form:form action="saveStudent" modelAttribute="student" method="post">

			<form:label path="studentName" style="color:rgb(0, 128, 255)">Student Name :</form:label>
			<form:input path="studentName" />
			<br />
			<br />

			<form:label path="emailId" style="color:rgb(0, 0, 255)">Email Id :</form:label>
			<form:input path="emailId" />
			<br />
			<br />

			<form:label path="mobileNo" style="color:rgb(255, 0, 128)">Mobile No :</form:label>
			<form:input path="mobileNo" />
			<br />
			<br />

			<form:label path="gender" style="color:rgb(64, 0, 255)">Gender :</form:label>
			<form:radiobuttons path="gender" items="${genders}" />
			<br />
			<br />


			<form:label path="courseName" style="color:rgb(255, 0, 0)">Course Name :</form:label>
			<form:select path="courseName" items="${courses}" />
			<br />
			<br />


			<form:label path="timing" style="color:rgb(255, 64, 0)">Timing :</form:label>
			<form:checkboxes path="timing" items="${timings}" />
			<br />
			<br />


			<form:button>StudentRegister</form:button>

		</form:form>
	</div>
</body>
</html>