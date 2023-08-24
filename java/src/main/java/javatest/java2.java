package javatest;
/*
public class java2 {

	public static void main(String[] args) {
		String user = "홍길동";
		System.out.println(user);
	}

}
*/
//this : 외부 class에서 사용가능
class abc{
	//필드 영역
	String data ="";    //일반 변수 선언
	static String data2="";   //메모리에 변수값을 생성시켜 놓음
	int number = 100;
	int aa,bb,cc = 0;    //기본값 적용
	final String adata ="이순신";    //상수 값변경이 불가능
	
	public abc() {   //즉시 실행 메소드
		this.data = "20";
		this.data2 = "30";   //글씨가 기울어진 이유
		System.out.println(this.data);

	}
	public void data() {   //일반 메소드
		String user = "홍길동";
		System.out.println(user);	
		System.out.println(this.aa);
		System.out.println(this.bb);
		System.out.println(this.cc);
	}
	
	//static을 사용하는 이유: 자주쓰는 함수를 메모리에 올려놓음
	public static void data2() {   //메모리 등록 메소드
		String user2 = "이순신";
		System.out.println(user2);
	}

	String data3(int a, int b) { 	//return 메소드
		int sum = a+ b;
		this.data2 = String.valueOf(sum);   //숫자를 문자로 변환
		return this.data2;
	}
	
	//void가 있으면 100% 리턴없음
	public int data4(String a, String b) {
		int sum = Integer.parseInt(a)+Integer.valueOf(b);  //문자를 숫자로 변환
		return sum;
	}
}