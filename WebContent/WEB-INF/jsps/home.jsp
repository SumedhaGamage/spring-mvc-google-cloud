<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<p><a href="${pageContext.request.contextPath}/offers">Show Current Offers</a></p>
<p><a href="${pageContext.request.contextPath}/createoffers">Create Offers</a></p>

<form action="test">
<form:select path="country" class="click">
<form:option value="" label="-- Choose one--" />
<form:options items="${countryList}" />
</form:select>
<input type="submit">
</form>

<p>${country.country}</p>




</body>
</html>