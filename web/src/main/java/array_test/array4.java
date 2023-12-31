package array_test;

import java.util.Arrays;

//1차 배열 중 필요한 데이터만 추출하여 신규 배열로 커스텀
public class array4 {

	public static void main(String[] args) {
		new array4().test2();
	}
	
	public void test2() {
		int a[] = new int[5];         //5개의 빈 배열값
		int b[] = {1,2,3,4,5,6,7};    //실제 데이터가 있는 배열
		int w = 0;                // 배열은 무조건 0부터 시작해서 들어가야한다.
		int array = 0;                //배열 번호를 지정하기 위한 변수
		while(w < b.length) {
			if(b[w] % 2 == 0) {        //짝수 조건, (b[w] % 2 == 0 && array < a.length)게시판 페이징 할 때 나누는 구문
				a[array] = b[w];     //a[w]를 넣으면 0,2번 순서로 올라 1번이 빠진다. array를 넣어 순차적으로 값을 이관
				array++;            //빈배열 순차적으로 +1씩 증가
			}
			w++;
		}
		System.out.println(Arrays.toString(a));
		
		
		/*
		 응용문제 6
		 다음 데이터 값 중 아이디가 4글자 이상 아이디만 추출하여 새로운 데이터 배열로 출력하시오.
		 hong, kim, pack, jang, sun, so, han, jung
		 */
		

		String member[] = {"hong", "kim", "pack", "jang", "sun", "so", "han", "jung"};
		//빈배열 생성
		String name[] = new String[member.length];
		
		int ct = 0 ;
		for(String m : member) {
			if(m.length() >= 4) {   //배열 값중 단어가 4자리 이상 조건
				name[ct] = m;       //신규 빈배열 값을 이관하는 작업
				ct++;
			}
		}
		System.out.println(Arrays.toString(name));

		
	}

}
