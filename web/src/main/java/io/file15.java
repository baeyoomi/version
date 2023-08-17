package io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

//BufferedInputStream, BufferedOutputStream
public class file15 {

	public static void main(String[] args) {
		try {
			data12 d = new data12();
			d.abc();
		}
		catch(Exception e) {
			System.out.println("파일 저장 코드 오류");
		}
	}

}


class data12{
	public void abc() throws Exception {
		//InputStreamReader
		//OutputStreamReader
		//BufferedReader
		
		String file = "E:\\gumi\\0817\\dog.jpg";
		//FileInputStream fs = new FileInputStream(file);		
		//InputStream is = new FileInputStream(file);  //중복해서 사용 불가함
		//BufferedInputStream bi = new BufferedInputStream(is); //대체로 이걸 쓸수 있으나, 혼자 쓸 수는 없음 그래서 밑에처럼 사용, InputStream을 나중에 쓸 예정이라면 이걸 사용한다
		BufferedInputStream bi = new BufferedInputStream(new FileInputStream(file));
		byte filesize[] = new byte[bi.available()];
		int total = bi.read(filesize);
		
		if(total > 50000) {
			System.out.println("이미지 제한 용량을 초과 합니다.");
		}
		else {
			System.out.println("이미지 제한 용량 확인");
			OutputStream os = new FileOutputStream("dog2.jpg");
			os.write(filesize);
			os.flush();
			os.flush();
			bi.close();
		}
		
		//System.out.println(Arrays.toString(filesize));
	}
}