package array_test;

import java.util.*;

//2차 배열
public class array6 {

	public static void main(String[] args) {
		new array6().test();

	}
	
	
	public void test() {
		String member[][] = {
				{"박초롬","윤보미","정은지","김남주","오하영"},
				{"31","29","33","31","32"}
		};
		int ea = member.length;   // 2 -> 그룹이 몇개가 있다
		System.out.println("그룹이 몇개 : " + ea);
		
		int data_ea = member[0].length;    //5 -> 첫번째 그룹에 몇개가 있다
		System.out.println("첫번째 그룹이 몇개 : " +data_ea);
		
		int f,ff;
		/*
		for(f=0; f<ea;f++) {   //2바퀴
			for(ff=0; ff<data_ea;ff++) {
				System.out.println(member[f][ff]);
			}	
		}      //이름순서 5개 , 숫자 5개 나옴
		*/
		for(f=0; f<data_ea;f++) { 
			for(ff=0; ff<ea;ff++) {
				System.out.println(member[ff][f]);
			}	
		}      //이름,숫자 번갈아 가면서 나옴
		
		System.out.println("-----------");
		/*
		 응용문제 8
		 해당 데이터 배열에 있는 모든 값 중 짝수값만 모두 더하여 결과값을 출력하는 코드를 작성하시오
		 1번 데이터 : 11 42 22 16
		 2번 데이터 : 7 33 10 29
		 결과값은 90 
		 */
		
		int number[][] = {
				{11,42,22,16},
				{7,33,10,29}
		};
		
		int total = 0;       //합산 결과 변수값
		
		for(int a[] : number) {                          //2차 배열을 1차 배열로 따로따로 구성
			//System.out.println(Arrays.toString(a));
			for(int b : a) {                             //위에서 구성된 1차 배열에 있는 데이터를 분리
				//System.out.println(b);
				if(b % 2 == 0) {                         //짝수 조건일 경우
					total += b;
				}
			}
		}
		System.out.println(total);
		
		/*
		 숙제 :
		 해당 두개의 배열 데이터가 있습니다. 각 배열별로 인덱스가 같은 번호를 더하여 짝수, 홀수 인지를 배열 결과 데이터로 재설정하여 출력하시오.
		 
		  Adata = 5 17 19 22 23
		  Bdara = 1 2 3 4 5
		  
		  결과 출력 예시 )
		  ["짝수","홀수","짝수","짝수","짝수"]
		 */
			
		
	}
}


//int a[] = new int[2];
//a[0] =1;               //정적배열
//int b[] = {1,2,3,4,5}; //동적배열