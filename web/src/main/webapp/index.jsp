<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String title = "웹사이트 JSP출력";
	String username = "홍길동";
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title><%=title%></title>
</head>
<body>
<header>
<%@ include file="./index2.jsp" %>
</header>

고객명 : <%=username %>
</body>
</html>