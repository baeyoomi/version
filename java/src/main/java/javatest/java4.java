package javatest;

import java.util.*;   //util 모든 라이브러리 불러오기

//public이 전혀 없이 클래스만 사용해도된다
class data1{   //외부 클래스
	Scanner sc = null;

	static String a1 = null;
	static int b1 = 0;
	static String c1 = null;
	
	public void abc(String a, int b, String c) {
		this.a1 = a;
		this.b1 = b;
		this.c1 = c;
		
		System.out.println("고객명 및 패스워드 체크!!");
		this.sc = new Scanner(System.in);  //사용자가 입력하는 형태
		
		//숫자로 받을건지 문자로 받을건지 지정하는 부분
		System.out.println("고객명을 입력하세요!");
		String usernm = this.sc.nextLine();   //next() 홍길동 이순신 입력시 홍길동 출력
											 //nextline(); 홍길동 이순신 입력시 홍길동 이순신 출력
		System.out.println("패스워드를 입력하세요!");
		String userpw = this.sc.nextLine().intern(); //사용자가 입력한 값, intern()사용시 연산기호 사용가능
		
		if(usernm.equals("홍길동")) {  //intern() 미사용, String이라 연산기호 못씀
			if(userpw=="a1234") {  //intern() 사용
				System.out.println("등록된 사용자 입니다.");
				this.sc.close();
			}
			else {
				System.out.println("패스워드를 확인하세요.");
				abc(this.a1,this.b1,this.c1);   //재귀메소드(재귀함수) : 자신의 메소드를 재호출
			}
		}
		else {
			System.out.println("해당 고객은 가입되지 않았습니다.");
			System.exit(0);
		}
	}
}

public class java4 {    //메인 클래스 //같은 파일명에 public class 는 단 하나만 존재하며, class를 만들고 싶다면 public이 없이 써야한다. public이 없이 다른 클래스를 만들어 쓸수 있다.
	int a,b = 0;
	
	
	public void java1() {
		this.a = 20;
		this.b = 30;
		java2();      //같은 클래스에서 해당 메소드로 실행
	}
	
	public void java2() {
		int sum = this.a + this.b;
		//System.out.println(sum);
	}
}
