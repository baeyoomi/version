<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0"><!--모바일에서 필수-->
<title>모바일 웹페이지</title>
</head>
<body>
<header>  <!-- 메뉴 또는 로그인 -->
<%@ include file="./top.jsp" %>

</header>

<main> <!-- banner,입력 등등 모든 웹을 구성 -->
<section>
<%@ include file="./reserve.jsp" %>	
</section>
</main>

<footer> <!-- copyright -->
<%@ include file="./copyright.jsp" %>	
</footer>
</body>
</html>