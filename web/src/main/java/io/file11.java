package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

//Stream으로 파일로드 하는 방식 + 쓰기
public class file11 {

	public static void main(String[] args) {
		try {
			data8 d = new data8();
			d.abc();
		}
		catch(Exception e) {
			System.out.println("소스 코드 및 경로 실패!!");
		}
	}
}

class data8{
	public void abc() throws Exception {
		InputStream is = new FileInputStream("E:\\project\\web\\src\\main\\webapp\\datalist.txt");
		//System.out.println(is.available());   //available() : 파일 전체 크기 (예시: 2MB 이하의 이미지만 올려주세요)
		byte temp[] = new byte[is.available()]; //파일 전체를 모두 byte 배열로 적용 
		//byte temp[] = new byte[1024*10]; //1024*1=1kb, 1024*10=10kb, 1024*1024*1=1mb
		int ea = is.read(temp);    //데이터를 한번 읽어 들여야 함 , 전체 크기 확인 안해도되면 is.read(temp) 만 써도 됌
		//read()가 필요한 이유는 해당 파일 바이너리 형태로 읽기 때문에 read 메소드로 파일 전체를 읽어 들입니다.
		//아스키는 readLine을 사용하게됌
		
		//System.out.println(ea);    //파일 전체 크기 확인 방식
		String data = new String(temp,"UTF-8");  //"UTF-8" 강제로 어노셋 변경
		System.out.println(data);		
		is.close();
		
		try {
			data9 z = new data9();
			z.zzz();
		}
		catch(Exception e) {
			System.out.println("데이터 쓰기 오류 발생!!");
		}
	}
}

class data9{
	public void zzz() throws Exception {
		String test = "\n연습입니다.";
		OutputStream os = new FileOutputStream("E:\\\\project\\\\web\\\\src\\\\main\\\\webapp\\\\datalist.txt",true);
		byte[] data = test.getBytes();  //문자열을 byte 단위로 변환 (바이너리)
		os.write(data);  //data는 byte기 때문에 "\n" 문자가 들어갈수 없음 문자열에 해당되는 곳에 넣어야함
		os.flush();
		os.close();
	}
}
