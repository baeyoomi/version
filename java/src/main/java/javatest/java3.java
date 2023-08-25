package javatest;
//static + if문 + Scanner


public class java3 {

	public static void main(String[] args) {    //실행 메소드
		//new java4().java1();
		
		java3_data jd = new java3_data();  //인스턴스 생성
		jd.abc();
		jd.abc();
		java3_data jd2 = new java3_data();  //인스턴스 생성
		jd2.abc();
		
		data1 d = new data1();  //java4에 있는 외부클래스
		d.abc("홍길동",25,"a12345");    //해당 메소드를 로드 및 인자값
	}

}

//static 과 일반 변수 선언에 따른 차이
class java3_data{
	int a = 10;
	static int b = 10;
	
	public void abc() {
		/*
		System.out.println("-----------------");
		System.out.println("a 값 : " + this.a);
		System.out.println("b 값 : " + this.b);
		//this.a = 20;
		//this.b = 20;
		this.a = this.a + this.a;
		this.b = this.b + this.b;
		System.out.println("-----------------");
		System.out.println("a 값 : " + this.a);
		System.out.println("b 값 : " + this.b);
		*/
	}
}