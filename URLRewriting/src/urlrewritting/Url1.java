package urlrewritting;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Url1")
public class Url1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public Url1() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String url="http://localhost:8089/URLRewriting/Url2?s_id1=50&s_id2=0555";
		out.println("<a href=http://localhost:8089/URLRewriting/Url2?s_id1=50&s_id2=0555>Next Page</a>");	
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
