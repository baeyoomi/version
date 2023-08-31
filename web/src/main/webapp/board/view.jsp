<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//문자열로 getAttribute변환
	/* 문자열변환 방식 3가지
	String url = request.getAttribute("dbfile").toString();
	String url = (String)request.getAttribute("dbfile"); 
	*/
	String url = String.valueOf(request.getAttribute("dbfile"));
	out.print("<script>alert('정상적으로 첨부파일이 저장 완료 되었습니다');</script>");
%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title>게시물 확인</title>
</head>
<body>
<a href="<%=url%>">[첨부파일]</a>
</body>
</html>