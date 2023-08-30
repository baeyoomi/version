package javatest;

import java.util.Scanner;

public interface inter1 {
	String name="홍길동";  //필드에 적용된 전역 변수
	String userid="hong";
	Scanner sc = new Scanner(System.in);   //처음부터 객체와 인스턴스를 활용하여 api class를 생성시킴
	
	public void a1();  //일반 메소드
	//public void a1(String a);
	
	
	/*
	 Override 필수로 하지 않고 필요할 때만 로드하여 사용할 때 default를 이용함
	 */
	default void aa1() {   //클래스에서는 "메소드" 작성시 default를 쓰지 않아도 되지만 인터페이스는 써줘야 한다. 코드 규격화에 용이하다
		System.out.println(this.userid);
	}
	
	class zzz {   //interface안에 자식 클래스를 사용
		public void zzjj() {   //자식 클래스 메소드
			System.out.println("interface안에 외부 클래스 활용!!");
		}
	}
}
