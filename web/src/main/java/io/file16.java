package io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
/*
	InputStream > InputStreamReader > BufferedReader (o)
	InputStream > BufferedInputStream (o)
	FileinputStream > BufferedReader (x)
	FileWriter > FileOutputStream (x)
	FileWriter > OutputStreamWriter > FileOutputStream (o)
*/

// InputStreamReader, OutputStreamWriter, BufferedReader,BufferedWriter
public class file16 {

	public static void main(String[] args) {
		try {
			data13 d = new data13();
			d.abc();
		}
		catch(Exception e) {
			
		}
	}

}

class data13{
	//InputStreamReader : Stream 을 Reader 로 변환 할 때 사용함 (바이너리를 아스키로)
	public void abc() throws Exception {           //이미지(바이너리)를 아스키로 바꾸는 이유 db를 json으로 바꿔야 한다던가 하는 이유
		String file="E:\\project\\web\\src\\main\\webapp\\number.txt";
		InputStream is = new FileInputStream(file); //바이너리
		InputStreamReader ir = new InputStreamReader(is); //아스키 //Reader는 단독으로 쓸 수 없다
		BufferedReader br = new BufferedReader(ir);  //Reader는 전부 아스키
		
		//System.out.println(br.readLine());
		String data;
		while((data=br.readLine())!=null) {
			System.out.println(data);
		}
		br.close();
		ir.close();
		is.close();
		//new 쓰는 순간 메모리를 사용한다는 뜻이기 때문에 열어놓은거 다 close 해야한다.
		
		//Buffered는 휘발성이기 때문에 이걸 사용하기 위해선 변수로 받아서 처리하거나 배열로 받아서 처리해야 한다
	}
}