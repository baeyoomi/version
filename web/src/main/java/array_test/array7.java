package array_test;

import java.util.Arrays;
import java.util.Collections;

//2차 배열을 1차 배열로 합산
public class array7 {

	public static void main(String[] args) {
		new array7().test();

	}
	
	public void test() {
		int a[][] = {
				{1,3,5,7},
				{2,4,6,8}
		};
		int ea1 = a.length;        //그룹 2
		int ea2 = a[0].length;     //데이터 갯수 4
		int make = ea1 * ea2;      //2 * 4 = 8 , 해당 배열의 전체 갯수를 파악하기 위한 공식
		int b[] = new int[make];   //2차 배열을 1차 배열로 병합하기 위한 빈 배열값
		// Integer b[] = new Integer[make];
		
		int count = 0;   //배열 배정 번호
		/*
		 for(int i=0; i<ea1; i++){     //배열 그룹
		 	for(int j=0; j<ea2; j++){  //배열 데이터
		 		b[count] = a[i][j];   //해당 데이터를 빈 배열에 삽입
		 		count++;              //배열 번호 +1씩 증가
		 	}
		 }
		 */
		for(int c[] : a) {
			for(int cc : c) {
				b[count] = cc;
				count++;
				//System.out.println(cc);		
			}
		}
		Arrays.sort(b); //배열 오름차순으로 정렬 , 내림차순 못함 int니까ㅎㅎ Integer로 바꾸면 가능
		System.out.println(Arrays.toString(b));   //[1, 2, 3, 4, 5, 6, 7, 8]
		//Arrays.sort(b,Collections.reverseOrder());   //b[]를 Integer로 바꿔도 됌
		//System.out.println(Arrays.toString(b));  //[8, 7, 6, 5, 4, 3, 2, 1]
		
		
		/*
		 응용문제 9
		 각 나라별 행복수치 관련 데이터 입니다.
		 해당 데이터를 1차 배열로 가공하여 출력 되도록 합니다.
		 1번 Data : 대한민국, 일본, 중국, 베트남, 태국
		 2번 Data : 40, 35, 70, 55, 57
		 
		 병합된 결과값은
		 ["대한민국(40)","일본(35)","중국(70)","베트남(55)","태국(57)"]
		 */
		
		Object data[][] = {
				{"대한민국","일본","중국","베트남","태국"},
				{40, 35, 70, 55, 57}
		};
		
		Object newdata[] = new Object[data[0].length];
		
		int answer = 0;
		do {
			newdata[answer] = data[0][answer] + "(" + data[1][answer] + ")";
			answer++;
		}while(answer < data[0].length);            //반복문 하나로도 결과값 출력 가능
		
		System.out.println(Arrays.toString(newdata));
	}

	
}
