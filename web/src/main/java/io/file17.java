package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//flush와 close의 차이
public class file17 {

	public static void main(String[] args) {
		try {
			data14 d = new data14();
			d.abc();
		}
		catch(Exception e) {
			System.out.println("오류");
		}

	}

}

class data14 {
	public void abc() throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //(new InputStreamReader(new FileInputStream(""))); 가능
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String st = null;
		int n = Integer.parseInt(bf.readLine());
		
		int w = 0;
		while(w < n) {
			st = new String(bf.readLine());
			int a = Integer.parseInt(st);
			int b = Integer.parseInt(st);
			int sum = a+b;
			
			bw.write(sum + "\n");
			bw.flush();  //Buffered를 사용할 때만 flush를 이용합니다.
			//bw.close();
			w++;
		}
		//bw.flush();
		bw.close();
	}
}