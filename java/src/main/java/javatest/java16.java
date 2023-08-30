package javatest;


//Interface 활용
//Interface 일반 메소드를 활용할 수 있음
public class java16 {

	public static void main(String[] args) {
		new box6().a1();
		new box6().aa1();
		new box6().b1();

	}

}

//extends => abstract , 외부 클래스를 로드할 때
//interface => implements 무조건 Override를 활용해야함
class box6 implements inter1,inter2{

	@Override
	public void aa1() {
		inter1.super.aa1();  //상속
		//interface 안에 외부 클래스를 객체 및 인스턴스 생성 후 해당 메소드 호출
		inter1.zzz h = new inter1.zzz();
		h.zzjj();
	}
	@Override
	public void a1() {
		System.out.println("문자열을 입력하세요");
		String text = this.sc.nextLine();   //인스턴스에서 만들어서 가져왔기 때문에 import안해도 됌
		System.out.println(this.level);
		System.out.println(this.name);  //inter1.java에 있는 전역변수 값을 호출
		
	}
	@Override
	public void b1() {
		System.out.println(this.name);  //inter1.java에 있는 전역변수 값을 호출
		
	}
	@Override
	public String b2() {
		// TODO Auto-generated method stub
		return null;
	}
}