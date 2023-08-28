package javatest;
/*
숙제2 – java

구구단 7~9단까지 단, 각 구구단 곱셈값은
5까지만 나오도록 합니다. 7*1=7 ~ 7*5=35 8*1=8... 9*5=45

반복문 제약(do~while, while)
*/
public class homework6 {

	public static void main(String[] args) {
		new gugudan().abc();

	}

}

class gugudan {
	public void abc() {
		int i = 7;
		do {
			System.out.println("----"+i+"----");
			int j = 1;
			while(j <= 5) {
				System.out.println(i + "*"+ j + " = " + (i*j));
				j++;
			}
			i++;
		}while(i<=9);
	}
}