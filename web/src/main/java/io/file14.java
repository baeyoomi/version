package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

// I/O 응용편

/* 
	응용문제1
	해당 데이터를 파일로 저장 후 출력하는 프로세서를 제작하시오.
	"hong","kim","park","lee"
	"25","30","44","26"
	"홍길동","김유신","박찬호","이순신"
	
	파일에 저장 형태는 다음과 같습니다.
	홍길동:hong(25)
	김유신:kim(30)
	박찬호:park(44)
	이순신:lee(26)
	단, 파일명은 member_list.txt로 저장 되어 있어야 합니다.
 */
public class file14 {

	public static void main(String[] args) {
		try {
			test1 dt = new test1();
			dt.abc();
		}
		catch(Exception e) {
			System.out.println("파일 오류 발생 했습니다");
		}

	}

}

class test1{
	public void abc() throws Exception {
		/* 데이터 먼저 확인 */
		String members[][] = {
				{"hong","kim","park","lee"},
				{"25","30","44","26"},
				{"홍길동","김유신","박찬호","이순신"}
		};
		String member[] = new String[members[0].length];
		
		int answer = 0;
		do {
			member[answer] = members[2][answer] + ":" + members[0][answer] + "(" + members[1][answer] + ")"+"\n";
			answer++;
		}while(answer < members[0].length); 
		//System.out.println(Arrays.toString(member));
		
		/* 파일 생성 */
		//Path data = Paths.get("E:\\project\\web\\src\\main\\webapp\\member_list.txt");
		//Files.createFile(data);

		/* 입출력 */
		OutputStream os = new FileOutputStream("E:\\project\\web\\src\\main\\webapp\\member_list.txt");
		byte[] bb;
		for(int i=0; i<member.length; i++) {
			bb = member[i].getBytes();
			os.write(bb);
		}
		os.flush();
		os.close();	
		
		InputStream is = new FileInputStream("E:\\project\\web\\src\\main\\webapp\\member_list.txt");
		byte temp[] = new byte[is.available()];
		int ea = is.read(temp);
		String data = new String(temp,"UTF-8");
		System.out.println(data);
		is.close();
	}
}