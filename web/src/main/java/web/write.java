package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

@MultipartConfig(
		fileSizeThreshold = 1024 * 1024 * 1,
		maxFileSize = 1024 * 1024 * 10,
		maxRequestSize = 1024 * 1024 * 100
)
public class write extends HttpServlet {
	private static final long serialVersionUID = 1L;
    dbconfig db = null;
    PreparedStatement ps = null;      
    public write() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		Part file = request.getPart("file");
		/* file.getName() :name값명 / file.getSize() : 파일사이즈 / file.getContentType() : 파일에 대한 속성 */
		//System.out.println(file.getSubmittedFileName()); //파일 이름
		String filenm = file.getSubmittedFileName().intern();
		if(filenm != "") {
			System.out.println("첨부파일 없음");
		}
		else {
			System.out.println("첨부파일 있음");
			//Path data = Paths.get("파일경로");
		}
		
		
		/*
		String title =  request.getParameter("btitle").intern();
		String name =  request.getParameter("bname").intern();
		String pass =  request.getParameter("btitle").intern();
		//String file =  request.getParameter("bfile").intern();
		String text =  request.getParameter("btext").intern();
		
		PrintWriter pw = response.getWriter();
		
		this.db = new dbconfig();
		try {
			Connection con = db.dbinfo(); 
			
			String sql = "insert into notice values ("+"'0',?,?,password(?),?,?,?,now(),'Y')";
			
		}
		catch(Exception e) {
			System.out.println("DB 접속 오류 사항 발생!");
		}
		*/
	}

}

