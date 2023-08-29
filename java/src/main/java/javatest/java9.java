package javatest;

import app.app1;    //패키지명. public class명
//import : 기져오는 기능, export : 내보내는 기능

/* 1. 패키지가 다를경우 public class 핸들링 */

public class java9 {
	//package app(app1.java) 연계 프로세서
	public static void main(String[] args) {
		//다른 패키지에 있는 public class만 호출하여 가져올 수 있음
		app1 ap = new app1();
		//ap.abc();
		ap.main(args);
		
		//new abox().dataload(); 대신
		ddd[] d = {new abox(), new bbox(), new cbox()};   //추상클래스를 상속받아서 처리하는 class를 배열화하여 순차적으로 작동시키는 형태
		
		//반복문으로 배열에 있는 class를 순차적으로 실행 시키는 상황
		int w = 0;
		while (w <d.length) {
			if(w != 1) {    //해당 class외에 다른 class만 실행
				d[w].dataload();
			}
			w++;
		}
		/* 이건 작동은 되는데 break를 걸수가 없음
		for(ddd z : d) {
			z.dataload();
		}
		*/
	}

}

// abstract : 추상클래스 + 추상메소드 (프레임워크에서 활용)
/*
 public class가 없을 경우 abstract에서도 public로 핸들링 할 수 있으며,
 단, public class가 있을 경우 default로 abstract를 이용합니다.

 접근제한 종류 : public(공개),protected(반공개-같은 class+같은 package + 하위 class), default(같은 class+같은 package, 해당 파일에서 활용하는 변수 선언) ,private(같은 class)  : 접근에 해당됌
*/
abstract class ddd {
	public String userid = "guest";    //공용으로 사용하는 변수(this를 모두 활용가능)
	public String useremail = null;
	public int userpoint = 0;
	public int a,b,c,d;
	
	public abstract void dataload();
	//public abstract void datainsert(); 선언했으면 내용이 없더라도 오버라이드 꼭 해줘야한다
}
class abox extends ddd {

	@Override
	public void dataload() {
		this.userpoint = 2500;
		System.out.println(this.userpoint);
		System.out.println("abox 클래스");
	}
}
class bbox extends ddd{

	@Override
	public void dataload() {
		System.out.println("bbox 클래스");
	}
}
class cbox extends ddd{

	@Override
	public void dataload() {
		System.out.println("cbox 클래스");
	}
}