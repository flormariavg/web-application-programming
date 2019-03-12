package edu.mum.wap;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Support
 */
@WebServlet("/support")
public class Support extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Support() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name =request.getParameter("name").toString();
		String email = request.getParameter("email").toString();
		
		
		System.out.println(name+ "  "+email);
		
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		
		PrintWriter out = response.getWriter();
		out.print("<html><head><title>Support Confirmation</title></head><body>Thank you! " +name+" for contacting us. We should receive reply "
				+ "from us with in 24 hrs in your email address "+ email+". Let us know in our support email [support email] "
				+ "if you don’t receive reply within 24 hrs. Please be sure to attach your reference "+Math.random()+"  in your email.<br/>" + 
				"		<ul><li>Support_email should come from context param.</li>" + 
				"		 <li>Support_ticket_id is generated automatically for every request.</li></ul></body></html>");
		
		
		
	}

}
