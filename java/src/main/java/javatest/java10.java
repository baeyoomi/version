package javatest;
//즉시 실행 메소드 + 일반 메소드 부분
/*
 인자값에 대한 자료형 또는 인자값 갯수에 따라 여러개의 같은 이름을 가진
 즉시실행 메소드와 일반 메소드를 생성 시킬 수 있음
*/
import java.util.Scanner;

public class java10 {

	public static void main(String[] args) {
		box1 b = new box1();
		//box1 b2 = new box1("홍길동");
		//box1 b3 = new box1(30);
		//box1 b4 = new box1("김유신","유관순");
		b.box1();
		//b.box1("일반");
	}

}


class box1{   //인자값에 따라 메소드 이름은 같아도 다른 메소드로 인지 될 수 있다.
	Scanner sc = null;
	public box1() {  //즉시 실행 메소드 (construct)
		this.sc = new Scanner(System.in);
		System.out.println("즉시 실행 메소드1");
	}
	public box1(String a) {
		System.out.println("즉시 실행 메소드2");
	}
	public box1(int a) {
		System.out.println("즉시 실행 메소드3");
	}
	public box1(String b, String c) {
		System.out.println("즉시 실행 메소드3");
	}
	
	
	
	public void box1() {   //일반 메소드 구조가 다름
		System.out.println("일반 메소드1");
		String result = this.sc.nextLine();
	}
	public void box1(String a) {
		System.out.println("일반 메소드2");
	}
	public void box1(String b, String c) {
		System.out.println("일반 메소드3");
	}
	
	
	
	String box2() {
		return null;
	}
	String box2(String a) {
		return null;
	}

}