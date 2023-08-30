package javatest;

import java.sql.Connection;
import java.sql.DriverManager;

//java17번에 활용

//DB활용 인터페이스 및 각종 문법
public interface setdb {
	//해당 필드에 사용되는 변수는 final형태로 상수화 되어버리는 상황입니다.

	//public void dbconnect();  //중요* 메소드 안에 info() 만들어줄수 있음  //이런 방식도 있음
	public void dbconnect(String user, String passwd, String db) throws Exception ;  //1. 인자값 갯수와 설정
	
	public void select(String table,String dataid);
	/*
	public void delete(int idx);
	public void update(String dataid,int idx);
	public void insert(String[] a);
	*/
	
	public static Connection info(String user, String passwd, String db) throws Exception { //2. 얘도 설정
		String db_drive = "com.mysql.jdbc.Driver";  //Driver.jdbc.mysql.com
		String db_url = "jdbc:mysql://localhost:3306/"+db;  //web
		String db_user = user; //"hong"
		String db_pass = passwd; //"a123456"
		
		Class.forName(db_drive);
		Connection con = DriverManager.getConnection(db_url,db_user,db_pass);
		
		return con;
	}
}
