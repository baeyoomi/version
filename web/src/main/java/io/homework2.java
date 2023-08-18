

package io;

import java.io.FileWriter;
import java.util.Scanner;

//숙제
/*
	Scanner를 이용하여 총 10개의 숫자를 입력합니다.
	단, 1~100까지의 숫자만 입력이 가능하며, 100이상 숫자를 입력할 경우
	해당 콘솔로 "100까지의 숫자만 입력 가능합니다." 라고 메세지를 출력 되어야 합니다.
	무조건 10개의 숫자를 받아야 하며, 해당 숫자는 모두 data_num.txt 파일로 저장되어야 합니다.
	힌트) continue 또는 무한반복 사용 및 counting 을 이용해야함 - 어떠한 행위를 하다가 continue문을 만나면 해야할 명령문을 실행하지 않고 그 다음 명령문을 실행하는 명령문
	
*/
public class homework2 {

	public static void main(String[] args) {
		try {
			homework hw = new homework();
			hw.abc();
		}
		catch(Exception e) {
			System.out.println("오류 발생!!");
		}
	}

}

class homework{
	public void abc() throws Exception {
		/* 파일 */
		//Path data = Paths.get("E:\\project\\web\\src\\main\\webapp\\data_num.txt");
		//Files.createFile(data);
		
		FileWriter fw = new FileWriter("E:\\project\\web\\src\\main\\webapp\\data_num.txt");
		Scanner sc = new Scanner(System.in);
		
		int i=0;
		while(i < 10 ) {
			System.out.println("---숫자를 입력해주세요---");
			int num = sc.nextInt();
			if(num < 1 || num > 100) {
				System.out.println("1~100까지의 숫자만 입력 가능합니다.");
			}
			else {
				fw.write(num + "\n");
				i++;
				System.out.println(i + "번 째 입력");
			}								
		}
		sc.close();
		fw.close();
		System.out.println("모든 데이터 내용이 저장 되었습니다");
	}

}

