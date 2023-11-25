<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%> 
<%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>create</title>
 <style>
    body {
      font-family: Arial, sans-serif;
      display: flex;
      justify-content: center;
      align-items: center;
      height: 100vh;
      background-color: #f4f4f4;
      margin: 0;
    }

    .container {
      text-align: center;
    }

    h1 {
      color: #3498db;
      text-shadow: 2px 2px 4px rgba(0, 0, 0, 0.2);
    }

    form {
      background-color: #fff;
      padding: 70px;
      border-radius: 9px;
      box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
      margin-top: 40px;
      max-width: 300px;
      width: 100%;
      display: inline-block;
    }

    label {
      display: block;
      margin-bottom: 5px;
    }

    input[type="text"],
    input[type="email"] {
      width: calc(100% - 20px);
      padding: 8px;
      border-radius: 4px;
      border: 1px solid #ccc;
      margin-bottom: 10px;
    }

    input[type="submit"] {
      background-color: #3498db;
      color: #fff;
      border: none;
      padding: 10px 20px;
      border-radius: 6px;
      cursor: pointer;
      transition: background-color 0.3s ease;
    }

    input[type="submit"]:hover {
      background-color: #2980b9;
    }
 
 </style>
 
</head>
<body>
    <div class="container">
    <h1>Create Lead</h1>
        <form action="saveLead" method="post">
		    <label for="name">First Name:</label>
		    <input type="text"  name="firstName" >
		    <label for="name">Last Name:</label>
		    <input type="text"  name="lastName">
		    <label for="email">Email:</label>
		    <input type="text" name="email" >
		    <label for="mobile">Mobile:</label>
		    <input type="text" name="mobile" >
		    <input type="submit" value="Save">
		</form>
    </div>
    
    ${msg}
</body>
</html>