package io;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

//inputStream + OutputStream + flush 사용법
//inputStream 2개를 활성화 시 메모리 구조상 신규 인스턴스를 생성하지 않을 경우 연속으로 Stream을 사용하지 못합니다.
public class file10 {

	public static void main(String[] args) throws Exception {
		/*
		InputStream in = System.in;   //값을 적용
		OutputStream os = System.out; //출력
		
		int a = in.read();   //입력된 사항을 읽어 들임
		os.write(a);   //쓰기
		//os.flush(); 
		os.close();    //OutputStream 닫기
		in.close();    //inputStream 닫기
		*/
		
		/*
		InputStream in2 = System.in;
		OutputStream os2 = System.out;
		 		
		int a2 = in2.read();
		os2.write(a);
		os2.flush(); 
		os2.close();
		in2.close();
		*/
		
		data7 aa = new data7();
		aa.abc();
	}
}


class data7{
	
	public void abc() {
		String data = "abcd";
		byte[] b = data.getBytes();
		System.out.println(Arrays.toString(b));
		
		OutputStream os = System.out;
		try {
			os.write(b,0,b.length);
			os.flush();  //비우기(얘만 쓰면 비워지기만 하고 닫혀있지는 않은 상태)
			os.close();  //닫기 (얘만 쓰면 내용이 비워진 상태는 아님)
			//고로 둘다 써야 안전하게 다음 데이터를 쓸 수 있음
		}
		catch(Exception e) {
			
		}
	}
}