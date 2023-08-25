package javatest;
/*
	반복문 for, while, do~while
*/
public class java6 {

	public static void main(String[] args) {
		new data3().abc();
	}

}
/* 1~5까지 출력문 */
class data3{
	
	public void abc() {
		/*
		int f;
		for(f=1; f<=5; f++) {
			System.out.println(f);
		}
		*/
		/*
		int w=1;
		while(w <= 5) {  //w가 5보다 작거나 같을때 까지
			System.out.println(w);
			w++;
		}
		*/
		/*
		int w=1;
		do {
			System.out.println(w);
			w++;
		}while(w <= 5);
		*/
		
		/*
		 응용문제2. 해당 숫자를 역순으로 출력합니다.
		 10~1까지 출력 (while문)
		 */
		/*
		int ww=10;
		while(ww >= 1) { 
			System.out.println(ww);
			ww--;
		}
		*/
		/*
		 응용문제3. 구구단 9단 9*1부터 9*9까지
		 결과값 출력 (do~while문)
		*/
		/*
		int z=1;
		int g=9;
		do {
			int sum = g * z;
			System.out.println(g + "*"+ z + " = " + sum);
			z++;
		}while(z <= g);
		*/
		/*
		 응용문제4. 
		 100 ~ 150까지 모든 수를 합한 결과값 출력 (while문)
		*/
		/*
		int i = 100;
		int sum = 0;
		while(i <= 150) {
			sum += i;
			i++;
		}
		System.out.println(sum);
		*/
		/*
		 응용문제5. 
		 100 ~ 150까지 모든 수를 곱한 결과값 출력 (for문 6.12....)
		*/
		/*
		int j;
		double sum = 1;
		for(j=100;j<=150;j++) {
			sum = sum * j;
		}
		System.out.println(sum);

		byte b = 127;  //byte -128~127까지 출력
		System.out.println(b);
		*/
		
	}
}