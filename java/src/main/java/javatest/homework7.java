package javatest;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

/*
숙제 3
2023년도 기후위기 설문조사
Java + Database
*/
public class homework7 {

	public static void main(String[] args) {
		try {
			crisis cr = new crisis();
			cr.abc();
		}catch(Exception e) {
			System.out.println("오류입니다");
		}
	}
}

class crisis {
	Scanner sc = new Scanner(System.in);
	Connection ct = null;

	public void abc() throws Exception {
		String gender =null;
		String age = null;
		String cri = null;
		
		dbconfig db = new dbconfig();
		ct = db.info();
		
		for(;;) {
			System.out.print("당신의 성별은? ");		
			System.out.println(" 1. 남성 | 2. 여성 ");
			gender = sc.nextLine().intern();
			if(gender=="1") {
				gender = "남성";
				break;
			}else if(gender == "2") {
				gender = "여성";
				break;
			}
			System.out.println("제발 번호 중에 하나만 써라잉");
		}
		
		for(;;) {
			System.out.print("당신의 연령층은? ");
			System.out.println(" 1.10대 | 2.20대 | 3.30대 | 4.40대 | 5.50대 이상");
			age = sc.nextLine().intern();	
			if(age == "1") {
				age="10대";
				break;
			}else if(age == "2") {
				age="20대";
				break;
			}else if(age == "3") {
				age="30대";
				break;
			}else if(age == "4") {
				age="40대";
				break;
			}else if(age == "5") {
				age="50대"; 
				break;
			}
			System.out.println("제발 번호 중에 하나만 써라잉");
		}
		
		for(;;) {
			System.out.print("현재 기후 단계수준은? ");
			System.out.println(" 1. 매우 심각하다 | 2. 심각하다 | 3. 보통이다 | 4. 심각하지 않은 편이다");
			cri = sc.nextLine().intern();
			if(cri=="1") {
				cri = "매우 심각하다";
				break;
			}else if(cri=="2") {
				cri = "심각하다";
				break;
			}else if(cri=="3") {
				cri = "보통이다";
				break;
			}else if(cri=="4"){
				cri = "심각하지 않은 편이다";
				break;
			}
			System.out.println("제발 번호 중에 하나만 써라잉");
		}
		
		String insert = "insert into crisis values ('0','"+gender+"','"+age+"','"+cri+"',now())";
		//System.out.println(insert);
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
}
