package javatest;

import java.util.Scanner;

public class homework10 {

	public static void main(String[] args) {
		legend lg = new legend();
		lg.f_method("회원정보");
		legend.son ss = lg.new son();
		ss.f_son();
	}

}
abstract class father {
	Scanner sc = null;
	String user[] =null;
	String level[] =null;
	public String u_name = null;
	public abstract void f_method(String a);
}

class legend extends father{
	@Override
	public void f_method(String name) {
		this.u_name = name;
		this.user = new String[] {"홍길동","이순신","유관순","강감찬","장보고"};
		this.level = new String[] {"일반회원","실버회원","비회원"};
		
		
	}
	
	class son {
		Scanner sc = legend.this.sc;
		String u_name = legend.this.u_name;
		String user[] = legend.this.user;
		String level[] = legend.this.level;
		public void f_son() {
			this.sc = new Scanner(System.in);
			
			System.out.println("회원 이름을 검색해주세요");
			this.u_name = this.sc.nextLine().intern();
			
			String type = "";
			String msg = "";
			for (int i = 0; i < user.length; i++) {
				if (u_name.equals(user[i])) {
					if (i < 3) {
						type = level[0];
						msg = u_name + " 님은 ";
					} else {
						type = level[1];
						msg = u_name + " 님은 ";
					}
					
					break;
				}
			}
			if (type == "") {
				type = level[2];
				msg = "해당 사용자는 ";
			}
			System.out.println(msg + type + " 입니다.");
		}
	}
}