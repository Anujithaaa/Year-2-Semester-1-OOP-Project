/*package anujitha;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ContactDisplay")
public class ContactDisplay extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("NameS");
		String email = request.getParameter("EmailS");
		String sub = request.getParameter("SubjectS");
		String message = request.getParameter("MessageS");
		
		try {
			List<contact> contactDetails = databaseutil.displayInsert(name, email, sub, message);
			request.setAttribute("contactDetails", contactDetails);
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
		
		RequestDispatcher req = request.getRequestDispatcher("home.jsp");
		req.forward(request, response);
		
		
	}

}*/

package anujitha;

import java.io.IOException;

import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/update")
public class ContactDisplay extends HttpServlet {
	private static final long serialVersionUID = 1231231231231L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("NameS");
		String email = request.getParameter("EmailS");
		String sub = request.getParameter("SubjectS");
		String message = request.getParameter("MessageS");
		
		boolean isTrue;
		isTrue = databaseutil.updateContact(name, email, sub, message);
		
		if(isTrue==true) {
			List<contact> EmpDetails = databaseutil.getContactDetails(email);
			request.setAttribute("levDetails", EmpDetails);
			response.setContentType("text/html");
			
			PrintWriter out=response.getWriter();
			
			out.println("<meta http-equiv='refresh' content='3;URL=home.jsp'>"); //redirects after 3 seconds
			out.println("<p style='color:red;'>Data Successfully updated!</p>");
		}
		else {
			RequestDispatcher dis = request.getRequestDispatcher("unsuccess.jsp");
			dis.forward(request, response);
		}
	}

}
