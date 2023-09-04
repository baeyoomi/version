package example;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

// 2023 01 ~ 08 Backend 취업율
@WebServlet("/job_data.do")
public class job_data extends HttpServlet {
	private static final long serialVersionUID = 1L;
	PrintWriter pw = null;   

    public job_data() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("application/json; charset=utf-8");
		response.setHeader("Access-Control-Allow-Origin","*");
		this.pw = response.getWriter();
		
		try {			
			String key = request.getParameter("key").intern();
			if(key == null || key == "") {
				this.pw.write("key_error");
			}
			else if(key == "yumi") {
				String user[][] = {
						{"서울","경기도","인천","세종","그 외 기타"},
						{"386","426","98","42","378"},
						{"295","344","75","29","311"},
						{"91","82","23","13","67"}
				};
				JSONObject jo = new JSONObject();
				JSONArray ja = new JSONArray();
				
				int w = 0;
				do {
					int ww = 0;
					JSONObject jo2 = new JSONObject();
					while(ww < user.length) {	 //5
						if(ww==0) {
							jo2.put("kslee01", user[ww][w]);							
						}else if(ww==1){
							jo2.put("kslee02", user[ww][w]);
						}else if(ww==2){
							jo2.put("kslee03", user[ww][w]);
						}else if(ww==3){
							jo2.put("kslee04", user[ww][w]);
						}
						ww++;	
					}
					ja.add(jo2);
					w++;
				} while (w < user[0].length);  //4
				
				jo.put("backend", ja);
				System.out.println(jo);
				//this.pw.write("calldata("+jo.toString()+")");
				this.pw.write(jo.toString());
				this.pw.close();
			}
		}
		catch(Exception e) {
			System.out.println("오류");
		}
	}

}