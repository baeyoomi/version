package web;
//Module 파트
public class index {
	
	//필드를 사용하면 좋은점 this를 쓸수 있음
	int sum = 0;
	
	public String test(String a, String b) {
		/* 
		 Integer.valueOf  : 문자를 숫자로 변환시 해당 값이 숫자인지 문자인지 검토 후 int로 변환을 설정 
		 Integer.parseInt : 문자를 숫자(int 형으로 변환)
		 Integer.toString : 숫자를 문자로 변환
		 */
		this.sum = Integer.valueOf(a) + Integer.parseInt(b);
		
		/*
		 return 메소드 자료형이 문자 이므로 결과값을 리턴시킬 경우
		 숫자를 문자화하여 반환함 
		 */
		// return Integer.toString(this.sum); 이것도 되고 밑에껏도 됌
		return String.valueOf(this.sum);
	}
	
	public String test2(int a, int b) {
		this.sum = a +b ;
		double d = 21.5;
		int dd = (int)d; //형변환(casting 변환), 자동형변환
		return String.valueOf(this.sum);
	}
}
