<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Form</title>
<style type="text/css">
.error-color{
color: red;
}
</style>
</head>
<body>
	<form:form action="processStudentForm" modelAttribute="student">
		
		<label>Name</label>
		<form:input path="name" />
		<form:errors path="name" cssClass="error-color" />
		<br />
		
		<label>Date of Birth</label>
		<form:input path="dob" />
		<form:errors path="dob" cssClass="error-color" />
		<br />
		
		<label>Exam Date</label>
		<form:input path="examDate" />
		<form:errors path="examDate" cssClass="error-color" />
		<br />
		
		<label>Batch Code</label>
		<form:input path="batchCode" />
		<form:errors path="batchCode" cssClass="error-color" />
		<br />

		<label>Age</label>
		<form:input path="age" />
		<form:errors path="age" cssClass="error-color" />
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
		<form:errors path="country" cssClass="error-color" />
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
		<form:errors path="comment" cssClass="error-color" />
		<br />
		
		<br />
		<input type="submit" value="Submit">

	</form:form>
</body>
</html>