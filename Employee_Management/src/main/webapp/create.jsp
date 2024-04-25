<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form:form action="save" modelAttribute="employee">

<form:label path="id">ID</form:label>
<form:input path="id"/>

<form:label path="name">Employee name</form:label>
<form:input path="name"/>

<form:label path="designation">designation</form:label>
<form:input path="designation"/>

<form:label path="salary">salary</form:label>
<form:input path="salary"/>

<input type="submit" value="save employee">


</form:form>


</body>
</html>