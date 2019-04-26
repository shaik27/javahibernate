<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="f" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<f:form action="processForm" modelAttribute="student">
	id:<f:input path="sid"/><br><br> <!-- path name should be equal to student bean sid -->
	Name:<f:input path="name"/><br><br>
	Address:<f:input path="address"/><br><br>
	Country:<f:select path="country">
		<%-- <f:option value="IN">India</f:option> --%>
		<%-- <f:option value="UK">London</f:option>
		<f:option value="US">America</f:option> --%>
		 <f:options items="${countryOptions}"/> 
	</f:select>
	<input type="submit" value="Submit">
		
	</f:form>

	<%-- <form action="processForm">
		sid:<input type="text" name="sid"><br> <br> Name:<input
			type="text" name="name"><br> <br> Address:<input
			type="text" name="address"><br> <br> <input
			type="submit" value="Submit">
	</form> --%>
</body>
</html>