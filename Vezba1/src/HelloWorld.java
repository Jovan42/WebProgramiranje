

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.jasper.tagplugins.jstl.core.Out;

/**
 * Servlet implementation class HelloWorld
 */
public class HelloWorld extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static ArrayList<String> firstNames = new ArrayList<String>();
	private static ArrayList<String> lastNames = new ArrayList<String>();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloWorld() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		if(request.getParameter("firstName") != null || request.getParameter("lastName") != null) {
			firstNames.add(request.getParameter("firstName"));
			lastNames.add(request.getParameter("lastName"));
		}
		
		response.sendRedirect("./IspisParni");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */ 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

	public static ArrayList<String> getFirstNames() {
		return firstNames;
	}

	public void setFirstNames(ArrayList<String> firstNames) {
		HelloWorld.firstNames = firstNames;
	}

	public static ArrayList<String> getLastNames() {
		return lastNames;
	}

	public void setLastNames(ArrayList<String> lastNames) {
		HelloWorld.lastNames = lastNames;
	}

}
