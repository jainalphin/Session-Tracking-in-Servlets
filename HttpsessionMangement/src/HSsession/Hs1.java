package HSsession;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Hs1")
public class Hs1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public Hs1() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String id=request.getParameter("id");
		String pwd =request.getParameter("pwd");
		RequestDispatcher rd;
		if(id.equals("aa") && pwd.equals("aa"))
		{
			HttpSession hs1=request.getSession();
			hs1.setAttribute("s_id", id);
			out.println("<h1>HttpSession1 added...."+hs1.getAttribute("s_id"));
			out.print("<br><a href='Hs2'>click</a></h1>");
		}
		else
		{
			out.print("<p><h1>Incorrect pwd</p></h1>");
			rd=request.getRequestDispatcher("/index.html");
			rd.forward(request, response);
		}
	}

}
