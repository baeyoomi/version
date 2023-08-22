package example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Arrays;

/*
숙제 : user_tel.txt 파일을 로드 후 해당 사용자에 맞게 전화번호가 등록 되도록 배열화 하여 콘솔로 출력 되도록 합니다.
단, cms_db.txt로 해당 내용이 저장 되어야 합니다.
결과 : 
홍길동(01011245564)
김유신(01020041004)
*/
public class homework4 {

	public static void main(String[] args) {
		try {
			new split().abc();
		}
		catch(Exception e) {
			System.out.println("오류 오류 오류");
		}
	
	}

}

class split {
	public void abc() throws Exception { 
		FileReader fr =  new FileReader("E:\\project\\example\\src\\main\\webapp\\user_tel.txt");
		BufferedReader br = new BufferedReader(fr);
		ArrayList<String> ar = new ArrayList<String>();
		
		String data = null;
		int count = 1;
		while((data = br.readLine()) != null) {
			ar.add(data);
			count++;
		}
		fr.close();
		br.close();
		// 경선쓰가 알려준것 arrs[1].replaceAll("-","");  해당 문자를 바꿔줌
		String sum = null;
		String arr[] = new String[ar.size()];
		for (int i = 0; i < ar.size(); i++) {
			  arr[i] = ar.get(i);
			  String arrs[] = arr[i].split("[|]");		
			  String sub[] = arrs[1].split("-");
			  sum = arrs[0] + "("+sub[0]+sub[1]+sub[2]+")"+"\n";
			  arr[i] = sum;
		}
		//System.out.println(Arrays.toString(arr));
		
		//Path newfile = Paths.get("E:\\project\\example\\src\\main\\webapp\\cms_db.txt");
		//Files.createFile(newfile);
		
		FileWriter fw = new FileWriter("E:\\project\\example\\src\\main\\webapp\\cms_db.txt");
		for (String str : arr) {
			  fw.write(str);
		}
		fw.close();
		
		FileReader fr2 =  new FileReader("E:\\project\\example\\src\\main\\webapp\\cms_db.txt");
		BufferedReader bf = new BufferedReader(fr2);
		System.out.println(bf.readLine());
		System.out.println(bf.readLine());
		System.out.println(bf.readLine());
		System.out.println(bf.readLine());
		System.out.println(bf.readLine());
		System.out.println(bf.readLine());
		bf.close();
		fr2.close();
	}

}