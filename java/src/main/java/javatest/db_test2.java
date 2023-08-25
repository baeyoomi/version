package javatest;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

/*
 Java + Database 응용편1
 게시판을 작성하는 프로세서를 제작합니다.
 문의제목, 고객명, 패스워드는 6자리 이상, 문의 내용
 단, 패스워드는 암호화하지 않고 제작합니다. 패스워드 6자리 이하 입력시 DB에 저장 안됩니다.

*/
public class db_test2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Connection ct = null;
		
		try {
			dbconfig2 db = new dbconfig2();
			ct = db.info();
			System.out.println("문의 제목을 입력하세요");
			String title = sc.nextLine();
			System.out.println("고객명을 입력하세요");
			String name = sc.nextLine();
			System.out.println("패스워드를 입력하세요");
			String pw = sc.nextLine();
						
			if(pw.length() < 6) {
				System.out.println("6자 이상 입력 가능");
				new db_test2().main(null); //재귀함수
			}

			System.out.println("내용을 입력하세요");
			String text = sc.nextLine();
			
			
			String insert = "insert into board values ('0','"+title+"','"+name+"',password('"+pw+"'),'"+text+"',now())";
			
			PreparedStatement ps = (PreparedStatement) ct.prepareStatement(insert); 

			int oksign = ps.executeUpdate(); 
			
			if(oksign == 1) { 
				System.out.println("저장이 잘 되었습니다.");
				ps.close();
				ct.close();
			}else{
				System.out.println("SQL 문법 오류로 인하여 저장 되지 않았습니다.");
			}
		}
		catch(Exception e) {
			System.out.println("DB 정보가 올바르지 않습니다.");
		}
		
	}

}
