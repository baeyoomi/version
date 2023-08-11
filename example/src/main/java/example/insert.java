package example;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class insert extends HttpServlet {
	private static final long serialVersionUID = 1L;     
    public insert() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		//Enumeration<String> user = request.getParameterNames();
		//name 값이 1개 이상 동일한 사항일 경우, getParameterValues 메소드로 받아서 처리한다.
		String user[] = request.getParameterValues("user");
		//System.out.println(Arrays.toString(user));
		
		ArrayList<String> list = new ArrayList<String>();
		
		int w = 0;
		while(w < user.length) {
			if(user[w] != "") {
				list.add(user[w]);
			}
			w++;
		}
		System.out.println(list);
		
		/*
		for(int i=0; i<user.length;i++) {
			if(user[i] != "") {
				list.add(user[i]);
			}
		}
		System.out.println(list);
		*/
	}

}
