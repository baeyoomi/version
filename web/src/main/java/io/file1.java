package io;

import java.io.*;

/*
  I/O : inputStream, outputStream
  입력 스트림 : 프로그램으로 들어오는 데이터 (키보드, 마우스, SSD, HDD)
  출력 스트림 : 프로그램에 해당 데이터를 출력하는 형태 (모니터, 프린터, 데이터값)
  Stream : input, output 사용자가 처리하는 데이터
  java.io : 라이브러리
  java.util : 그동안 사용했던 라이브러리 import java.util.*; <- 객체지향 라이브러리
  StreamAPI >>
  File, FileReader (일반) -> FileinputStream 
  FileWriter(저장) -> FileOutputStream (저장을 이용한 출력) 
  
  일반적으로 객체지향에서 예외처리하는 방식 >> 
  1. 메소드에 throws Exception을 사용시 해당 메소드를 외부에서 호출 시 무조건 try~catch를 사용해야함
  
  2. 해당 메소드에서 try~catch를 사용 할 경우 호출 받은 메소드에서 throws를 사용했을때 또는 해당 메소드는 throws를 사용하지 않고, 
  	 호출 받은 메소드 자체에 오류가 발생시 호출하는 메소드에서 예외 처리하는 상황
  	 
  3. 예외처리를 하지 않을 경우 해당 프로세서는 종료하지 못하고 정지하는 형태가 발생함
  
  4. javaScript에서도 try~catch 사용할 수 있다.
  
 */
public class file1 {

	public static void main(String[] args) {
		//예외처리 throws Exception 와 try~catch() ,또는 둘다 쓸때
		//FileReader fr = new FileReader("");
		abc a = new abc();
		try {
			a.aaa();
			String nm = "10";  //a1
			Integer number = Integer.parseInt(nm);
		}
		catch(FileNotFoundException fe){
			System.out.println("해당 파일을 찾을 수 없습니다.");
		}
		catch(NumberFormatException Nf){
			System.out.println("숫자로 변환하지 못하였습니다.");
		}
		catch(Exception e) {  //여러번 사용가능
			//Exception은 여러가지 오류사항 예외처리를 모두 확인할 수 있는 Default 클래스 입니다. (종류만 120개가 넘음 기본적인 것만 기억하고 때에 따라 바꿔도 됌)
			//System.out.println("해당 파일을 찾을 수 없습니다.");
			//System.out.println(e.getMessage()); //어떤 부분이 오류인지 찾아줌
			System.out.println(e);
		}
		
	}

}

class abc{
	public void aaa() throws Exception{
		/* 
		 	\\ : 자신의 PC에 있을 파일을 사용함
		 	/  : Server를 이용하여 파일을 사용함 (외부에서 사용할 때) 
		 */
		FileReader fr = new FileReader("E:\\project\\web\\src\\main\\webapp\\data.txt");
		System.out.println(fr.read());
		//read() : 데이터 크기를 읽어 들이는 메소드 입니다.
		// -1 : 파일이 아무것도 없는 상태, -1 외에는 파일이 있는 상태
	}
}
