package io;
// Scanner를 이용한 파일쓰기 기능 활성화
import java.io.FileWriter;
import java.util.Scanner;

public class file5 {

	//static main에는 필드를 작성하더라도 this를 사용하지 못함, 어지간하면 외부클래스에서 사용한다.
	/*
	  static 사용시 new 인스턴스를 호출시 새롭게 읽어 들이므로 기존에 있는 코드를 사용하지 못함
	 */
	public static void main(String[] args) {
		try {
			/* 객체 생성 */
			FileWriter fw = null;			
			Scanner sc = null;
			
			/* 인스턴스 생성 */
			fw = new FileWriter("E:\\project\\web\\src\\main\\webapp\\user.txt",true);
			sc = new Scanner(System.in);
			
			int f;
			for(f=0; f<3; f++) {
				System.out.println("사용자 이름을 입력해 주세요?");
				String name = sc.nextLine().intern(); //"\n" 이게 있으면 exit까지 입력됌 조건에 따라 알맞은 위치에 써야함
				if(name == "exit") {
					break;
				}
				else {
					fw.write(name + "\n");
				}
			}
			System.out.println("모든 데이터 내용이 저장 되었습니다.");
			sc.close();
			fw.close();   // file5().fw.close() / fw.file5().close() 둘다 실행은 되지만 파일이 남아있음 내가 오픈한 역순으로 닫아야함
		}
		catch(Exception e) {
			System.out.println(e);
			System.out.println("파일 오류 발생!!");
		}

	}

}
