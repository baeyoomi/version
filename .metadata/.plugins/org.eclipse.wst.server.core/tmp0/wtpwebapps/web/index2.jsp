<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>결과값 출력 View 파트</title>
</head>
<body>
<!-- request.getAttribute : Controller에서 가상 객체명을 받아서 출력하는 메소드 입니다. -->

결과값 : <%=request.getAttribute("total") %>
<br>
고객명 : <%=request.getAttribute("name") %>
<br><hr><br>
<div id="box"></div>
<div id="box2"></div>
</body>
<script>
//Controller 데이터 값을 자바스크립트 변수로 받은 후 HTML에 직접 출력하는 형태
var total = "<%=request.getAttribute("total") %>";
var name = "<%=request.getAttribute("name") %>";
document.getElementById("box").innerHTML = "최종데이터 : " + total;
document.getElementById("box2").innerHTML = "고객명 : " + name;
</script>
</html>