package io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

//FileReader + Buffered 응용편 (datalist.txt)
/*
 	응용문제 2
 	datalist.txt에 숫자가 있습니다. 해당 파일을 읽어 들여서 해당 숫자 중
 	짝수 값만 모두 출력 되도록 하시오.
 */

public class file8 {

	public static void main(String[] args) {
		try {
			data6 dt = new data6();
			dt.abc();
		}
		catch(Exception e) {
			System.out.println("해당 메소드 오류 발생");
		}
		
	}

}

class data6{
	FileReader fr = null;
	BufferedReader br = null;
	
	public void abc() throws Exception {
		this.fr = new FileReader("E:\\project\\web\\src\\main\\webapp\\datalist.txt");
		this.br = new BufferedReader(this.fr);   //메모리에 해당 값을 모두 등록

		String a = null;		
		while((a = this.br.readLine()) != null) {
			if(Integer.parseInt(a) % 2 == 0) {    // 짝수 조건일 경우
				System.out.println(a);
			}
		}
		this.br.close();
		this.fr.close();

		//ArrayList<String> al = ArrayList<String>();

	}
}
