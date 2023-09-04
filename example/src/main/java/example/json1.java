package example;

import java.io.BufferedWriter;
import java.io.FileWriter;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
//JS14.html에서 사용한 data.json을 제작하여 활용하는 형태
/*
	json1.java에서 원시 배열값을 json으로 변환 후 front가 해당 데이터를
	ajax로 로드하여 웹 페이지에 출력하는 형태
*/
public class json1 {

	public static void main(String[] args) throws Exception {
		JSONObject jo = new JSONObject();  //키  //put만 사용 키만 생성
		JSONArray ja = new JSONArray();    //배열 //add만 사용, data를 생성
		//String user[] = {"2600","3200","1900"};
		int user[] = {2600,3200,1900};  //숫자형태 json 숫자로 데이터가 생성
		int w = 0;
		while(w < user.length) {
			//ja.add(user[w]); //키가 없는 형태의 배열
			JSONObject jo2 = new JSONObject();   //키 생성시 반복문으로 작동하면 객체 및 인스턴스를 새롭게 생성하면서 적용해야합니다
			jo2.put("product"+w, user[w]);   //("키이름",데이터값)
			ja.add(jo2);  //[] 배열화 적용
			w++;
		}
		jo.put("adata", ja); //키 생성, 키에 대한 '배열'데이터
		//System.out.println(jo);
		FileWriter fw = new FileWriter("E:\\project\\example\\src\\main\\webapp\\data.json",false);
		fw.write(jo.toString());
		//fw.write("ajax_data("+jo.toString()+")");  //배열 구조라서 toString으로 넣어줌, CORS를 해결하기 위한 함수 호출로 적용
		//BufferedWriter bw = new BufferedWriter(fw);
		//bw.write(jo.toString());
		//bw.flush();
		//bw.close();
		fw.close();
	}

}
