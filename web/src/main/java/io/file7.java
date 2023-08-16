package io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

// Buffered를 사용하기
public class file7 {

	public static void main(String[] args) {
		try {
			data5 d = new data5();
			d.abc();
		}
		catch(Exception e) {
			System.out.println("파일 오류 발생!!");
		}
	}
}

class data5{
	FileReader fr = null;    // FileReader없이 Buffered 못씀
	/*
	 	Buffered, LineNumberReader : Temp(임시저장소)
	 	효율적으로 파일을 메모리에 등록 시킨 후 해당 메모리에 등록된 값을 출력하는 형태
	 	해당 임시 저장된 내용을 사용시 휘발성으로 데이터는 자동 삭제 처리 됩니다.
	*/
	public void abc() throws Exception {
		this.fr = new FileReader("E:\\project\\web\\src\\main\\webapp\\number.txt");
		//System.out.println((char)this.fr.read()); //단점 하나밖에 안나옴
		//LineNumberReader li = new LineNumberReader(this.fr);
		/* 
		   Buffered  : 속도가 빠른대신 사용부분에 있어 변수로 받아서
		   처리 또는 배열로 만든 후 처리 하는 것 권장 
		 */
		BufferedReader bf = new BufferedReader(this.fr);
		/*
		if(bf.readLine()!="") {      //조건문에 bf.readLine()="첫 데이터 내용"을 썼기 때문에 
			System.out.println(bf.readLine());  // 그 다음 내용이 출력됌 ,  고로 이렇게 쓰지 말자
		}
		*/
		ArrayList<String> al = new ArrayList<String>();
		String line = "";
		while((line = bf.readLine()) != null) {
			//System.out.println(line);   //숫자로 지정하지 않고 데이터를 다 불러오는 방법, line에 bf.readLine()을 입력하는 형태
			al.add(line);      //배열화 시키기
		}
		System.out.println(al);  //배열화 시키기
		bf.close();
		this.fr.close();

		/*
		System.out.println(bf.readLine());   //한 행을 다 읽을 수 있음, 단점 한번 사용하면 반복 되지않고 날아감 (휘발성)		
		System.out.println(bf.readLine()); 
		System.out.println(bf.readLine());
		*/ 
	}
}
