package javatest;

import java.util.Arrays;
import java.util.Scanner;

/*
숙제1  - java

"개인정보 수집 및 이용동의 (Y/N)"
"이메일 수집 및 이용동의 (Y/N)"
"통합서비스 약관 이용동의 (Y/N)"
해당 동의를 모두 Y를 하였을 경우
"서비스 이용약관에 모두 동의 하셨습니다." 
콘솔이 출력 단, 하나라도 N이 적용시 다시 처음부터 약관 동의 내용이 출력 되도록 합니다. 
*/
public class homework5 {

	public static void main(String[] args) {
		try {
			new consent().abc();
		}catch(Exception e) {
			System.out.println("오류 입니다");
		}

	}

}

class consent{
	Scanner sc = null;
	public void abc() {

		System.out.println("약관을 확인합니다");
		this.sc = new Scanner(System.in); 
		
		System.out.println("개인정보 수집 및 이용동의 ( Y / N )");
		String con1 = this.sc.next(); 
		System.out.println("이메일 수집 및 이용동의 ( Y / N )");
		String con2 = this.sc.next();
		System.out.println("통합서비스 약관 이용동의 ( Y / N )");
		String con3 = this.sc.next();
		
		byte[] aa = con1.getBytes();
		byte[] bb = con2.getBytes();
		byte[] cc = con3.getBytes();
		String aaa = Arrays.toString(aa).intern();
		String bbb = Arrays.toString(bb).intern();
		String ccc = Arrays.toString(cc).intern();
		
		String[] yn = {"Y","y","N","n"};  // 89,121,78,110
		byte[] yy = yn[0].getBytes();
		byte[] yy2 = yn[1].getBytes();
		byte[] nn = yn[2].getBytes();
		byte[] nn2 = yn[3].getBytes();
		String yyy = Arrays.toString(yy).intern();
		String yyy2 = Arrays.toString(yy2).intern();
		String nnn = Arrays.toString(nn).intern();
		String nnn2 = Arrays.toString(nn2).intern();
		
		if((aaa == yyy && bbb == yyy && ccc == yyy) || (aaa == yyy2 && bbb == yyy2 && ccc == yyy2)||(aaa == yyy && bbb == yyy && ccc == yyy2) || (aaa == yyy && bbb == yyy2 && ccc == yyy2)||(aaa == yyy2 && bbb == yyy2 && ccc == yyy)||(aaa == yyy2 && bbb == yyy && ccc == yyy)||(aaa == yyy && bbb == yyy2 && ccc == yyy||(aaa == yyy2 && bbb == yyy && ccc == yyy2))) {
			System.out.println("서비스 이용약관에 모두 동의 하셨습니다.");
		}
		else if(aaa == nnn || bbb == nnn || ccc == nnn || aaa == nnn2 || bbb == nnn2 || ccc == nnn2) {
			System.out.println("서비스 이용약관에 동의 하지 않으셨습니다.");
			abc();
		}
		else {
			System.out.println("Y / N 한글자만 입력가능합니다");
			abc();
		}
		
	}
}