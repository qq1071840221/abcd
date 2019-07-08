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
<FORM METHOD=POST ACTION="${info==null?'save':'update' }">
<input type="hidden" name="uid" value="${info.uid}">
uname	<INPUT TYPE="text" NAME="uname" value="${info.uname }"><br>
upass	<INPUT TYPE="text" NAME="upass" ><br>
<INPUT TYPE="submit" value="${info==null?'save':'update' }">
</FORM>
</body>
</html>

