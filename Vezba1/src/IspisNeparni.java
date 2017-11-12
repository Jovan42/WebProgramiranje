

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class IspisNeparni
 */
public class IspisNeparni extends HttpServlet implements Servlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public IspisNeparni() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		ArrayList<String> firstNames = HelloWorld.getFirstNames();
		ArrayList<String> lastNames = HelloWorld.getLastNames();
		
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
			out.println("<title>Vezba 1</title>");
		out.println("</head>");
			out.println("<body>");
			
			out.println("<p>");
				out.println("Hello World");
			out.println("</p>");
			
			
			for (String firstName : firstNames) {
				if(firstNames.indexOf(firstName) % 2 != 1) {
				out.println("<p>");
				out.println("First Name: " + firstName);
				out.println("First Name: " + lastNames.get(firstNames.indexOf(firstName)));
				out.print("</br>");
				}
			}
			out.println("</body>");
		out.println("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
