<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<TABLE border="1" width="100%">
<TR>
	<TD>uid</TD>
	<TD>uname</TD>
	<TD>upass</TD>
	<TD>operate</TD>
</TR>
<c:forEach var="info" items="${list}">
<TR>
	<TD>${info.uid }</TD>
	<TD>${info.uname }</TD>
	<TD>${info.upass }</TD>
	<TD>
	<a href="delete?uid=${info.uid }">Delete</a> 
	<a href="findById?uid=${info.uid }">Update</a>
</TR>
</c:forEach>
</TABLE>
</body>
</html>

<a href="goInput">save</a>