<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>
<% 
	/* response.addHeader : CORS(도메인 다른경우, 외부서버에서 접속을 할 때 보안상 접속을 자동차단)- 접속허가를 해주는 클래스, "*" 모든 접속자 허가 */
	response.addHeader("Access-Control-Allow-Origin", "*");  
	response.addHeader("Access-Control-Allow-Credentials", "true");
	
	/* intern() : 해당되는 문자열을 비교해주는 클래스 , 예를들어 equlse 사용했던거 */
	String userid = request.getParameter("mid").intern();
	String msg = "";
	if(userid=="admin"){
		msg = "no";
	}
	else if(userid==""){
		msg= "error";
	}
	else{
		msg = "yes";
	}
	out.print(msg);
%>