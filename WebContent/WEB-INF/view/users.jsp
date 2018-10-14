
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
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<title>Insert title here</title>
</head>
<body>
	<div class="container">



		<table class="table table-striped">
			<thead>
				<tr>
					<th scope="col">ID</th>
					<th scope="col">Name</th>
					<th scope="col">Age</th>
					<th scope="col">Gender</th>
					<th scope="col">Handle</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="user" items="${users}">
					<tr>
						<th scope="row">${user.id}</th>
						<td>${user.name}</td>
						<td>${user.age}</td>
						<td>${user.gender}</td>
						<td><a class="btn btn-success" href="${pageContext.request.contextPath}/users/update/${user.id}">Update</a> / 
						<a class="btn btn-danger" href="${pageContext.request.contextPath}/users/delete/${user.id}">Delete</a></td>
					</tr>
				</c:forEach>
				<tr><td colspan="5"><a class="btn btn-primary btn-block" href="${pageContext.request.contextPath}/users/registration">Add New User</a></td></tr>
			</tbody>
		</table>



	</div>
</body>
</html>