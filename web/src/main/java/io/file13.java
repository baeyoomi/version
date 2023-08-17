package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

//이미지 파일 처리 (Stream)
public class file13 {

	public static void main(String[] args) {
		try {
			data11 dt = new data11();
			dt.abc();
		}
		catch(Exception e) {
			System.out.println("파일 오류");
		}
	}
}

class data11{
	public void abc() throws Exception {
		InputStream is = new FileInputStream("E:\\gumi\\0817\\cat.jpg");
		//System.out.println(is.available());
		/*
		byte[] file = new byte[is.available()];
		int b = is.read(file);
		//System.out.println(b);
		*/
		//OutputStream os = new FileOutputStream("cat2.jpg"); //경로명을 쓰지 않으면 해당 프로젝트에 파일이 만들어짐
		OutputStream os = new FileOutputStream("cat3.jpg");
		//os.write(file);
		
		/* %로 확인 */
		byte[] file = new byte[is.available()/100];  //한번에 읽어 들일 수 있는 크기
		int img = 0;    //읽어 들이는 byte 수
		int check = 0;  //읽는 횟수
		/* 복사율을 표시하면서 progress-bar를 이용하여 보여 줄 때 */
		while(true) {  //업로드,다운로드 진행상황 수치로 보는 식
			img = is.read(file);   //읽어 들일수 있는 용량 만큼 읽기
			if(img == -1) {  // 더 이상 byte가 없을 경우 정지 조건
				break;
			}
			else {
				if(check <= 80) {        //80% 이하 일 경우 지속적으로 복사
					os.write(file,0,img);
				}
				else {  //80% 이상일 경우 정지
					break;
				}
			}
			check++;
			if(check % 2 == 0) {  //진행률을 표시하는 기능
				System.out.println(check + "%");
			}
		}
		os.flush();
		os.close();
		is.close();
	}
}