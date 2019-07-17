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
Login
${error} 
<FORM METHOD=POST ACTION="login">
uname	<INPUT TYPE="text" NAME="uname"><br>
upass	<INPUT TYPE="text" NAME="upass" ><br>
<INPUT TYPE="submit" value="login">
</FORM>
</body>
</html>

