package io;

import java.io.FileReader;

// I/O 파일 데이터 읽어 오기
public class file2 {

	public static void main(String[] args) {
		try {
			data1 d = new data1();
			d.aaa();
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}


class data1 {
	public void aaa() throws Exception{
		//문서파일일 경우 utf8, ansi 확인 후 저장합니다.
		FileReader fr = new FileReader("E:\\project\\web\\src\\main\\webapp\\data.txt");
		System.out.println(fr.getEncoding());  //파일을 읽어오는 인코더 형식 ex)UTF8
		
		while(true) { //무한 루프
			int m = fr.read();
			//System.out.println(m); //54861(홍) 44600(길) 46041(동)
			System.out.println((char)m); // 홍 길 동, byte를 문자화 하여 변환해서 출력
			//1024byte == 1KByte
			//1024kbyte == 1Mbyte
			if(m == -1) {   //-1(공백) 공백이 나타나면 멈춤
				break;
			}
		}
		fr.close(); //제일 중요함,  이거 안하면 파일이 항상 열려있음 (scaner 도 마찬가지)
	}
}