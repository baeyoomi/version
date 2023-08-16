package io;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.util.Arrays;

//FileReader, FileWriter : 파일 읽기, 쓰기 (문서용) - CharArrayReader라는것도 있음 - ASCII -> 문자로 읽고 값으로 반환함
//Buffered,LineNumberReader : 메모리 영역

//Stream 이란 : 문서용, 이미지, 동영상, 오디오 (스트림에 기본 형태는 바이너리) -> 숫자
//FileinputStream, AudioInputStream, ObjectInputStream 등등
//BufferedStream

//InputStream, OutputStream : 대분류
//FileinputStream, AudioInputStream, ObjectInputStream : 소분류
public class file9 {

	public static void main(String[] args) {
		try {
			//InputStream is = System.in; //System.in 키보드로 뭔가 입력을 받겠다는 말
			//int code = is.read();   //해당 키를 입력시 ASCII코드로 인식하여 int로 변함, Stream은 기본 바이너리지만 이렇게 변환할수 있음
			//System.out.println(code);
			
			String a = "123456789";
			//String a = "ABCDE";
			//String a = "홍길동";
			byte[] b = a.getBytes();  //getBytes("언어패킷") - 문자를 byte 단위로 변환
			System.out.println(Arrays.toString(b));
			OutputStream os = System.out;
			os.write(b,0,b.length); // 배열은 중간부터 빼낼수 없으니 0부터 시작하게 되어있다 (객체,배열시작번호,배열 종료번호)
			os.flush();   //새로운 데이터를 넣기 위해 비워줘야함
			os.close();
			
		}
		catch(Exception e) {
			System.out.println("코드 오류발생!!");
		}
	}

}
