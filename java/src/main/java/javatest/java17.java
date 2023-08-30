package javatest;

import java.sql.*;



//interface 활용
public class java17 {

	public static void main(String[] args) {
		try {
			//각각의 별도로 적용되는 인스턴스
			/*
			//하나의 객체를 이용하여 new 인스턴스 활용이 필요함
			new box7().dbconnect("hong", "a123456", "web");
			new box7().select("shop", "test");
			*/
			box7 bx = new box7();
			bx.dbconnect("hong", "a123456", "web");  //2. 인자값에 내용 써줌
			bx.select("shop", "test"); 
		}
		catch(Exception e) {
			System.out.println("DB 정보가 올바르지 않습니다.");
		}
	}

}

//calss 일때 new 인스턴스 활용. 단, interface일 때는 interface명으로 활용
class box7 implements setdb {
	Connection con =null;
	PreparedStatement ps = null;
	/* @Override //이런 방식도 있음
	public void dbconnect() {
		try {Connection con = setdb.info();}
		catch(Exception e) {System.out.println("DB 연결오류!!");}
	}*/
	
	@Override
	public void dbconnect(String user, String passwd, String db) throws Exception {		
		this.con = setdb.info(user,passwd,db);		
	}
	
	@Override
	public void select(String table, String dataid) {
		try {		
			String sql = "select * from " + table + " where sid = ?";
			this.ps = this.con.prepareStatement(sql);
			this.ps.setString(1, dataid);    // ''외따옴표 자동으로 붙음
			ResultSet rs = this.ps.executeQuery();
			
			while(rs.next()) {
				System.out.println(rs.getString("sname"));
				System.out.println(rs.getString("scom"));
				System.out.println(rs.getString("stel"));
				System.out.println(rs.getString("semail"));
			}
			this.ps.close();
			this.con.close();
			
		}
		catch (Exception e) {
			System.out.println("SQL 문법 및 컬럼 확인");
		}
	}
}