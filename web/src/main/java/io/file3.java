package io;

import java.io.FileReader;
import java.io.IOException;

// IOException + Exception + finally (예외처리 후 다시 해당 프로세서 실행 but 강제종료)
public class file3 {

	public static void main(String[] args) {
		try {
			data2 dt = new data2();
			String url = "E:\\project\\web\\src\\main\\webapp\\data1.txt";
			dt.abc(url);
		}
		catch(Exception e) {
			System.out.println(e);			
		}
		//catch로 오류가 발생시 다시 프로세서를 읽어서 해당 메소드를 호출하는 형태, finally를 많이 붙일 수록 막코드라고 볼 수 있다 ㅎ
		finally { //임시방편, 혹시 예외처리가 되면 수정 후에 다시 던진다(주로 오류가 "날거 같을" 때 사용함 또는 AutoScaling을 대비할때)
			
			try {          //해당 메소드가 throws를 사용했으므로 다시 진행해줘야 하니까 다시 try~catch 꼭 사용해야함
				data2 dt = new data2();
				String url = "E:\\project\\web\\src\\main\\webapp\\data.txt";
				dt.abc(url);
			}
			catch(Exception e) {
				System.out.println("파일 완전 오류 발생!!");
				System.exit(0);   //프로그램 강제종료
			}
		}

	}

}

class data2{
	FileReader fr = null;
	
	public void abc(String filename) throws Exception, IOException {
		this.fr = new FileReader(filename);
		System.out.println(this.fr.read());
		this.fr.close();  //썼으면 닫자 용량 잡아먹는다
	}
}