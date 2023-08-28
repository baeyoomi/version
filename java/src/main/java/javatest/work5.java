package javatest;

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
public class work5 {

	public static void main(String[] args) {
		choose cs = new choose();
		cs.num();
		cs.search();

	}

}

class number {
	int nums[] = null;
	public void num() {
		this.nums = new int[]{55,1,6,8,10,22,96,33,31,45,48,60};
	}
}
class choose extends number {
	Scanner sc = null;
	@Override
	public void num() {
		super.num();
	}
	
	public void search() {
		this.num();
		this.sc = new Scanner(System.in);
		System.out.println("1.짝수 | 2.홀수");
		String ch = this.sc.nextLine().intern();
		int i=0;
		int aa[] = new int[nums.length];
		//aa[i] = nums[i] % 2 == 0 ? "1" : "2";
		if(ch == "1") {}

	}
} 





