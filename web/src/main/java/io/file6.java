package io;

import java.io.FileWriter;
import java.util.Scanner;

/*
	응용문제 1
	Scanner를 이용하여 사용자가 입력한 숫자를 모두 저장 되도록 합니다.
	"1~100까지의 숫자 중 한가지를 입력하세요?"
	단, 한줄에 하나의 숫자가 입력 되도록 하며, quit라는 명령어를 입력시
	더 이상 프로세서를 작동 되지 않도록 합니다.
	저장 파일명은 number.txt로 저장 되도록 하시오.
*/
public class file6 {
	
	public static void main(String[] args) {
		try {
			data4 da = new data4();
			da.abc();
		}
		catch(Exception e) {
			System.out.println("해당 메소드 오류 발생!!");
		}
	}
}

	class data4{
		FileWriter fw = null;			
		Scanner sc = null;

		public void abc() throws Exception {
			this.fw = new FileWriter("E:\\project\\web\\src\\main\\webapp\\number.txt",true);
			this.sc = new Scanner(System.in);
			
			while(true) {
				System.out.println("1~100까지의 숫자 중 한가지를 입력하세요?");
				String num = this.sc.nextLine().intern();   //quit로 인하여 String으로 처리
				if(num == "quit") {
					break;
				}
				else {
					if(Integer.parseInt(num) > 100) { //100이상 입력시
						System.out.println("숫자는 제발 100 이하로 입력하세요");
					}
					else {  //100이하 입력시 해당 파일로 값을 저장
						this.fw.write(num + "\n");
					}					
				}
			}
			this.sc.close();  //파일 저장 (close를 안할 경우 해당 파일 오픈되어 있으므로 저장되지 않는 상황이 발생)
			this.fw.close();  //Scanner 종료
			System.out.println("모든 데이터 내용이 저장 되었습니다");
	}
	
}
			/*
			try {
				FileWriter fw = new FileWriter("E:\\project\\web\\src\\main\\webapp\\number.txt",true);
				Scanner sc = new Scanner(System.in);
			int i;
			for(i=1; i<101; i++) {
				System.out.println("1~100까지의 숫자 중 한가지를 입력하세요?");
				String number = sc.nextLine().intern();
				if(number == "quit") {
					break;
				}
				else {
					fw.write(number + "\n");
				}
			}
			System.out.println("모든 데이터 내용이 저장 되었습니다");
			sc.close();
			fw.close();
		}
		catch(Exception e) {
			System.out.println(e);
			System.out.println("파일 오류가 발생했습니다");
		}
			*/
