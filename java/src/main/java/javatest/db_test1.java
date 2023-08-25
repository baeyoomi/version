package javatest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

/*
 응용편 Java + Database
 Libery 추가필요
*/
public class db_test1 {
	
	public static void main(String[] args) {
		/*
		String times = new timezone().now_time(3);
		System.out.println(times);
		*/
		Scanner sc = new Scanner(System.in);
		Connection ct = null;
		
		try {
			dbconfig2 db = new dbconfig2();
			ct = db.info();
			//System.out.println(ct.toString()); //DB접속 확인
			System.out.println("제목을 입력하세요");
			String subject = sc.nextLine();
			
			//DB문법
			//String insert = "insert into webmail values ('0','이종혁','jh@nate.com','서울에 산이 없어요??','서울산업대...',now())";
			String insert = "insert into webmail values ('0','" + "이름" +"','" +"이메일"+"','"+subject+"','서울산업대...',now())";
			
			PreparedStatement ps = (PreparedStatement) ct.prepareStatement(insert); //SQL문법을 작업 준비과정
			/*
			execute() : select 문법에만 사용
			executeUpdate() : insert, update, delete, alter, create 문법에 사용
			*/
			int oksign = ps.executeUpdate();   //SQL에 Query에 대한 값은 숫자로 처리
			
			if(oksign == 1) {    //1 정상저장
				System.out.println("저장이 잘 되었습니다.");
				ps.close();
				ct.close();
			}else{  //0 저장 오류, SQL 문법오류, DB접속오류, 컬럼에 대한 범위오류
				System.out.println("SQL 문법 오류로 인하여 저장 되지 않았습니다.");
			}
		}
		catch(Exception e) {
			System.out.println("DB 정보가 올바르지 않습니다.");
		}
	}

}


class dbconfig2 {  //Database 접속 환경 설정 class
	//Connection : Interface 사용
	public static Connection info() throws Exception {
		String db_drive = "com.mysql.jdbc.Driver";
		String db_url = "jdbc:mysql://localhost:3306/web";
		String db_user = "hong";
		String db_pass = "a123456";
		
		Class.forName(db_drive);
		Connection con = DriverManager.getConnection(db_url,db_user,db_pass);
		
		return con;
	}
	
	
}



