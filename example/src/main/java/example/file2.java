package example;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;

/*
  응용문제 2
  해당 buffer.txt의 파일을 읽어 들인 후 배열로 내용을 저장 후
  짝수 배열 값만 출력 시키는 프로세서를 제작하시오.
  
  결과)
  출력확인 하는 중입니다...
  JAVA BufferReader 힘듬..
 */
public class file2 {

	public static void main(String[] args) {
		try {
			new notice().abc();
		}
		catch(Exception e) {
			System.out.println("파일 오류 입니다");
		}

	}

}

class notice {
	//Reader -> Buffered -> ArrayList       byte(x) 아스키 아니니까 필요없음
	//Stream -> BufferedStream -> ArrayList   byte(o) 바이너리임
	//Stream -> bufferedStreamReader -> Reader -> ArrayList  byte(o) stream이니까 바이너리임
	
	FileReader fr = null;
	BufferedReader br = null;
	ArrayList<String> ar = null;
	
	public void abc() throws Exception {
		String url = "E:\\project\\example\\src\\main\\webapp\\buffer.txt";
		this.fr = new FileReader(url);
		this.br = new BufferedReader(this.fr);
		this.ar = new ArrayList<String>();
		//System.out.println(this.br.readLine());
		String data = null;
		int count = 1;
		while((data = this.br.readLine()) != null) {
			if(count % 2 == 0) {
				this.ar.add(data);
			}
			count++;
		}
		System.out.println(this.ar);
		this.br.close();
		this.fr.close();
		
		
		/*
		FileReader fr = new FileReader("E:\\project\\example\\src\\main\\webapp\\buffer.txt");
		BufferedReader bf = new BufferedReader(fr);
		ArrayList<String> al = new ArrayList<String>();
		String as[] = new String[6];

		String line = "";
		while((line = bf.readLine()) != null) {
			al.add(line);
		}
		
		for(int i=0; i<al.size(); i++) {
			if(i%2 != 0) {
				String data = al.get(i);
				System.out.println(data);
			}
		}
		bf.close();
		fr.close();
		*/
	}
}