package javatest;

import java.util.*;

/*
 응용문제 1
 외부 클래스명 data2 를 활용하여 조건문을 완성하는 코드를 작성하시오.
 "첫번째 숫자를 입력합니다."
 "두번째 숫자를 입력합니다."
 어느 값이 큰값인지 콘솔로 출력하시오.
 단, 첫번째,두번째 숫자 중 하나라도 미 입력시 대호출 되도록 합니다.
*/
public class java5 {

	public static void main(String[] args) {
		new data2().abc();

	}

}

class data2{
	Scanner sc = null;
	//intern(), equals() : 문자에서 사용가능
	//숫자 : 연산기호 (==,===,!=,>=,<=,<,>)
	public void abc() {

		this.sc=new Scanner(System.in);
		System.out.println("더! 큰! 값! 구! 하! 기!");
		
		System.out.println("첫번째 숫자를 입력해주세요.");
		String ina = this.sc.nextLine().intern();
		//int ina = this.sc.nextInt();
		
		System.out.println("두번째 숫자를 입력해주세요.");
		String inb = this.sc.nextLine().intern();
		//int inb = this.sc.nextInt();
		
		/*
		if(aa == bb) {
			System.out.println("두 숫자가 같습니다");
			this.sc.close();
		}else if(aa > bb) {
			System.out.println(bb + " 보다 " +aa + " 이 더 큽니다");
			this.sc.close();
		}else{
			System.out.println(aa + " 보다 " +bb + " 이 더 큽니다");
			this.sc.close();
		}
		*/
		if (ina == "" || ina == null || inb == "" || inb == null) {   // "" 과 null은 다름
			/*
				|| (두 조건 중 하나라도 맞을경우)
				&& (모든 조건이 맞을 경우)
			*/
			abc();  //재호출
		}
		else {
			int aa = Integer.parseInt(ina);  // 또는 Integer.valueOf(0)
			int bb = Integer.parseInt(inb);
			if(aa > bb) {
				System.out.println(bb + " 보다 " +aa + " 이 더 큽니다");
				this.sc.close();
			}else if(aa < bb) {
				System.out.println(aa + " 보다 " +bb + " 이 더 큽니다");
				this.sc.close();
			}else{
				System.out.println("두 값이 같습니다");
				this.sc.close();
			}
		}
	}
}