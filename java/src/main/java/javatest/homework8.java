package javatest;

import java.sql.*;
import java.util.Arrays;
import java.util.Scanner;

/*
숙제 4
MEMBER-SHIP
Java + Database
*/
public class homework8 {

	public static void main(String[] args) {
		try {
			membership mbship = new membership();
			mbship.abc();
		}
		catch(Exception e) {
			System.out.println("오류 입니다.");
		}

	}

}

class membership {
	Scanner sc = new Scanner(System.in);
	Connection ct = null;
	public void abc() throws Exception {
		String id = null;
		String pw = null;
		String name = null;
		String tel = null;
		String email = null;
		String binum = null;
		dbconfig db = new dbconfig();
		ct = db.info();
		System.out.println("1.일반가입 / 2.사업자가입");
		String type = sc.nextLine().intern();
		if(type=="1") {
			type = "General";
			System.out.println("아이디를 입력하세요");
			id = sc.nextLine();
			System.out.println("패스워드를 입력하세요");
			pw = sc.nextLine();
			System.out.println("고객명을 입력하세요");
			name = sc.nextLine();
			for(;;) {
				System.out.println("전화번호 또는 휴대전화번호를 입력하세요 (숫자만 가능)");
				tel = sc.nextLine();
				try {
					if(tel.length() != 11) {
						System.out.println("다시 한번 확인해주세요");
					}
					else {
						Integer.parseInt(tel);
						break;
					}					
				}
				catch(NumberFormatException ne) {
					System.out.println("숫자만 입력하세요");
				}
			}
			System.out.println("이메일을 입력하세요");
			email = sc.nextLine();
		}
		else if(type=="2"){
			type="Business";
			System.out.println("아이디를 입력하세요");
			id = sc.nextLine();
			System.out.println("패스워드를 입력하세요");
			pw = sc.nextLine();
			System.out.println("고객명을 입력하세요");
			name = sc.nextLine();
			/*
			for(;;) {
				System.out.println("전화번호 또는 휴대전화번호를 입력하세요 (숫자만 가능)");
				tel = sc.nextLine();
				try {
					if(tel.length() != 11) {
						System.out.println("다시 한번 확인해주세요");
					}
					else {
						Integer.parseInt(tel);
						break;
					}					
				}
				catch(NumberFormatException ne) {
					System.out.println("숫자만 입력하세요");
				}
			}
			*/
			int i;
			for (;;) {
				System.out.println("전화번호 또는 휴대전화번호를 입력하세요 (숫자만 가능)");
				tel = sc.nextLine();
				for (i = 0; i <= 1; i++) {
					char c = tel.charAt(i);
					if (!Character.isDigit(c)) {
						System.out.println("숫자만 입력하세요");
						break;
					}
				}
				if(tel.length() != 11) {
					System.out.println("다시 한번 확인해주세요");
				}
				else {
					break;
				}
			}
			System.out.println("이메일을 입력하세요");
			email = sc.nextLine();
			for(;;) {
				System.out.println("사업자번호를 입력하세요");
				binum = sc.nextLine();							
				if(binum.length() != 10) {
					System.out.println("10자리 입력해주세요");
				}
				else {
					break;
				}
			}
		}
		else {
			System.out.println("1 or 2 중 선택 해주세요");
			new membership().abc();
		}
		

		String insert = "insert into membership values ('0','"+type+"','"+id+"',password('"+pw+"'),'"+name+"','"+tel+"','"+email+"','"+binum+"',now())";
		
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
 	다음 과제땐 배열로 질문 사용해보기 
		String q[] = {"고객명을 입력하세요?","아이디를 입력하세요?","패스워드를 입력하세요?"};
		Scanner sc = new Scanner(System.in);
		String a[] = new String[q.length];
		int w = 0;
		while (w < q.length) {
			System.out.println(q[w]);
			a[w] = sc.nextLine();
			w++;
		}
		System.out.println(Arrays.toString(a));
*/
