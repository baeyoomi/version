package javatest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*
[숙제] - 상속형태의 클래스를 이용하여 다음 문제에 맞는 결과값을 돌출하는 코드를 작성하시오.
[DB] = {55,1,6,8,10,22,96,33,31,45,48,60}

"해당 데이터를 1.짝수, 2.홀수를 선택하세요?"

[결과] 
짝수값 : 6,8,10,22,96,48,60
홀수값 : 55,1,33,31,45
조건, sort 를 사용해 정렬하세요

최종값에 대한 오름차순으로 정렬하여 최종출력 합니다.
최종값(짝수) : 6,8,10,22,48,60,96 (오름차순으로 정렬)
*/
public class homework9 {

	public static void main(String[] args) {
		choo_se cs = new choo_se();
		cs.num();
		cs.search();

	}

}

class number_2 {
	int nums[] = null;
	public void num() {
		this.nums = new int[]{55,1,6,8,10,22,96,33,31,45,48,60};
	}
}
class choo_se extends number_2 {
	Scanner sc = null;
	@Override
	public void num() {
		super.num();
	}
	
	public void search() {
		this.num();
		this.sc = new Scanner(System.in);
		Arrays.sort(this.nums);
		
		ArrayList<Integer> numnum = new ArrayList<Integer>();
		int i = 0;
		int f = 0;
		for(f = 0; f <this.nums.length; f++) {
			numnum.add(this.nums[f]);
		}
		
		ArrayList<Integer> aa = new ArrayList<Integer>();
		ArrayList<Integer> bb = new ArrayList<Integer>();
		for(i = 0; i <numnum.size(); i++) {
			if(numnum.get(i) %  2 == 0) {
				aa.add(numnum.get(i));
			}
			else if(numnum.get(i) %  2 != 0) {
				bb.add(numnum.get(i));
			}			
		}

		/* 질의 응답 */
		System.out.println("1.짝수 | 2.홀수");
		String ch = this.sc.nextLine().intern();
		if(ch == "1") {
			System.out.println("짝수 : " + aa);
		}else if(ch == "2") {
			System.out.println("홀수 : " + bb);
		}
	}
} 