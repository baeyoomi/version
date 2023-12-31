package array_test;

import java.util.*;

//sort (정렬)
public class array5 {

	public static void main(String[] args) {
		new array5().test();

	}
	
	public void test() {
		//sort : 오름차순,내림차순으로 정렬할때 사용하는 클래스
		//단, int 사용시 Collection.reverseOrder가 작동하지 않음
		//숫자 방식은 Integer로 설정시 정상 작동 합니다.
		
		int a[] = {10,1,6,9,20,11};
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));        //[1, 6, 9, 10, 11, 20]
		
		Integer b[] = {10,1,6,9,20,11};
		Arrays.sort(b,Collections.reverseOrder());
		System.out.println(Arrays.toString(b));        //[20, 11, 10, 9, 6, 1]

		String c[] = {"z","a","c","h","f"};
		Arrays.sort(c);
		System.out.println(Arrays.toString(c));        //[a, c, f, h, z]
		
		Arrays.sort(c,Collections.reverseOrder());
		System.out.println(Arrays.toString(c));        //[z, h, f, c, a]
		
	}

}
