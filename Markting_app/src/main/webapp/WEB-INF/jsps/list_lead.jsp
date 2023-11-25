<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>leads</title>
<style>
.styled-table {
	width: 100%;
	border-collapse: collapse;
	font-family: Arial, sans-serif;
	font-size: 14px;
}

.styled-table th, .styled-table td {
	border: 1px solid #dddddd;
	padding: 8px;
	text-align: left;
}

.styled-table th {
	background-color: #2c3e50; /* Dark blue for headers */
	font-weight: bold;
	color: #ffffff; /* Text color for headers */
}

.styled-table tr:nth-child(even) {
	background-color: #34495e; /* Dark blue for even rows */
}

.styled-table tr:nth-child(odd) {
	background-color: #2c3e50; /* Darker blue for odd rows */
}

.styled-table tr:hover {
	background-color: #2980b9; /* Lighter blue hover color */
	transition: background-color 0.3s ease; /* Smooth transition */
}
</style>

</head>
<body>
      <h1>Lead List</h1>
	<table class="styled-table">
		<tr>
			<th>FirstName</th>
			<th>LastName</th>
			<th>Email</th>
			<th>Mobile</th>
			<th>Action</th>
			<th>Update</th>
		</tr>
                 <tbody>
			<c:forEach var="lead" items="${leads}">
				<tr>
				       <td>${lead.firstName}"</td>
					<td>${lead.lastName}"</td>
					<td>${lead.email}"</td>
					<td>${lead.mobile}</td>
					<td><a href ="delete?id=${lead.id}">Delete</a></td>
					<td><a href ="update?id=${lead.id}">Update</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>

</body>
</html>
