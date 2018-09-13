<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Form</title>
</head>
<body>
	<form:form action="processStudentForm" modelAttribute="student">
		
		<label>Name</label>
		<form:input path="name" />
		<br />

		<label>Age</label>
		<form:input path="age" />
		<br />

		<label>Gender</label>
		<form:radiobutton path="gender" value="Male" /> Male &nbsp;
		<form:radiobutton path="gender" value="Female" /> Female
		<br />
		
		<label>Country</label>
		<form:select path="country">
		<form:option value="">---Select---</form:option>
		<form:option value="United Kingdom">UK</form:option>
		<form:option value="India">IND</form:option>
		<form:option value="United States">US</form:option>
		</form:select>
		<br />
		
		<label>Course</label>
		<form:checkbox path="courses" value="Core Java"/>Core Java &nbsp;
		<form:checkbox path="courses" value="Advance Java"/>Advance Java &nbsp;
		<form:checkbox path="courses" value="Java Frameworks"/>Java Frameworks &nbsp;	
		<br />
		
		<label>Are you graduate?</label>
		<form:checkbox path="graduate"/>
		<br />
		
		<label>Comment</label>
		<form:textarea path="comment" cols="100" rows="5"/>
		<br />
		
		<br />
		<input type="submit" value="Submit">

	</form:form>
</body>
</html>