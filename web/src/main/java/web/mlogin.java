package web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/*
응용문제1.
모바일 login.jsp에서 넘어온 아이디,패스워드를 이용하여
session을 통하여 정상적으로 로그인이 되도록 하며,
로그인이 완료되었을 경우 index.jsp로 이동 되도록 합니다.

아이디/패스워드 (Free)
단,session은 아이디와 이름만 생성합니다.
session명은 다음과 같습니다.
아이디 : perid
이름 : pernm
아이디와 패스워드가 하나라도 미일치시 "회원정보를 다시한번 확인하세요"
*/
@WebServlet("/m/mlogin.do")
public class mlogin extends HttpServlet {
	PrintWriter pw =null;
	HttpSession session = null;
	RequestDispatcher rd = null;
	
	private static final long serialVersionUID = 1L;
       
    public mlogin() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		
		String mid = request.getParameter("mid").intern();
		String mpass = request.getParameter("mpass").intern();
		this.pw = response.getWriter();
		
		if(mid == "" || mpass == "") {
			this.pw.write("<script>alert('정상적인 접근 방식이 아닙니다.'); history.go(-1);</script>");
		}
		else {
			if(mid == "bae" && mpass == "1234") {
				this.session = request.getSession();
				this.session.setAttribute("perid", mid);
				this.session.setAttribute("pernm", "배유미");

				this.pw.write("<script>alert('로그인 되셨습니다.');"
						+"location.href='./index2.jsp';"
						+"</script>");
			}
			else {
				this.pw.write("<script>alert('회원정보를 다시한번 확인하세요'); history.go(-1);</script>");
			}
		}
		this.pw.close();

	}

}
