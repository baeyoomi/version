package javatest;

import java.sql.*;
import java.util.*;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class homeworkmember extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public homeworkmember() {

        super();
    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		PrintWriter prw = response.getWriter();
		
		class membership2 {
			Scanner sc = new Scanner(System.in);
			Connection ct = null;
			public void abc() throws Exception {
				dbconfig db = new dbconfig();
				ct = db.info();

				String type = request.getParameter("type").intern();
				String id = request.getParameter("type").intern();
				String pw = request.getParameter("type").intern();
				String name = request.getParameter("type").intern();
				String tel = request.getParameter("type").intern();
				String email = request.getParameter("type").intern();
				String binum = request.getParameter("type").intern();

				String insert = "insert into membership values ('0','"+type+"','"+id+"',password('"+pw+"'),'"+name+"','"+tel+"','"+email+"','"+binum+"',now())";
				
				PreparedStatement ps = (PreparedStatement) ct.prepareStatement(insert); 

				int oksign = ps.executeUpdate(); 
				
				String msg ="";
				if(oksign == 1) { 
					System.out.println("저장이 잘 되었습니다.");
					msg = "<script>alert('저장이 잘 되었습니다.')</script>";
					ps.close();
					ct.close();
				}else{
					System.out.println("SQL 문법 오류로 인하여 저장 되지 않았습니다.");
					msg = "<script>alert('저장 되지 않았습니다.')</script>";
				}
			}
		}
	
	}

}
