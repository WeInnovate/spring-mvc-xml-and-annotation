<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student</title>
</head>
<body>
<h1>Student Details</h1>
${student.name} <br />
${student.age} <br />
${student.gender} <br />
${student.country} <br />
${student.courses[0]} &nbsp; ${student.courses[1]} &nbsp; ${student.courses[3]} <br />
${student.graduate} <br />
${student.comment}
</body>
</html>