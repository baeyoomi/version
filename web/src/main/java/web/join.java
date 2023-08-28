package web;

import java.io.*;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class join extends HttpServlet {
	private static final long serialVersionUID = 1L;
    dbconfig db = null;
    PreparedStatement ps = null;
    public join() {
        super();
    }
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		String sid =  request.getParameter("uid").intern();
		String sname =  request.getParameter("uname").intern();
		String spass =  request.getParameter("upw").intern();
		String telcorp =  request.getParameter("ucom").intern();
		String shp =  request.getParameter("utel").intern();
		String semail =  request.getParameter("uem").intern();
		
		PrintWriter pw = response.getWriter(); //스크립트 출력 하려고 오픈
		
		if(sid=="" || sname==""|| spass=="" || telcorp==""||shp==""||semail=="") {
			pw.write("<script>"
					+ "alert('정보가 정상적으로 입력되지 않았습니다.');"
					+ "history.go(-1);"
					+ "</script>");
		}
		else { //원래는 모듈 써서 해야되는데 연습용이니까 걍 쓰자
			try {
				this.db = new dbconfig();
				Connection con = this.db.dbinfo();
				
				//String sql = "insert into shop values ('0','"+sid+"','"+sname+"',password('"+spass+"'),'"+telcorp+"','"+shp+"','"+semail+"',now(),'Y')"; //평문코드
				//람다식 형태의 코드로 작성
				String sql = "insert into shop values ("+"'0',?,?,password(?),?,?,?,now(),'Y')";  //람다식
				this.ps = con.prepareStatement(sql);
				this.ps.setString(1, sid);
				this.ps.setString(2, sname);
				this.ps.setString(3, spass);
				this.ps.setString(4, telcorp);
				this.ps.setString(5, shp);
				this.ps.setString(6, semail);
				int call = this.ps.executeUpdate();
				String msg ="";
				String msg2 ="";
				if(call > 0) {
					msg = "정상적으로 가입이 완료 되었습니다.";
					msg2 = "signin";
				}else {
					msg = "가입이 원활하게 진행 되지 않았습니다.";
					msg2 = "signup";
				}
				pw.write("<script>alert('"+msg+"'); location.href='./"+msg2+".html';</script>");
				this.ps.close();
				con.close();
				pw.close();
				
			}
			catch(Exception e) {
				System.out.println("Database 정보 오류!!");
			}
		}
	}

}
