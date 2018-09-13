<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome!!!</title>
</head>
<body>
<a href="studentForm">Show Student Form</a>
<hr />
	<h1>Welcome from JSP file</h1>
	<h2>Model</h2>
	<hr /> String: ${name}
	<br /> List: ${fruits }
	<br /> Map: ${contacts }
	<br /> Student: ${std.name} &nbsp; ${std.age} &nbsp; ${std.gender}
	<br /> <form action="car-name"><input type="text" name="carName" placeholder="Enter Car Name" /> <input type="submit" value="Make Upper Case" /> </form>
	<br /> <form action="car-name-thru-req-param"><input type="text" name="carName" placeholder="Enter Car Name" /> <input type="submit" value="Make Upper Case" /> </form>
	<br /> <a href="car-name-thru-path-param/Audi">Can Name in Path</a>
</body>
</html>