package urlrewritting;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Url2")
public class Url2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public Url2() {
        super();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String se1 = request.getParameter("s_id1");
		String se2 = request.getParameter("s_id2");
		out.print("<p><h1> Sessionid12: "+se1 +"</p></h1><br>");
		out.print("<p><h1> Sessionid: "+se2 +"</p></h1><br>");
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
