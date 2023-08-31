package web;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
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
		//String filenm = file.getSubmittedFileName().intern();		
		
		//날짜 => 파일 업로드 같은 이름일 경우 덮어쓰는 현상을 막기 위해서 사용함
		Date time = new Date();
		SimpleDateFormat sf = new SimpleDateFormat("yyyyMMddHHmmss");
		String timetext = sf.format(time);
		
		//첨부파일 용량
		int filesize = (int)file.getSize();
		
		//첨부파일 저장공간
		String savepath = request.getServletContext().getRealPath("/board/upload/");
		//업로드시 사용하는 파일명
		String filename = timetext + "_" +file.getSubmittedFileName();
		//실제 저장되는 형태
		String uploadfile = savepath + filename;
		//[Stream으로 첨부파일 처리]
		InputStream is = file.getInputStream();  //스트림으로 변환
		FileOutputStream fs = new FileOutputStream(uploadfile);
		
		if(filesize == 0) {  //첨부파일이 없을때의 SQL
			
		}
		else {
			byte[] buf = new byte[is.available()]; //첨부한만큼의 값
			int size = 0 ;
			while((size = is.read(buf)) != -1) {
				fs.write(buf,0,size);
				fs.flush(); //불안하니 쓰자~
			}
			fs.close();
			is.close();
		}
		//경로지정 (DB에 저장되는 결로와 같음)
		String dbfile = "./upload/" + filename;
		
		//View호 출력(view.jsp 전달)   파일올리면 view.jsp로 이동함
		request.setAttribute("dbfile", dbfile);
		RequestDispatcher ds = request.getRequestDispatcher("./view.jsp");
		ds.forward(request, response);
		
		String title =  request.getParameter("subject").intern();
		String name =  request.getParameter("writer").intern();
		String pass =  request.getParameter("pass").intern();
		String text =  request.getParameter("texts").intern();
		
		PrintWriter pw = response.getWriter();
		
		this.db = new dbconfig();
		try {
			Connection con = db.dbinfo(); 
			
			String sql = "insert into notice values ('0',?,?,now(),'0','test',password(?),?,?)";
			this.ps = con.prepareStatement(sql);
			this.ps.setString(1, title);
			this.ps.setString(2, name);
			this.ps.setString(3, pass);
			this.ps.setString(4, dbfile);
			this.ps.setString(5, text);

			int call = this.ps.executeUpdate();
			String msg ="";
			String msg2 ="";
			String msg3 ="";
			if(call > 0) {
				msg = "정상적으로 저장되었습니다.";
				msg2 = "list";
				msg3 ="";
			}else {
				msg = "저장되지 않았습니다 다시 확인해주세요.";
				msg2 = "write";
				msg3 = "history.go(-1);";
			}
			pw.write("<script>alert('"+msg+"'); location.href='./"+msg2+".html';"+msg3+"</script>");
			//System.out.println(sql);
			this.ps.close();
			con.close();
			pw.close();
		}
		catch(Exception e) {
			System.out.println("DB 접속 오류 사항 발생!");
		}
		
	}

}
