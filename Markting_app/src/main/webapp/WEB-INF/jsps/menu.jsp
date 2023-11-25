<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Menu</title>
<style>
body, ul {
  margin: 0;
  padding: 0;
}

/* Styling the header and navigation */
header {
  background-color: #333;
  color: #fff;
  text-align: center;
  padding: 10px 0;
}

nav ul {
  list-style: none;
  display: flex; /* Display the list items in a row */
  justify-content: center; /* Center the items horizontally */
}

nav ul li {
  margin-right: 20px;
}

nav ul li a {
  color: #fff;
  text-decoration: none;
  font-weight: bold;
}

nav ul li a:hover {
  color: #ffcc00;
}
</style>
</head>
<body>

	<header>
		<nav>
			<ul>
				<li><a href="view">Create Lead</a></li>
				<li><a href="listall">List Leads</a></li>
				
			</ul>
		</nav>
	</header>


</body>
</html>