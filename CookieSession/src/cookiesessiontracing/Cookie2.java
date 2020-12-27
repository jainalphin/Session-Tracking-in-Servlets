package cookiesessiontracing;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Cookie2
 */
@WebServlet("/Cookie2")
public class Cookie2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Cookie2() {
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
		
		Cookie ck[]=request.getCookies();
		out.println("lenght of cookie..."+ck.length);
		for(int i=0;i<ck.length;i++)
		{
			out.println("<p>");
			out.println("cookie name..."+ck[i].getName()+"  cokkien value.."+ck[i].getValue());
			out.println("</p>");
		}
		Cookie c2 = new Cookie("c2","001");
		response.addCookie(c2);
		out.println("coockie added...."+c2.getName());
		out.print("<a href='Cookie3'>click</a>");
		
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

}
