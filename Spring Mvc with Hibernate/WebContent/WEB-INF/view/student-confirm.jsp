<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	isELIgnored="false" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%-- <p>Student Id is :<span style="color:green;font-weight: bold">${sid}</span><p>
	<p>Student Name is :<span style="color:green;font-weight: bold">${name}</span></p>
	<p>Student Address is :<span style="color:green;font-weight: bold">${address}</span></p> --%>

	<%-- <h1>${msg}</h1> --%>

	<h3>Student Id is : <span style="color:green">${stud.sid}</span></h3>
	<h3>Student Name is :<span style="color:green"> ${stud.name}</span></h3>
	<h3>Student Address is :<span style="color:green"> ${stud.address}</span></h3>

	<a href="showForm">Go to StudentForm </a>

</body>
</html>