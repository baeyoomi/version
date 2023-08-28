package javatest;

import java.util.ArrayList;

//오버로딩, 오버라이드 (추상클래스, Thread, interface, Network, I/O)
/*
overloading : 자식 메소드에서 새로운 메소드를 정의하여 코드를 작성하는 형태
override : 부모 클래스에 있는 메소드를 상속 받아서 동일한 형태의 메소드 구조를 사용하여 코드를 작성하는 형태
*/
public class java11 {

	public static void main(String[] args) {
		box3 b = new box3();
		b.abc();
		b.abc("아이디", "이메일");
		b.ccc("홍길동");

	}

}


class box2{
	public void abc() {
		System.out.println("부모 외부 내용 값");
	}
	public void abc(String a,String b) {
		System.out.println("추가 오버라이드 메소드 값");
	}
	public void abc(String a,int idx) {
		System.out.println("회원 idx 메소드 값");
	}
	public void abc(String a,int tel,int nember) {
		System.out.println("회원 정보 메소드 값");
	}
}

class box3 extends box2 {
	//오버라이드
	@Override   //부모 상속 받은 메소드를 조금이라도 인자값 변화 사용시 오버라이드는 사용하지 못함 
	public void abc() {
		System.out.println("자식 내용 값");
		super.abc(); //부모 외부 내용 값
	}
	@Override
	public void abc(String a, String b) {
		super.abc(a, b);
	}
	
	
	//오버로딩 (상속받은 내용 외 자식에서 만들어진 단독 메소드 , 상속을 안받은 클래스 안에서는 그냥 메소드임)
	public void abc(ArrayList<String> a) {	
		
	}
	public void ccc(String name) {
		System.out.println("오버로딩에 사용되는 값");
	}
}