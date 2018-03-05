<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<!DOCTYPE html PUBLIC>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Add car</h1>

	
		<form:form action="${pageContext.request.contextPath}/car/create"
					method="POST"
					modelAttribute="carModel">
		
		Make:
			<form:input path="make"/> <form:errors path="make" /> <br>
		
		Model:
			<form:input path="model"/> <form:errors path="model"/> <br>
		
		<br>
			<input type="submit" value="Add car">
		</form:form>

</body>
</html>