<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
	integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
	crossorigin="anonymous">
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<title>User Registration Form</title>
</head>
<body>

	<div class="container">

		<form:form action="${pageContext.request.contextPath}/users/register" modelAttribute="user"
			method="post">
			<form:input path="id" type="text" hidden="true"  />
			<div class="form-row">
				<div class="form-group col-md-6">
					<label for="inputEmail4">Name</label>
					<form:input path="name" type="text" class="form-control"
						id="inputEmail4" placeholder="Name" />
				</div>
				<div class="form-group col-md-6">
					<label for="inputPassword4">Age</label> <form:input path="age"
						type="number" class="form-control" id="inputPassword4"
						placeholder="Age" />
				</div>
			</div>

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

			<button type="submit" class="btn btn-primary">Register</button>
		</form:form>



	</div>



</body>
</html>