package web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//Controller 파트(Servlet 으로 생성함, 하나만 있어도 됌)
public class main extends HttpServlet {
	//웹 통신에 사용하기 위한 암호화된 페이지 명시한 메모리 형태의 명령어
	private static final long serialVersionUID = 1L;

	//즉시실행 메소드(자기자신과 같은 클래스 메소드)
	public main() {
        super();
    }

    //HTML 에서 method = GET전송으로 넘어오면 여기서 처리
	/*
	 protected void doGet(HttpServletRequest request, HttpServletResponse
	 response) throws ServletException, IOException { String a = request.getParameter("data"); System.out.println(a); }
	 */

	/* 
	  HttpServletRequest : Front에서 값을 넘겨 받는 통신 언어
	  HttpServletResponse : 결과값을 출력 또는 Front로 return하는 통신 언어
	  getParameter : Front에 사용하는 name명 입니다. (모든 데이터는 문자 또는 boolean 형태로 구성)
	 */
	
	//HTML 에서 method = POST전송으로 넘어오면 여기서 처리
	 protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException { 
		 String a = request.getParameter("data");
			System.out.println(a);
	 }


}
