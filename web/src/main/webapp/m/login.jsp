<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0"><!--모바일에서 필수-->
<title>모바일 로그인 페이지</title>
</head>
<script>

</script>

<body>
<header>  <!-- 메뉴 또는 로그인 -->
<%@ include file="./top.jsp" %>	
</header>

<main> 
<form name="f" method="post" action="./mlogin.do">
<section>
	<p>MEMBER-LOGIN</p>
	아이디 : <input type="text" name="mid" required="required"><br>
	패스워드 : <input type="password" name="mpass" required="required"><br>
	<button type="submit" style="font-weight: bold; cursor: pointer;">로그인</button>
</section>
</form>
</main>

<footer> <!-- copyright -->
<%@ include file="./copyright.jsp" %>	
</footer>
</body>

<!-- 로그인 되어있으면 무조건 메인페이지로 가게 만들기 --> 
<script>
var id = "<%=user_id %>";
var nm = "<%=user_name %>";
if (id != "" && nm != ""){    //toString으로 문자열 전환할 경우 배열이기 때문에 공백 "",(String)으로 전환할 경우 "NULL", String.valueOf로 전환할 경우 NULL
	location.href="./index2.jsp";
}
</script>
</html>