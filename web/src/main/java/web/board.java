package web;

import java.io.*;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class board extends HttpServlet {
	private static final long serialVersionUID = 1L;
    dbconfig db = null;
    PreparedStatement ps = null;       
     public board() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		String uid =  request.getParameter("uid").intern();
		String upw =  request.getParameter("upw").intern();
		
		this.db = new dbconfig();
		PreparedStatement ps = null;
		try {
			Connection con = db.dbinfo(); 
		}
		catch(Exception e) {
			System.out.println("DB 접속 오류 사항 발생!");
		}
	}

}
