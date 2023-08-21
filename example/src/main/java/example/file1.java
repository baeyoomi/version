package example;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.util.Scanner;

public class file1 {

	public static void main(String[] args) {
		try {
			new box_office().abc();
		}
		catch(Exception e) {
			System.out.println("파일 로드 오류!!");
		}
	}

}
/*  응용문제 1
  	Scanner를 이용하여, 다음과 같이 실행 되도록 합니다.
 	1. 개봉작 리스트 출력, 2.프로그램 종료
 	
 	1번 입력 후 엔터 실행시 영화 리스트가 출력 되어야 하며,
 	2번 입력시 프로그램을 강제 종료 합니다.
 */

class box_office {
	Scanner sc = null;
	FileReader fr = null;
	
	public void abc() throws Exception {
		//String url ="E:\\project\\example\\src\\main\\webapp\\movie_db.txt";
		//InputStream is = new FileInputStream(url);
		InputStream is = new FileInputStream("E:\\project\\example\\src\\main\\webapp\\movie_db.txt");
		this.sc = new Scanner(System.in);	
		System.out.println("1. 개봉영화 리스트 출력 || 2. 종료");
		int no = sc.nextInt();   //String일 경우 연산기호 쓰고 싶으면 intern() 넣어줘야함
		if(no==1) {
			//System.out.println(is.available());
			//해당 모든 파일의 용량을 byte 배열로 변환
			byte temp[] = new byte[is.available()];  //배열화하여 바이트로 변환
			is.read(temp);   //변환된 뱌열값을 모두 읽어들임 // 반드시 읽어 줘야함
			String data = new String(temp);  //해당 배열을 문자화 하여 적용			
			System.out.println(data);
			System.out.println("프로그램 종료");
		}
		else {
			System.out.println("프로그램 종료");
			System.exit(0);
		}
		is.close();
		this.sc.close();
	}
}