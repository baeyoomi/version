package array_test;

import java.lang.reflect.Array;
import java.util.*;

//for~each문 : 무조건 배열에만 사용하는 반복문
public class array3 {

	public static void main(String[] args) {
		new array3().test();
	}
	
	public void test() {
		/*
		 for~each는 배열값을 이용하여 범위 할당 한 만큼만 반복적으로 사용하는 문법
		 주의사항 : 배열 자료형과 foreach에 사용하는 자료형을 동일하게 설정
		 */
		String user[] = {"홍길동","김유신","장보고","유관순"};
		
		for(String f : user) {
			System.out.println(f);
		}
		
		/*
		 응용문제 4
		foreach를 이용하여 다음 배열 데이터의 값을 모두 곱한 결과값을 출력하시오.
		5 10 15 20 25 30 35   => 393750000
		 */
		
		int number[] = {5,10,15,20,25,30,35};
		int avg = 1;
		for(int g : number) {
			//System.out.println(g);
			avg = avg * g;
			//avg *= g;
		}
		System.out.println(avg);
		
		/*
		 응용문제 5
		 다음 리스트 숫자 중 짝수, 홀수 각각의 갯수를 출력하시오.
		 3 6 9 12 15 18 21 24 27 
		 */
		
		int list[] = {3,6,9,12,15,18,21,24,27};
		int count1 = 0;
		int count2 = 0;
		for(int j : list) {
			//System.out.println(j);
			if(j % 2 == 0) {
				count1++;
			}
			else {
				count2++;
			}
		}
		System.out.println("짝수 : " + count1 +", 홀수 : " + count2);
	}

}
