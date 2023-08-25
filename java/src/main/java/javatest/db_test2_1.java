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
public class db_test2_1 {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		Connection ct = null;
		System.out.println("문의 제목을 입력하세요");
		String title = sc.nextLine();
		System.out.println("고객명을 입력하세요");
		String name = sc.nextLine();
		//재귀함수로 핸들링
		//String result = new db_test2_1().passwordck();
		//무한 loop로 사용법	//do {}while(true); do~while문 무한루프
		String pw;
		for(;;) {
			System.out.println("패스워드를 입력하세요");
			pw = sc.nextLine();
			if(pw.length() < 6) {
				System.out.println("제발 좀 6자리 입력해주세요!!");
			}
			else {
				break;
			}
		}	
		
		System.out.println("내용을 입력하세요");
		String text = sc.nextLine();
		sc.close();
		
		dbconfig2 db = new dbconfig2();
		try {
			ct = db.info();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		String insert = "insert into board values ('0','"+title+"','"+name+"',password('"+pw+"'),'"+text+"',now())";
		PreparedStatement ps = ct.prepareStatement(insert); 
		
		int oksign = ps.executeUpdate(); 
		
		if(oksign == 1) { 
			System.out.println("저장이 잘 되었습니다.");
			ps.close();
			ct.close();
		}else{
			System.out.println("SQL 문법 오류로 인하여 저장 되지 않았습니다.");
		}
	}
}	
/*
	public String passwordck() {
		Scanner sc2 = new Scanner(System.in);
		System.out.println("패스워드를 입력하세요");
		String pw = sc2.nextLine();

		if(pw.length() < 6) {
			System.out.println("제발 좀 6자리 입력해주세요!!");
			new db_test2_1().passwordck(); //재귀함수
		}
	}			
*/

