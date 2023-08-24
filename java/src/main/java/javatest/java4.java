package javatest;

public class java4 {    //같은 파일명에 public class 는 단 하나만 존재하며, class를 만들고 싶다면 public이 없이 써야한다. public이 없이 다른 클래스를 만들어 쓸수 있다.
	int a,b = 0;
	
	
	public void java1() {
		this.a = 20;
		this.b = 30;
		java2();      //같은 클래스에서 해당 메소드로 실행
	}
	
	public void java2() {
		int sum = this.a + this.b;
		System.out.println(sum);
	}
}
