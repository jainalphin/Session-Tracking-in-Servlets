package HSsession;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Hs3
 */
@WebServlet("/Hs3")
public class Hs3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Hs3() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		HttpSession hs1=request.getSession(false);
	
		out.println("<h1>HttpSession3 added<br>Hello again...."+hs1.getAttribute("s_id"));
		out.print("<form action='hs4' method='post'>");
		out.print("<input type='submit' value='end session'></form>");
		hs1.invalidate();
		//out.print("<br><a href='Hs3'>click</a></h1>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		/*response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		HttpSession hs1=request.getSession(false);
	
		out.println("<h1>HttpSession2 added<br>Hello again...."+hs1.getAttribute("s_id"));
		out.print("<form action='Hs4' method='post'>");
		out.print("<input type='submit' value='end session'></form>");
		hs1.invalidate();
		//out.print("<br><a href='Hs3'>click</a></h1>");*/
	}

}
