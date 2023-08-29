package javatest;

import java.util.*;

/*
	double loop 응용편 (do~while + for)
	다음결과값 처럼 출력되도록 하시오
	9*1 = 9
	9*2 = 18
	9*3 = 27
	8*1 = 8
	8*2 = 16
	8*3 = 24
	7*1 = 7
	7*2 = 14
	7*3 = 21
*/
public class java8 {

	public static void main(String[] args) {
		new data5().abc();
		
		/*
		 응용문제6.  Scanner를 이용하여 다음과 같이 결과값이 나오도록 합니다.
		 "구구단 2단~9단 까지 숫자를 하나 입력하세요 :"
		 사용자가 5를 입력시 5*1~5*9=45 까지 출력되도록 합니다.
		 단, 메인메소드에서 입력을 받은 후 외부 클래스 메소드로 전송하여 출력함
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.println("구구단 2단~9단 까지 숫자를 하나 입력하세요 :");
		String input = sc.nextLine().intern();
		
		try {
			data5 d = new data5();
			d.bbb(input);			
		}
		catch(Exception e) {
			System.out.println("입력 오류");
		}
	}

}

class data5{
	
	public void abc() {
		/*
		int i = 9;
		int f;
		do {
			for(f=1; f<=3; f++) {
				System.out.println(i + "*"+ f + " = " + (i*f));
			}
			i--;
		}while(i > 6);
		*/
	}
	

	public void bbb(String a) {		
		int i;
		int aa = Integer.parseInt(a);
		if(aa < 2 || aa > 9) {
			System.out.println("2~9까지 입력해주세요");
			new java8().main(null);
		}else {
			for (i=1; i<=9; i++) {
				System.out.println(aa + "*" + i + " = " + (i*aa));
			}
			System.out.println("구!구!단!");
			System.exit(0);
		}
	}
}



/*
 * System.out.println("단어를 입력하세요"); 
 * Scanner sc = new Scanner(System.in); 
 * String word = sc.nextLine(); 
 * int ea = word.length(); 
 * System.out.println(ea);
 */