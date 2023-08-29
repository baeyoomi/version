package javatest;

import java.util.Arrays;
import java.util.Scanner;

/*
 숙제.
 추상클래스 + 중첩클래스를 이용하여 프로세서를 제작합니다.
 추상클래스에서는 father라는 이름을 가지고 있으며,
 메소드는 f_method라는 이름을 가집니다.
 또한 변수도 u_name이라는 문자형 변수를 생성합니다.
 f_method에 문자형으로 인자값을 하나 받는 형태로 제작합니다.
 
 메인에서 Scanner를 이용하여 사용자 이름을 입력하는 프로세서를 구성합니다.
 구성 후 외부 클래스로 f_method로 값을 전달함

 전달된 값을 자식 클래스에 전달하며, 해당 메소드에 다음과 같이 처리합니다.
 홍길동,이순신,유관순은 일반회원 입니다. 라고 출력을 하며,
 강감찬,장보고는 실버회원 입니다. 라고 출력합니다.
 그 외 사용자 이름을 입력시 "해당 사용자는 비회원 입니다." 라고 출력 되도록하시오.
*/
public class work6 {
	
	public static void main(String[] args) {
		legend lg = new legend();
		lg.f_method("회원정보");
	}

}


abstract class father {
	public String u_name = null;
	public abstract void f_method(String a);
}

class legend extends father{
	Scanner sc = null;
	String aa[] =null;
	String bb[] =null;
	@Override
	public void f_method(String a) {
		this.sc = new Scanner(System.in);
		this.aa = new String[] {"홍길동","이순신","유관순","강감찬","장보고"};
		String level[] = {"일반회원","실버회원","비회원"};
		
		System.out.println("회원 이름을 검색해주세요");
		this.u_name = this.sc.nextLine().intern();
		
		String msg = "";
		String type = "";
		int i=0;
		for(i=0; i< this.aa.length; i++) {
			if(this.u_name == this.aa[0].intern() ||this.u_name == this.aa[1].intern() || this.u_name == this.aa[2].intern()) {
				msg = this.u_name + " 님은 ";
				type = level[0];
			}
			else if(this.u_name == this.aa[3].intern() ||this.u_name == this.aa[4].intern()) {
				msg = this.u_name + " 님은 ";
				type = level[1];
			}
			else {
				msg = "해당 사용자는 ";
				type = level[2];
			}
		}
		System.out.println(msg + type + " 입니다." );
		
		/*
		String[] aa = {"홍길동", "이순신", "유관순", "강감찬", "장보고"};
		String[] level = {"일반회원", "실버회원", "비회원"};

		System.out.println("회원 이름을 검색해주세요");
		String u_name = sc.nextLine();

		String type = "";
	    for (int i = 0; i < aa.length; i++) {
	      if (u_name.equals(aa[i])) {
	        if (i < 3) {
	          type = level[0];
	        } else {
	          type = level[1];
	        }
	        break;
	      }
	    }
	    if (type.isEmpty()) {
	      type = level[2];
	    }
	    System.out.println(u_name + " 님은 " + type + " 입니다."); 
		 */
		
	}
	
	class son {
		//method 생성 및 결과값 출력
	}
}
