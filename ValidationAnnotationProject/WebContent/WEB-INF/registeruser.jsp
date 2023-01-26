<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action="reg" method="post" commandName="user">
Name:<form:input path="uname"/>
<form:errors path="uname"></form:errors><br>
id<form:input path="uid"/>
<form:errors path="uid"></form:errors><br>
<input type="submit" value="submit"/>

</form:form>
</body>
</html>