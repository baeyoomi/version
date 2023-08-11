package array_test;

import java.util.Arrays;

public class homework1 {

	public static void main(String[] args) {
		/*
		 숙제 :
		 해당 두개의 배열 데이터가 있습니다. 각 배열별로 인덱스가 같은 번호를 더하여 짝수, 홀수 인지를 배열 결과 데이터로 재설정하여 출력하시오.
		 
		  Adata = 5 17 19 22 23
		  Bdara = 1 2 3 4 5
		  
		  결과 출력 예시 )
		  ["짝수","홀수","짝수","짝수","짝수"]
		 */
		
		/*  내가 쓴 답
		int dataA[] = {5,17,19,22,23};
		int dataB[] = {1,2,3,4,5};
		Object data[] = new Object[dataA.length];
		
		for(int i=0; i<dataA.length;i++) {
			data[i] = (dataA[i] + dataB[i]) % 2 == 0 ? "짝수" : "홀수";
		}
		System.out.println(Arrays.toString(data));
		*/
		
		int n[][] = {
				{5,17,19,22,23},
				{1,2,3,4,5}
		};
		
		int ea = n[0].length;
		int w = 0;
		int sum;         //여기서 비워놓은 이유 두가지를 합치려고, int sum = 0;넣는 경우는 sum += 변수, sum = sum + 변수
		String newdata[] = new String[ea];
		String msg;
		while(w < ea) {
			sum = n[0][w] + n[1][w];
			if(sum % 2 == 0) { //짝수
				msg = "짝수";
			}
			else {             //홀수
				msg = "홀수";
			}
			newdata[w] = msg;        //빈배열에 짝수, 홀수에 대한 결과 데이터를 삽입
			w++;
		}
		System.out.println(Arrays.toString(newdata));
	}

}
