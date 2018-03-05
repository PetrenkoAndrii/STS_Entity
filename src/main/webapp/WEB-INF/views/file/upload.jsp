<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h3>Upload file</h3>
		<br>
	
	<form action="${pageContext.request.contextPath}/file/upload/to-project-directory"
			method="post" enctype="multipart/form-data">
			
			<input type="file" name="fileUpload"> <br><br>
			<input type="submit" value="Upload file">	
	</form>

</body>
</html>