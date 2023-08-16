package example;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class pwloss extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public pwloss() {
        super();
      
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		String usernm = request.getParameter("usernm").intern();
		String userid = request.getParameter("userid").intern();
		String userem = request.getParameter("userem").intern();
		
		String members[][] = {
				{"장진호","배유미","염무원","김승균","김경민","장진호","김경민"},
				{"jang_ho","bae_mi","number1","kim","min","ho","k_min"},
				{"jang_ho@nate.com","bae_mi@nate.com","number1@gmail.com","kim@nate.com","min@nate.com","ho@naver.com","k_min@gmail.com"},
				{"a1234","b1234","c1234","d1234","e1234","f1234","g1234"}
		};
		
		int ea = members[0].length;
		int w = 0;
		int count = 0;
		String msg = "";

/*		// 방법 1
		while(w < ea) {
			if(usernm == members[0][w]) {  
				if(userid == members[1][w]) {
					if(userem == members[2][w]) {
					count = 1;     
					msg = members[3][w];
					break;
					}
				}
				else {
					msg = "check";
				}
			}
			w++;
		}
		if(count==0) {   
			msg = "error";
		}
		PrintWriter pw = response.getWriter();
		pw.write(msg);
*/
  //방법 2		
		while(w < ea) {
			if(usernm == members[0][w] && userid == members[1][w] && userem == members[2][w]) {
				count = 1;					
				msg = members[3][w]; 
				break;
			}
			w++;
		}
		
		if(count==0) { 
			msg = "error";
		}		
		PrintWriter pw = response.getWriter();
		pw.write(msg);
		
/* 실패함	ㅎ
        for (String[] member : members) {
            if (member[0]==usernm && member[1]==userid && member[2]==userem) {
                count = 1;
                msg = member[3];
                break;
            }
        }

        if (count == 0) {
            msg = "error";
        }

        PrintWriter pw = response.getWriter();
        pw.write(msg);
*/        	
	}
}
